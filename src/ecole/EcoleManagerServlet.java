package ecole;

import util.HibernateUtil;
import javax.servlet.http.*;
import javax.servlet.ServletException;
import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;


public class EcoleManagerServlet extends HttpServlet {
      //private final SimpleDateFormat dateFormatter = new SimpleDateFormat("dd.MM.yyyy");

    protected void doGet(HttpServletRequest request,HttpServletResponse response)
            throws ServletException, IOException {

        try {
            // Begin unit of work
            HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction(); //créer une session

            // Write HTML header
            PrintWriter out = response.getWriter(); 
            out.println("<html><head><title>Bienvenue sur notre Portail pédagogique TGSchool ! </title></head><body>");

          
            // Print page
            printSchool(out);
            listEleves(out);

            // Write HTML footer
            out.println("</body></html>");
            out.flush();
            out.close();

            // End unit of work
            HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();

        } catch (Exception ex) {
            HibernateUtil.getSessionFactory()
                    .getCurrentSession().getTransaction().rollback();
            throw new ServletException(ex);
        }
    }

    private void printSchool(PrintWriter out) {
        out.println("<h2>Azul  :</h2>");
       
     
    }

    private void listEleves(PrintWriter out)
{
        List result = HibernateUtil.getSessionFactory().getCurrentSession().createCriteria(Eleves.class).list();


        if (result.size() > 0) 
         {
            out.println("<h2>La liste des Elèves :</h2>");
            out.println("<table border='1'>");
            out.println("<tr>");
            out.println("<th>Numéro</th>");
            out.println("<th>Nom</th>");
	        out.println("<th>Prénom </th>");
            out.println("</tr>");
            for (Iterator it = result.iterator(); it.hasNext();)
		{
                Eleves e = (Eleves) it.next();
                out.println("<tr>");
                out.println("<td>" + e.getId() + "</td>");
                out.println("<td>" + e.getNom() + "</td>");
		out.println("<td>" + e.getPrenom() + "</td>");
                out.println("</tr>");
                }
            out.println("</table>");
	   out.println("la liste des eleves " + result.size() );
         }
   }

	/*    private void listProfesseurs(PrintWriter out){
        List result = HibernateUtil.getSessionFactory().getCurrentSession().createCriteria(Professeurs.class).list();
        if (result.size() > 0) {
            out.println("<h2>La liste des professeurs :</h2>");
            out.println("<table border='1'>");
            out.println("<tr>");
            out.println("<th>Numéro</th>");
            out.println("<th>Nom</th>");
	     out.println("<th>Prénom </th>");
            out.println("</tr>");
            for (Iterator it = result.iterator(); it.hasNext();) {
                Professeurs p = (Professeurs) it.next();
                out.println("<tr>");
                out.println("<td>" + Professeurs.getId() + "</td>");
                out.println("<td>" + Professeurs.getNom() + "</td>");
		
                out.println("</tr>");
            }
            out.println("</table>");
		out.println("la liste des professeurs " + result.size() );
        }
    }
     
          private void listCours(PrintWriter out){
        List result = HibernateUtil.getSessionFactory().getCurrentSession().createCriteria(Cours.class).list();
        if (result.size() > 0) {
            out.println("<h2>La liste des cours:</h2>");
            out.println("<table border='1'>");
            out.println("<tr>");
            out.println("<th>Numéro</th>");
            out.println("<th>Nom</th>");
	     out.println("<th>Prénom </th>");
            out.println("</tr>");
            for (Iterator it = result.iterator(); it.hasNext();) {
                Cours p = (Cours) it.next();
                out.println("<tr>");
                out.println("<td>" + Cours.getId() + "</td>");
                out.println("<td>" + Cours.getNom() + "</td>");
	        out.println("</tr>");
            }
            out.println("</table>");
        }
    }


		     
          private void listActivitees(PrintWriter out){
        List result = HibernateUtil.getSessionFactory().getCurrentSession().createCriteria(Activitees.class).list();
        if (result.size() > 0) {
            out.println("<h2>La liste des activitees:</h2>");
            out.println("<table border='1'>");
            out.println("<tr>");
             
            out.println("<th>Nom</th>");
	     out.println("<th>Prénom </th>");
            out.println("</tr>");
            for (Iterator it = result.iterator(); it.hasNext();) {
                Cours p = (Cours) it.next();
                out.println("<tr>");
                out.println("<td>" + Cours.getId() + "</td>");
                out.println("<td>" + Cours.getNom() + "</td>");
	        out.println("</tr>");
            }
            out.println("</table>");
        }
    }*/

















}
