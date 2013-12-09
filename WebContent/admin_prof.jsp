<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<!-- <link rel="stylesheet" media="screen" type="text/css" title="Design"
	href="style.css" /> -->
<link rel="stylesheet" type="text/css" href="./css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="./css/main.css" />
<link href="css/metro/crimson/jtable.css" rel="stylesheet"
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


	<div class="container-fluid">
		<div class="row-fluid">
			<div class="col-md-4"></div>


		</div>

		<div class="col-md-8">


			<div class="btn-group">

				<a type="button" class="btn btn-default">Accueil</a> <a
					type="button" class="btn btn-default">Enseignants</a> <a
					type="button" class="btn btn-default">Cours</a> <a type="button"
					class="btn btn-default">Activités sportives</a>

			</div>
			<c:if test="false">
				<div>Bienvenue dans la partie Admin</div>
			</c:if>

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
						width : '20%'
					},
					specialite : {
						title : 'Specialite',
						width : '20%'
					},
					date_entree : {
						title : 'Date d\'entrée',
						width : '20%'
					},
					der_prom : {
						title : 'Dérnière promo',
						width : '30%',
						create : false,
						edit : false
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