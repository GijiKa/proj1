package ecole;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.Encryption;
import util.Utils;
import ecole.dao.ProfesseurDAO;
import ecole.pojo.Professeur;

/**
 * Servlet implementation class AdminServlet
 */
@WebServlet("/AdminServlet")
public class AdminProfServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdminProfServlet() {
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
		ProfesseurDAO professeurDao = new ProfesseurDAO();
		List<Professeur> list = new ArrayList<Professeur>();
		// handle actions
		if (action != null) {
		
			if (action .equals("list")) {
				list = professeurDao.getAll();
				Utils.jsonEncodeListRecords(response, list);
			} else if (action .equals("create")) {
				Professeur professeur=new Professeur();
				professeur.setNom(request.getParameter("nom"));
				professeur.setSpecialite(request.getParameter("specialite"));
				String str1= request.getParameter("date_entree");
				String str2= request.getParameter("der_prom");
				DateFormat formatter ; 
				Date date1=null,date2=null ; 
				   formatter = new SimpleDateFormat("MMM dd, yyyy");
				   try {
					if(str1!=null)
						date1 = formatter.parse(str1);
					if(str2!=null)
						date2 = formatter.parse(str2);
					professeur.setDate_entree(date1);
					professeur.setDer_prom(date2);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				professeur.setSalaire_actuel(Integer.parseInt(request.getParameter("salaire_actuel")));
				professeur.setSalaire_base(Integer.parseInt(request.getParameter("salaire_base")));
				professeur.setRole(Integer.parseInt(request.getParameter("role")));
			
				professeur.setEmail(request.getParameter("email"));
			
				professeur.setMdp(Encryption.encrypt(request.getParameter("mdp")));
				professeur=professeurDao.create(professeur);
				Utils.jsonEncodeRecord(response,professeur);
			} else if (action .equals("update")) {
				int id= Integer.parseInt(request.getParameter("id"));
				Professeur professeur=professeurDao.find(id);
				professeur.setSpecialite(request.getParameter("specialite"));
				String str1= request.getParameter("date_entree");
				System.out.print("++++++++++"+ str1);
				String str2= request.getParameter("der_prom");
				DateFormat formatter ; 
				Date date1=null,date2=null ; 
				   formatter = new SimpleDateFormat("MMM dd, yyyy");
				   try {
					if(str1!=null)
						date1 = formatter.parse(str1);
					if(str2!=null)
						date2 = formatter.parse(str2);
					professeur.setDate_entree(date1);
					professeur.setDer_prom(date2);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				professeur.setSalaire_actuel(Integer.parseInt(request.getParameter("salaire_actuel")));
				professeur.setSalaire_base(Integer.parseInt(request.getParameter("salaire_base")));
			
				professeur.setEmail(request.getParameter("email"));
			
				
				professeur=professeurDao.update(professeur);
				Utils.jsonEncodeOK(response);

			} else if (action .equals("delete")){
				int id= Integer.parseInt(request.getParameter("id"));
				Professeur professeur=new Professeur();
				professeur.setId(id);
				professeurDao.delete(professeur);
				Utils.jsonEncodeOK(response);
			}
		}
	}

}
