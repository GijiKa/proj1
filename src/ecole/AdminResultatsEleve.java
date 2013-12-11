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
import ecole.dao.EleveDAO;
import ecole.dao.ProfesseurDAO;
import ecole.dao.ResultatDAO;
import ecole.pojo.Cours;
import ecole.pojo.Eleve;
import ecole.pojo.Professeur;
import ecole.pojo.Resultat;
import ecole.pojo.ResultatsId;

/**
 * Servlet implementation class AdminResultatsEleve
 */
@WebServlet("/AdminResultatsEleve")
public class AdminResultatsEleve extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminResultatsEleve() {
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
		int id_eleve= Integer.parseInt(request.getParameter("id_eleve"));
		EleveDAO eleveDAO= new EleveDAO(); 
		ResultatDAO resultDAO = new ResultatDAO();
		List<Resultat> list = new ArrayList<Resultat>();
		Eleve eleve=eleveDAO.find(id_eleve);
		// handle actions
		if (action != null) {		
			if (action .equals("list")) {
				list = eleveDAO.getAllResultats(id_eleve) ;
				Utils.jsonEncodeListRecords(response, list);
			} else if (action .equals("create")) {
				Resultat resultat=new Resultat();
				int id_cours=Integer.parseInt(request.getParameter("id_cours"));
				ResultatsId resultatId=new ResultatsId(eleve, id_cours);
				resultat.setNote(Integer.parseInt(request.getParameter("note")));
				resultat.setId(resultatId);
				eleve.addResultat(resultat);
				resultDAO.create(resultat);
				eleveDAO.update(eleve);
				resultat.setId(new ResultatsId(new Eleve(), resultat.getId_cours()));
				Utils.jsonEncodeRecord(response,resultat);
			} else if (action .equals("update")) {
				int id_cours= Integer.parseInt(request.getParameter("id_cours"));
				ResultatsId resultatsId=new ResultatsId(eleve, id_cours);
				Resultat resultat=resultDAO.find(resultatsId);
				resultat.setNote(Integer.parseInt(request.getParameter("note")));
				resultat=resultDAO.update(resultat);
				Utils.jsonEncodeOK(response);
			} else if (action .equals("delete")){
				int id_cours= Integer.parseInt(request.getParameter("id_cours"));
				ResultatsId resultatsId=new ResultatsId(eleve, id_cours);
				Resultat resultat=resultDAO.find(resultatsId);
				resultDAO.delete(resultat);
				Utils.jsonEncodeOK(response);
			}
		}
		// TODO Auto-generated method stub
	
	}

}
