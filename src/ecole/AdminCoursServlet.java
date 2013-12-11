
package ecole;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.Encryption;
import util.Utils;
import ecole.dao.CoursDAO;
import ecole.dao.ProfesseurDAO;
import ecole.pojo.Cours;
import ecole.pojo.Professeur;
import ecole.pojo.Resultat;

/**
 * Servlet implementation class AdminServlet
 */
@WebServlet("/AdminServlet")
public class AdminCoursServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdminCoursServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		CoursDAO coursDAO = new CoursDAO();
		ProfesseurDAO professeurDAO = new ProfesseurDAO();
		List<Cours> list = new ArrayList<Cours>();
		// handle actions
		if (action != null) {
			if(action.equals("options")){
				list = coursDAO.getAll();
				Utils.jsonEncodeOptions(response, list,"id","nom");
			} else if (action .equals("list")) {
				list = coursDAO.getAll();
				Utils.jsonEncodeListRecords(response, list);
			} else if (action .equals("create")) {
				Cours cours=new Cours();
				cours.setNom(request.getParameter("nom"));
				cours.setNb_heures(Integer.parseInt(request.getParameter("nb_heures")));
				cours.setAnnee(Integer.parseInt(request.getParameter("annee")));

				cours=coursDAO.create(cours);
				Utils.jsonEncodeRecord(response,cours);
			} else if (action .equals("update")) {
				int id= Integer.parseInt(request.getParameter("id"));
				Cours cours=coursDAO.find(id);
				cours.setNom(request.getParameter("nom"));
			
				cours.setNb_heures(Integer.parseInt(request.getParameter("nb_heures")));
				cours.setAnnee(Integer.parseInt(request.getParameter("annee")));
				cours=coursDAO.update(cours);
				Utils.jsonEncodeOK(response);

			} else if (action .equals("delete")){
				int id= Integer.parseInt(request.getParameter("id"));
				Cours cours=new Cours();
				cours.setId(id);
				List<Professeur> professeurs=professeurDAO.getAll();
				for (Professeur professeur : professeurs) {
					professeur.removeCours(cours);
					professeurDAO.update(professeur);
				}
				
				coursDAO.delete(cours);
				Utils.jsonEncodeOK(response);
			}
		}
	}

}