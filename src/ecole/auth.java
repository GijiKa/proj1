package ecole;
import java.io.IOException;
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




import util.HibernateUtil;



public class auth extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public auth()
    {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
        try {
            
        	 HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
        	 
             PrintWriter out = response.getWriter(); 
             String email= (String)request.getParameter("email");
             String passwd= (String)request.getParameter("passwd");
              int idE, idP,idA ;
              
             System.out.print("OKKKK"+ email);
             Session session=HibernateUtil.getSessionFactory().getCurrentSession();
             
             session.beginTransaction();
             Eleves eleve ;
             Criteria criteria =session.createCriteria(Eleves.class).add(Restrictions.eq("email", email)).add(Restrictions.eq("mdp", passwd));
             
             Criteria criteriaP =session.createCriteria(Professeurs.class).add(Restrictions.eq("email", email)).add(Restrictions.eq("mdp", passwd));
     
             if(criteria.list().size()>0)
             {
		            System.out.println(" ok");
		            eleve = (Eleves)criteria.uniqueResult();
		            System.out.println("Nom de l'eleve: "+eleve.getNom());
		               idE = eleve.getId();
		               
		              /* Criteria criteriaR =session.createCriteria(Resultats.class).add(Restrictions.eq("id_eleve", idE));
		               List l= criteriaR.list();
		               for (Iterator it = l.iterator(); it.hasNext();)
		       		  {
		                       Resultats e = (Resultats) it.next();
		                       System.out.println("<tr>");
		                       System.out.println("<td>" + e.getPoints() + "</td>");
		                    
		       		      }
		                   out.println("</table>");
		       	       out.println("la liste des eleves " + l.size() ); */

	               HttpSession s = request.getSession();
	               s.setAttribute("section", eleve);
	               
	              response.sendRedirect("eleves.jsp");
	              
		                }
		               
		          //  RequestDispatcher dispatcher = request.getRequestDispatcher("./Eleves.jsp");
               //	dispatcher.forward(request, response);	
		    else {
			            	  if(criteriaP.list().size()>0)
			            	  {
						         
								            		  System.out.println(" ok");
								                      Professeurs prof = (Professeurs)criteriaP.uniqueResult();
								                      System.out.println("Nom du professeur : "+prof.getNom());
								                      HttpSession s = request.getSession();
								       	              s.setAttribute("section",prof);
								                      
								                      if(prof.getRole() == 1)
								                      {
								                    	  
								                    	  System.out.println("Professeur");
								                    	  idP = prof.getId();
								                    	
								                    	response.sendRedirect("prof.jsp"); 
								                    	   
								                    	 
								                      }
								                      else
								                      {
								                    	  idA = prof.getId();
								                    
								                    	  response.sendRedirect("admin.jsp"); 
								                    	  
								                      }
			            	  }
			            	  else
			            	  {
			            		  //RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
			                  	 //dispatcher.forward(request, response);
			            		  System.out.println(" utilisateur non disponible ");
			            		  response.sendRedirect("indexEchec.jsp"); 
			            	  }
		           
					         
		            		  
		             }
		            	 
              
     
       
             
            out.flush();
            out.close();

            // End unit of work
           // session.getTransaction().commit();
         // session.close();
         } catch (Exception ex)
        {
           
                 
            throw new ServletException(ex);
        }
	}
}
