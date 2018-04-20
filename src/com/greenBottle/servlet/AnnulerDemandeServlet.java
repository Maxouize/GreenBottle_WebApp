package com.greenBottle.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.greenBottle.bean.Retrait;
import com.greenBottle.dao.RetraitDao;

/**
 * Servlet implementation class AnnulerDemandeServlet
 */
@WebServlet("/AnnulerDemandeServlet")
public class AnnulerDemandeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AnnulerDemandeServlet() {
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
		System.out.println(request.getParameter("idRetrait"));
		retrait.setId(Integer.parseInt(request.getParameter("idRetrait")));
        retrait.setStatut("Annulé");
		try {
			RetraitDao.updateRetrait(retrait);
			response.sendRedirect("/ConsulterDemandeServlet");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
