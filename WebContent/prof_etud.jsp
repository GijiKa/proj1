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


  
	<div class="container-fluid">
		<div class="row-fluid">
			<div class="col-md-4">
			<ul class="nav nav-pills nav-stacked">
							<li class ="active"><a  role ="button" href="eleves.jsp" >Mon Profil  </a></li>
						    <li><a role ="button" href="padmin.jsp" >Operations  </a></li> 
								
									
						     
						     	</ul></div>


		</div>

		<div class="col-md-8">
		
			   <div id ="profil-etud">
    <p><br/> Bienvenue <strong> ${section.getNom()}   </strong> dans votre espace personnel </p><br/>
    Votre Dossier administratif 
    <table class ="table table-hover">
 
         <thead>
                <th>Identifiant </th>
                <th>Nom </th>
                <th>Specialite </th>
                <th>Date_entree </th>
                <th>Der_prom </th>
                <th>Salaire_base</th>
                <th>Salaire_actuel</th>
         
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

      
      				
		</div>
 
      
              
        	




<jsp:include page ="foot.jsp"/>
</body>
</html>