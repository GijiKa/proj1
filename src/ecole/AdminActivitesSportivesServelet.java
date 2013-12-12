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
import ecole.dao.ActiviteDAO;
import ecole.dao.ActiviteDAO;
import ecole.dao.ProfesseurDAO;
import ecole.pojo.Activite;
import ecole.pojo.Activite;
import ecole.pojo.ActiviteId;
import ecole.pojo.Professeur;

/**
 * Servlet implementation class AdminActivitesSportivesServelet
 */
@WebServlet("/AdminActivitesSportivesServelet")
public class AdminActivitesSportivesServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminActivitesSportivesServelet() {
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
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		ActiviteDAO activiteDAO = new ActiviteDAO();
		List<Activite> list = new ArrayList<Activite>();
		// handle actions
		if (action != null) {
			
			 if (action.equals("list")) {
				list = activiteDAO.getAll();
				Utils.jsonEncodeListRecords(response, list);
			} else if (action .equals("create")) {
				Activite activite=new Activite();	
				ActiviteId id= new ActiviteId(Integer.parseInt(request.getParameter("niveau")),request.getParameter("nom"));
				activite.setId(id);
				activite.setNom(request.getParameter("nom"));
				activite.setNiveau(Integer.parseInt(request.getParameter("niveau")));
				activite.setEquipe(request.getParameter("equipe"));
				activite=activiteDAO.create(activite);
				Utils.jsonEncodeRecord(response,activite);
			} else if (action .equals("update")) {
				int id= Integer.parseInt(request.getParameter("id"));
				Activite activite=activiteDAO.find(id);
				activite.setNom(request.getParameter("nom"));
			
				activite.setNiveau(Integer.parseInt(request.getParameter("niveau")));
				activite.setEquipe(request.getParameter("equipe"));
				activite=activiteDAO.update(activite);
				Utils.jsonEncodeOK(response);

			} else if (action .equals("delete")){
				int niveau= Integer.parseInt(request.getParameter("niveau"));
				String nom= request.getParameter("nom");
				ActiviteId id= new ActiviteId(niveau,nom);
				Activite activite=new Activite();
				activite.setId(id);
				activiteDAO.delete(activite);
				Utils.jsonEncodeOK(response);
			}
		}
	}

}
