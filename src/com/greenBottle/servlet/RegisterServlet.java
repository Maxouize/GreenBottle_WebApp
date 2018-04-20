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
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
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
		Client nouveauClient = new Client();
		nouveauClient.setNom(request.getParameter("nom"));
		nouveauClient.setPrenom(request.getParameter("prenom"));
		nouveauClient.setAdresseMail(request.getParameter("mail"));
		nouveauClient.setPassword(request.getParameter("password"));
		nouveauClient.setNumeroAdresse(Integer.parseInt(request.getParameter("numero")));
		nouveauClient.setNomVoie(request.getParameter("adresse"));
		nouveauClient.setVille(request.getParameter("ville"));
		nouveauClient.setCodePostal(request.getParameter("codePostal"));
		try {
			ClientDao.addClient(nouveauClient);
			request.setAttribute("clientInvalide", "Compte créé avec succès. Veuillez vous connecter");
			
		} catch (SQLException e) {
			request.setAttribute("clientInvalide", "Erreur lors de la création de compte, veuillez reessayer!");
			e.printStackTrace();
		}
		request.getRequestDispatcher("modifierProfil.jsp").forward(request, response);

		
		
	}

}
