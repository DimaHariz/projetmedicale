<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="medical.m2i.model.*"%>
<%@ page import="medical.m2i.dao.VilleDao"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Liste des villes</title>
</head>
<body>

	<%@ include file="../fragments/header.jsp"%>
	<main class="container">
		<h3>Ici on affiche la liste des villes</h3>

		<table class="table table-striped">
			<thead>
				<th>ID</th>
				<th>Pays</th>
				<th>Nom</th>
				<th>Code Postal</th>
			</thead>
			<tbody>
				<%
				ArrayList<Ville> lvtpl = new ArrayList<Ville>();
				%>

				<%
				lvtpl = (ArrayList) request.getAttribute("vl");
				for (Ville v : lvtpl) {
				%>

				<tr>
					<td><%=v.getId()%></td>
					<td><%=v.getPays()%></td>
					<td><%=v.getNom()%></td>
					<td><%=v.getCode_postal()%></td>
					<td><a class="btn btn-secondary btn-sm"
						href="editVille?id=<%=v.getId()%>"><i
							class="fa fa-pencil-square-o" aria-hidden="true"></i></a>
						<button class="btn btn-danger btn-sm"
							onclick="supprimer(<%=v.getId()%>)">
							<i class="fa fa-trash-o" aria-hidden="true"></i>
						</button></td>
				</tr>
				<%
				}
				%>
			</tbody>
		</table>

		<a href="ville/villeregister.jsp" class="btn btn-primary">Ajouter
			une ville</a>

	</main>
	<%@ include file="../fragments/footer.jsp"%>

	<script>
	function supprimer(id) {
		if(confirm("Etes-vous sur ?")){
			console.log('deleteville?id='+id);
			window.location = 'deleteville?id='+id;
		}
	}
</script>
</body>
</html>