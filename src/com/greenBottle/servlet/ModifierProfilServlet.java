package com.greenBottle.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.greenBottle.bean.Client;
import com.greenBottle.dao.ClientDao;

/**
 * Servlet implementation class ModifierProfilServlet
 */
@WebServlet("/ModifierProfilServlet")
public class ModifierProfilServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifierProfilServlet() {
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
		Client client = (Client)request.getSession().getAttribute("client");
		client.setNom(request.getParameter("nom"));
		client.setPrenom(request.getParameter("prenom"));
		client.setAdresseMail(request.getParameter("mail"));
		client.setNumeroAdresse(Integer.parseInt(request.getParameter("numero")));
		if("" != request.getParameter("password")){
			client.setPassword(request.getParameter("password"));
		}
		{
			client.setPassword(client.getPassword());
		}
		client.setNomVoie(request.getParameter("adresse"));
		client.setVille(request.getParameter("ville"));
		client.setCodePostal(request.getParameter("codePostal"));
		try {
			ClientDao.updateClient(client);
			request.setAttribute("clientInvalide", "Profil mis à jour avec succès");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.getRequestDispatcher("modifierProfil.jsp").forward(request, response);
	}

}
