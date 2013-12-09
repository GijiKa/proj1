package ecole;

import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import ecole.dao.EleveDAO;
import ecole.dao.ProfesseurDAO;
import ecole.pojo.Eleve;
import ecole.pojo.Professeur;
import util.HibernateUtil;
import util.Encryption;
public class AuthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AuthServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		try {
			EleveDAO eleveDAO = new EleveDAO();
			ProfesseurDAO professeurDAO= new ProfesseurDAO();
			HibernateUtil.getSessionFactory().getCurrentSession()
					.beginTransaction();

			String email = (String) request.getParameter("email");
			String passwd = (String) request.getParameter("passwd");

			Eleve eleve=eleveDAO.getByEmail(email);

			Professeur professeur=professeurDAO.getByEmail(email);
         
			if (eleve!=null && eleve.getMdp().equals(Encryption.encrypt(passwd) )) {
			   
				System.out.println("Nom de l'eleve: " + eleve.getNom());

				HttpSession s = request.getSession();
				s.setAttribute("section", eleve);

				response.sendRedirect("eleves.jsp");

			}

			else 
				if (professeur!=null && professeur.getMdp().equals(Encryption.encrypt(passwd) )) {

					System.out.println(" ok");
					
					System.out.println("Nom du professeur : " + professeur.getNom());
					HttpSession s = request.getSession();
					s.setAttribute("section", professeur);

					if (professeur.getRole() == 1) {

						System.out.println("Professeur");

						response.sendRedirect("prof.jsp");

					} else {

						response.sendRedirect("admin.jsp");

					}
				
				} else {
					// RequestDispatcher dispatcher =
					// request.getRequestDispatcher("index.jsp");
					// dispatcher.forward(request, response);
					System.out.println(" utilisateur non disponible ");
					response.sendRedirect("indexEchec.jsp");
				}


		} catch (Exception ex) {

			throw new ServletException(ex);
		}
	}
}
