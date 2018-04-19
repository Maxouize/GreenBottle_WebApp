package com.greenBottle.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.greenBottle.bean.Client;
import com.greenBottle.bean.Retrait;
import com.greenBottle.dao.RetraitDao;

/**
 * Servlet implementation class consulterDemandeServlet
 */
@WebServlet("/consulterDemandeServlet")
public class consulterDemandeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public consulterDemandeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		List<Retrait> listeRetraits = new ArrayList<Retrait>();
		Client monClient = new Client();
		monClient = (Client) request.getSession().getAttribute("client");
		try {
			listeRetraits = (List<Retrait>)RetraitDao.getRetraitsFromClientId(monClient);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.getSession().setAttribute("listeRetraits", listeRetraits);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}