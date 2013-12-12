<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<!-- <link rel="stylesheet" media="screen" type="text/css" title="Design"
	href="style.css" /> -->
<link rel="stylesheet" type="text/css" href="./css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="./css/main.css" />
<link href="css/metro/blue/jtable.css" rel="stylesheet"
	type="text/css" />
<link href="css/jquery-ui-1.10.3.custom.css" rel="stylesheet"
	type="text/css" />
<link rel="icon" type="image/png" href="images/icon.jpg" />


<title>P.P Acueil</title>
<script type="javascript" src="./js/jquery-1.9.1.js"></script>
</head>

<body>
	<!-- declarer la JSTL -->
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<jsp:include page="head.jsp" />


	<div class="container">
	

		<div class="col-md-12">

<ul class="nav nav-tabs">
    <li ><a href="admin.jsp">Accueil</a></li>
    <li  class="active"><a href="admin_prof.jsp">Enseignants</a></li>
    <li><a href="cours.jsp">Cours</a></li>
    <li><a href="activites_sportives.jsp">Activit�s sportives</a></li>
    
  </ul>
			

			<div id="tableContainerProfesseurs"></div>

		</div>

	</div>



	<jsp:include page="foot.jsp" />
	<script src="js/jquery-1.8.2.js" type="text/javascript"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery-ui-1.10.3.custom.js" type="text/javascript"></script>
	<script src="js/jquery.jtable.js" type="text/javascript"></script>
	<script type="text/javascript">
		$(document).ready(function() {
			$('#tableContainerProfesseurs').jtable({
				title : 'Gestion des professeurs',
				actions : {
					listAction : 'adminprof?action=list',
					createAction : 'adminprof?action=create',
					updateAction : 'adminprof?action=update',
					deleteAction : 'adminprof?action=delete'
				},
				fields : {

					id : {
						key : true,
						list : false
					},
					nom : {
						title : 'Nom',
						width : '20%',
						display : function(data) {
							 return "<a href='admin_details_prof.jsp?id="+data.record.id+"'>"+data.record.nom+"</a>"
						}
					},
					specialite : {
						title : 'Specialite',
						width : '20%'
					},
					date_entree : {
						title : 'Date d\'entr�e',
						width : '20%'
					},
					der_prom : {
						title : 'D�rni�re promo',
						width : '30%',
						edit:true
					
						
					},
					salaire_base : {
						title : 'Salaire de base',
						width : '20%',

					},
					salaire_actuel : {
						title : 'Salaire actuel',
						width : '20%',

					},
					mdp:{
						title:"mot de passe",
						list:false,
						edit:false
					},
					email:{
						title:"Email",
						edit:true
					},
					role:{
						title:"Role",
						list:false,
						edit:false
					}

				}
			});
			$('#tableContainerProfesseurs').jtable('load');
		});
	</script>
</body>
</html>