package ecole;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.Encryption;
import util.Utils;
import ecole.dao.EleveDAO;
import ecole.pojo.Eleve;

/**
 * Servlet implementation class AdminServlet
 */
@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdminServlet() {
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
		EleveDAO eleveDao = new EleveDAO();
		List<Eleve> list = new ArrayList<Eleve>();
		// handle actions
		if (action != null) {
			if (action .equals("list")) {
				list = eleveDao.getAll();
				Utils.jsonEncodeListRecords(response, list);
			} else if (action .equals("create")) {
				Eleve eleve=new Eleve();
				eleve.setNom(request.getParameter("nom"));
				eleve.setPrenom(request.getParameter("prenom"));
				eleve.setEmail(request.getParameter("email"));
				eleve.setPoids(Integer.parseInt(request.getParameter("poids")));
				eleve.setAnnee(Integer.parseInt(request.getParameter("annee")));
				eleve.setMdp(Encryption.encrypt(request.getParameter("mdp")));
				eleve=eleveDao.create(eleve);
				Utils.jsonEncodeRecord(response,eleve);
			} else if (action .equals("update")) {
				int id= Integer.parseInt(request.getParameter("id"));
				Eleve eleve=eleveDao.find(id);
				eleve.setNom(request.getParameter("nom"));
				eleve.setPrenom(request.getParameter("prenom"));
				eleve.setEmail(request.getParameter("email"));
				eleve.setPoids(Integer.parseInt(request.getParameter("poids")));
				eleve.setAnnee(Integer.parseInt(request.getParameter("annee")));
				eleve=eleveDao.update(eleve);
				Utils.jsonEncodeOK(response);

			} else if (action .equals("delete")){
				int id= Integer.parseInt(request.getParameter("id"));
				Eleve eleve=new Eleve();
				eleve.setId(id);
				eleveDao.delete(eleve);
				Utils.jsonEncodeOK(response);
			}
		}
	}

}
