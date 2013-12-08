<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
 <link rel="stylesheet" media="screen" type="text/css" title="Design" href="style.css" />
     <link rel="stylesheet"  type="text/css"  href="./css/bootstrap.min.css" />
     <link rel="stylesheet"  type="text/css"  href="./css/main.css" />   
    <link rel="icon" type="image/png" href="images/icon.jpg"/>
<title>P.P Acueil</title>
</head>

<body>
<jsp:include page ="head.jsp"/>
<div id ="banner_menu">
			 
					<nav>
						<ul>
						 
							<li>
								 <a href="admin.php" > <font color="#008080"> >> Accueil</font></a>
							</li>
							
							<li>
							  <a href="liste_ens.php" >Enseignants </a>    
                             </li>
							<li>
						<a href="liste_etud.php" >Etudiants</a> 
							</li>
                            	<li>
						<a href="liste_cours.php">Cours</a> 
							</li>
							<li> 
								<a href="liste_sport.php">Activités sportives </a>
							</li>
						</ul>
					</nav>
	</div>
    
    <div id="section_etudiant">

	<div id ="menu_admin">
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
    <br/> <br/>
    <div id= "mes_actv">
         <a href="liste_ens.php"><strong>  <font color="#BBCCD4"> &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;Les enseignants </font> </strong> </a>
          <br/> <br/>
          <img src="images/ens.jpg" width="100%" height="65%">
      
      </div>
      <div id= "mes_resu">
         <a href="liste_etud.php"> <strong>  <font color="#BBCCD4">&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;Les étudiants </font></strong></a>
          <br/> <br/>
            <img src="images/ettud.jpg" width="100%" height="65%">
      
      </div>
       <div id= "mes_actv1">
         <a href="liste_sport.php"><strong>  <font color="#BBCCD4"> &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;Les activités sportives  </font> </strong> </a>
          <br/> <br/>
          <img src="images/sport.jpg" width="100%" height="65%">
      
      </div>
      <div id= "mes_resu1">
         <a href="liste_cours.php"> <strong>  <font color="#BBCCD4">&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;Les cours </font></strong></a>
          <br/> <br/>
            <img src="images/cours.jpg" width="100%" height="65%">
      
      </div>
      
    </div>


  <script type="javascript" src="./js/bootstrap.min.js"></script>
<jsp:include page ="foot.jsp"/>
</body>
</html>