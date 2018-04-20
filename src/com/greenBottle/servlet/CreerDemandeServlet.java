package com.greenBottle.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.greenBottle.bean.Client;
import com.greenBottle.bean.Retrait;
import com.greenBottle.dao.RetraitDao;

/**
 * Servlet implementation class CreerDemandeServlet
 */
@WebServlet("/CreerDemandeServlet")
public class CreerDemandeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreerDemandeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Retrait retrait = new Retrait();
		Client monClient = new Client();
		monClient = (Client)request.getSession().getAttribute("client");
		retrait.setDateRetrait(request.getParameter("dateRetrait"));
		retrait.setHeureRetrait(request.getParameter("heureRetrait"));
		retrait.setPoids(Integer.parseInt(request.getParameter("poidsRetrait")));
		retrait.setStatut(request.getParameter("statutRetrait"));
		retrait.setCommentaire(request.getParameter("commentaireRetrait"));
		retrait.setStatut("en attente");
		try {
			RetraitDao.createRetrait(retrait, monClient);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect(request.getContextPath() + "/consultation");
	}

}
