<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
     <link rel="stylesheet" media="screen" type="text/css" title="Design" href="style.css" />
     <link rel="stylesheet"  type="text/css"  href="./css/bootstrap.min.css" />
     <link rel="stylesheet"  type="text/css"  href="./css/main.css" />
     <link rel="icon" type="image/png" href="images/icon.jpg"/>
    <title>Espace personnel etudiant</title>
</head>

<body>
<jsp:include page ="head.jsp"/>
<div id="etud_img">
<img src="images/stud.png" width="300" height="100" />
</div>
<div id ="banner_menu">
			 
					<nav>
						<ul>
						 
							<li>
							<a href="eleves.jsp" ><font color="#008080"> Mon Profil  </font></a>
							</li>
							
							<li>
							  <a href="eleve_cours.jsp" >Mes cours/Résultats</a>    
                             </li>
							<li>
						<a href="eleve_sport.jsp" >Mes activités sportives</a> 
							</li>
							<li> 
								<a href="contact.jsp">Contact</a>
							</li>
						</ul>
					</nav>
	</div>
    
    <div id="image">
    
    </div>
    
<div id="section_etudiant">
<div class ="btn-group btn-group-justified">
					<a class ="btn btn-default active" role ="button" href="eleves.jsp" >Mon Profil  </a>
						
				      <a class ="btn btn-default" role ="button" href="eleve_cours.jsp" >Mes cours/Résultats</a>    
                           
						<a class ="btn btn-default" role ="button" href="eleve_sport.jsp" >Mes activités sportives</a> 
							
				     	<a class ="btn btn-default" role ="button"href="contact.jsp">Contact</a>
					
</div>
    <div id ="profil-etud">
    <p><br/> Bienvenue <strong> ${section.getNom()} ${section.getPrenom()}  </strong> dans votre espace personnel </p><br/>
    Votre Dossier administratif 
    <table class ="table table-hover">
 
         <thead>
                <th>Identifiant </th>
                <th>Nom </th>
                <th>Prénom </th>
                <th>Date de naissance </th>
                <th>Année scolaire </th>
                <th>Poids</th>
         
         </thead>
         <tbody>
         	<tr> 
         		   <td>${section.getId()} </td>
         		   <td> ${section.getNom()} </td>
         			<td>${section.getPrenom()} </td>
         			<td>${section.getDate_naiss()} </td>
         			<td>${section.getAnnee()}  </td>
         			<td>${section.getPoids()}  </td>
         	</tr>
         
         </tbody>

   </table>
    </div>
      <div id= "mes_actv">
         <a href="etud_sport.php"><strong>  <font color="#BBCCD4"> &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;Mes loisirs </font> </strong> </a>
          <br/> <br/>
          <img src="images/sport.jpg" width="100%" height="65%">
      
      </div>
      <div id= "mes_resu">
         <a href="etud_cours.php"> <strong>  <font color="#BBCCD4">&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;Mes cours/Mes résultats </font></strong></a>
          <br/> <br/>
            <img src="images/cours.jpg" width="100%" height="65%">
      
      </div>
      
      
      
              
        	
    
    </div>




<jsp:include page ="foot.jsp"/>
</body>
</html>