package com.greenBottle.servlet;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.greenBottle.bean.Client;
import com.greenBottle.dao.ClientDao;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		boolean isClient = false;
		try {
			isClient = ClientDao.isClient(username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(isClient){
			try {
				Client client = new Client();
				client = ClientDao.getClientByMailAndPassword(username, password);
				HttpSession session = request.getSession();
				session.setAttribute("client", client);
				response.sendRedirect("accueil.jsp");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		else{
			response.sendRedirect("index.jsp");
			
		}
		
		//doGet(request, response);
	}

}
