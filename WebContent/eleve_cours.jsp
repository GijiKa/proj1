<!DOCTYPE html>
<html lang="fr">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>   
     <link rel="stylesheet" media="screen" type="text/css" title="Design" href="style.css" />
        <link rel="stylesheet"  type="text/css"  href="./css/bootstrap.min.css" />
     <link rel="stylesheet"  type="text/css"  href="./css/main.css" />
    <link rel="icon" type="image/png" href="images/icon.jpg"/>
	 <title>Etudiant-Cours</title>	
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
								 <a href="etudiant.php" >Mon Profil </a>
							</li>
							
							<li>
							  <a href="etud_cours.php"> <font color="#008080"> >> Mes cours /Résultats</font> </a>    
                             </li>
							<li>
						<a href="etud_sport.php"> Mes activités sportives </a> 
							</li>
							<li> 
								<a href="contact.php">Contact</a>
							</li>
						</ul>
					</nav>
	</div>
<div id="section_etudiant">
<div class ="btn-group btn-group-justified">
					<a class ="btn btn-default " role ="button" href="eleves.jsp" >Mon Profil  </a>
						
				      <a class ="btn btn-default active" role ="button" href="eleve_cours.jsp" >Mes cours/Résultats</a>    
                           
						<a class ="btn btn-default" role ="button" href="eleve_sport.jsp" >Mes activités sportives</a> 
							
				     	<a class ="btn btn-default" role ="button"href="contact.jsp">Contact</a>
			
						
	</div>
       <div id="im_sport">
    <img src="images/sgbd.png" width="25%" height="100%">
    <img src="images/rese.jpg" width="25%" height="100%">
    <img src="images/prog.jpg" width="25%" height="100%">
    <img src="images/oc.png" width="23.9%" height="100%">
    
    
    </div>
    
    <div id="etud_resu">
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
         		   <td>${eleve.getId()} </td>
         		   <td> ${eleve.getNom()} </td>
         			<td>${eleve.getPrenom()} </td>
         			<td>${eleve.getDate_naiss()} </td>
         			<td>${eleve.getAnnee()}  </td>
         			<td>${eleve.getPoids()}  </td>
         	</tr>
         
         </tbody>

   </table>
    </div>
    


</div>



<jsp:include page ="foot.jsp"/>
</body>
</html>