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
    <li ><a href="admin_prof.jsp">Enseignants</a></li>
    <li  class="active"><a href="cours.jsp">Cours</a></li>
    <li><a href="activites_sportives.jsp">Activités sportives</a></li>
    
  </ul>


			<div id="tableContainerCours"></div>

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
			$('#tableContainerCours').jtable({

				title : 'Gestion des cours',
				actions : {
					listAction : 'admincours?action=list',
					createAction : 'admincours?action=create',
					updateAction : 'admincours?action=update',
					deleteAction : 'admincours?action=delete',
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

					nb_heures : {
						title : 'nombre heures',
						width : '20%'
					},
					annee : {
						title : 'Annee',
						width : '20%'
					}
				}

			});
			$('#tableContainerCours').jtable('load');
		});
	</script>
</body>
</html>