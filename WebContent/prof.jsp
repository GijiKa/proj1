<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
 <link rel="stylesheet" media="screen" type="text/css" title="Design" href="style.css" />
      <link rel="stylesheet"  type="text/css"  href="./css/bootstrap.min.css" />
     <link rel="stylesheet"  type="text/css"  href="./css/main.css" />
    <link rel="icon" type="image/png" href="images/icon.jpg"/>
<title>Espace personnel-Enseingnant</title>
</head>

<body>
<jsp:include page ="head.jsp"/>
<div id ="banner_menu">
			 
					<nav>
						<ul>
						 
							<li>
							<a href="prof.jsp" ><font color="#008080"> Mon Profil  </font></a>
							</li>
							
							<li>
							  <a href="prof_cours.jsp">Mes cours</a>    
                             </li>
							<li>
						<a href="prof_etud.jsp" >Mes étudiants</a> 
							</li>
							<li> 
								<a href="ense_contact.jsp">Contact</a>
							</li>
						</ul>
					</nav>
	</div>
    <div id="ensei_img">
       <img src="images/ensei.bmp" width="100%" height="100%" />
    </div>

    
    <div id="image">
    
    </div>
    
<div id="section_etudiant">
<div class ="btn-group btn-group-justified">
					<a class ="btn btn-default" role ="button" href="prof.jsp" >Mon Profil  </a>
						
				      <a class ="btn btn-default" role ="button" href="prof_cours.jsp" >Mes cours</a>    
                           
						<a class ="btn btn-default" role ="button" href="prof_etud.jsp" >Mes étudiants</a> 
							
				     	<a class ="btn btn-default" role ="button"href="contact.jsp">Contact</a>
			
						
	</div>
    <div id ="profil-etud">
    <p><br/> Bienvenue  ${section.getNom()}  dans votre espace personnel </p><br/>
    	<strong>Votre Dossier administratif   </strong>
    	 <table class ="table table-hover">
 
         <thead>
                <th>Identifiant </th>
                <th>Nom </th>
                <th>Spécialité</th>
                <th>Date d'entrée </th>
                <th> Dernière promotion  </th>
                <th>Salaire de base </th>
                <th>Salaire actuel </th>
         
         </thead>
         <tbody>
         	<tr> 
         		   <td>${section.getId()} </td>
         		   <td> ${section.getNom()} </td>
         			<td>${section.getSpecialite()} </td>
         			<td>${section.getDate_entree()} </td>
         			<td>${section.getDer_prom()}  </td>
         			<td>${section.getSalaire_base()}  </td>
         			<td>${section.getSalaire_actuel()}  </td>
         	</tr>
         
         </tbody>

   </table>
    	

    </div>
      <div id= "mes_actv">
         <a href="ense_cours.php"><strong>  <font color="#BBCCD4"> &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;Mes Cours </font> </strong> </a>
          <br/> <br/>
          <img src="images/cr.jpg" width="100%" height="65%"/>
      
      </div>
      <div id= "mes_resu">
         <a href="ense_etudiants.php"> <strong>  <font color="#BBCCD4">&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;Mes étudiants </font></strong></a>
          <br/> <br/>
            <img src="images/cours.jpg" width="100%" height="65%"/>
      
      </div>
      
      
      
              
        	
    
    </div>
    <jsp:include page ="foot.jsp"/>
</body>
</html>