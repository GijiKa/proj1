<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
 <link rel="stylesheet" media="screen" type="text/css" title="Design" href="style.css" />
     <link rel="stylesheet"  type="text/css"  href="./css/bootstrap.min.css" />
     <link rel="stylesheet"  type="text/css"  href="./css/main.css" />   
    <link rel="icon" type="image/png" href="images/icon.jpg"/>
<title>P.P Acueil</title>
  <script type="javascript" src="./js/jquery-1.9.1.js"></script>
</head>

<body>
<jsp:include page ="head.jsp"/>

    
 <div class="container-fluid">
  <div class="row">
  
   
	  <div class="span9">
	 
	 
	

		
			
			
			
		<ul class="nav nav-pills nav-stacked">
			 				 <li> <a href= "liste_ens.jsp"> Lister les Enseignants </a></li>
		                <li> <a href= "ajouter_ens.php"> Ajouter un enseignant </a></li>
		          
						<li> <a href= "liste_ens.jsp"> Lister les étudiants  </a></li>
		                <li> <a href= "ajouter_ens.php"> Ajouter un étudiant  </a></li>
		          	<li> <a href= "liste_ens.jsp">Lister les cours</a></li>
	                <li> <a href= "ajouter_ens.php"> Ajouter un cours </a></li>
	                <li> <a href= "liste_ens.jsp">Lister les activités</a></li>
			            <li> <a href= "ajouter_ens.php">Ajouter une activité </a></li>
													
			</ul> 
			</div>
	
			
		</div>	
				   
<div class="span3">


  <div class ="btn-group">
	
	<button type="button" class="btn btn-default"> Accueil </button> 
	
			 <div class ="btn-group">
			
			<button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown">Enseignants <span class="caret"></span></button> 
		    			
			  <ul class="dropdown-menu">
		          
						<li> <a href= "liste_ens.jsp"> Lister les Enseignants </a></li>
		                <li> <a href= "ajouter_ens.php"> Ajouter un enseignant </a></li>
													
			</ul>   
			</div>
		
			
			
			<div class ="btn-group">
			  <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown">Etudiants <span class="caret"></span></button> 
		    			
			  <ul class="dropdown-menu">
		          
						<li> <a href= "liste_ens.jsp"> Lister les étudiants  </a></li>
		                <li> <a href= "ajouter_ens.php"> Ajouter un étudiant  </a></li>
													
			</ul> 
			</div>
	
			<div class ="btn-group">
		     <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown">Cours <span class="caret"></span></button> 
	    	 <ul class="dropdown-menu">
	          
					<li> <a href= "liste_ens.jsp">Lister les cours</a></li>
	                <li> <a href= "ajouter_ens.php"> Ajouter un cours </a></li>
												
			</ul> 
			</div>
					<div class ="btn-group">
				     <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown">Activités sportives <span class="caret"></span></button> 
			            <ul class="dropdown-menu">
			          
							<li> <a href= "liste_ens.jsp">Lister les activités</a></li>
			                <li> <a href= "ajouter_ens.php">Ajouter une activité </a></li>
														
				    </ul> 
				   </div>
				

	</div>
    			
	</div>
	 
	 
	 
	 
	 
	 
	 </div>
	 </div>
	
	
	
	
	

   


 
 
<jsp:include page ="foot.jsp"/>
   <script src="https://code.jquery.com/jquery.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
</body>
</html>