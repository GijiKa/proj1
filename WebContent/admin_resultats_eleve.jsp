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

				<a href="admin.jsp" type="button" class="btn btn-default">Accueil</a>

				<a href="admin_prof.jsp" type="button" class="btn btn-default">Enseignants</a>

				<a href="cours.jsp" type="button" class="btn btn-default">Cours</a>

				<a href="activites_sportives.jsp" type="button"
					class="btn btn-default">Activités sportives</a>

			</div>


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
					listAction : 'adminreseleve?id_eleve='+<%=request.getParameter("id")%>+'&action=list',
					createAction : 'adminreseleve?id_eleve='+<%=request.getParameter("id")%>+'&action=create',
					updateAction : 'adminreseleve?id_eleve='+<%=request.getParameter("id")%>+'&action=update',
					deleteAction : 'adminreseleve?id_eleve='+<%=request.getParameter("id")%>+'&action=delete',
				},
				fields : {
					
					id_eleve : {
						key : true,
						list : false
					},
					id_cours: {
						key:true,
						create:true,
						title : 'Nom du cours',
						width : '20%',
						options:"admincours?action=options",
						list:true
					},

					note : {
						title : 'Note',
						width : '20%'
					}
				}

			});
			$('#tableContainerCours').jtable('load');
		});
	</script>
</body>
</html>