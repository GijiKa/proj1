<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
    <title>Bootstrap 101 Template</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
    <h1>Hello, world!</h1>
    
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
    			
	
       <script src="https://code.jquery.com/jquery.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>

  </body>
</html>