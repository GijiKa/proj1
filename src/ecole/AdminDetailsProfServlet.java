package ecole;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.Utils;
import ecole.dao.CoursDAO;
import ecole.dao.ProfesseurDAO;
import ecole.pojo.Cours;
import ecole.pojo.Professeur;

/**
 * Servlet implementation class AdminDetailsProf
 */
@WebServlet("/AdminDetailsProf")
public class AdminDetailsProfServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminDetailsProfServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		int id_prof= Integer.parseInt(request.getParameter("id_prof"));
		ProfesseurDAO professeurDAO= new ProfesseurDAO(); 
		CoursDAO coursDao = new CoursDAO();
		List<Cours> list = new ArrayList<Cours>();
		// handle actions
		if (action != null) {		
			if (action .equals("list")) {
				list = professeurDAO.getAllCours(id_prof);
				Utils.jsonEncodeListRecords(response, list);
			} else if (action .equals("create")) {
				Cours cours=new Cours();
		
				cours.setNom(request.getParameter("nom"));
				cours.setNb_heures(Integer.parseInt(request.getParameter("nb_heures")));
				cours.setAnnee(Integer.parseInt(request.getParameter("annee")));
				Professeur professeur=professeurDAO.find(id_prof);
				professeur.addCours(cours);
				cours=coursDao.create(cours);
				professeurDAO.update(professeur);
				
				Utils.jsonEncodeRecord(response,cours);
			} else if (action .equals("update")) {
				int id= Integer.parseInt(request.getParameter("id"));
				Cours cours=coursDao.find(id);
				cours.setNom(request.getParameter("nom"));
			
				cours.setNb_heures(Integer.parseInt(request.getParameter("nb_heures")));
				cours.setAnnee(Integer.parseInt(request.getParameter("annee")));
				cours=coursDao.update(cours);
				Utils.jsonEncodeOK(response);

			} else if (action .equals("delete")){
				int id= Integer.parseInt(request.getParameter("id"));
				Cours cours=new Cours();
				cours.setId(id);
				Professeur professeur=professeurDAO.find(id_prof);
				professeur.removeCours(cours);
				professeurDAO.update(professeur);
				Utils.jsonEncodeOK(response);
			}
		}
		// TODO Auto-generated method stub
	}

}
