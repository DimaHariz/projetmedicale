<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="medical.m2i.model.*" %>
<%@ page import="medical.m2i.dao.VilleDao" %>

<% Ville v = new Ville(); %>
<% v = (Ville) request.getAttribute("villeparam"); %>

<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <title>Formulaire edition</title>
    <link href="style.css" rel="stylesheet">
</head>

<body>
	<%@ include file="../fragments/header.jsp" %>
    <main class="container">
        <h1>Formulaire d'édition d'une ville : </h1>
        <hr>
        <div>
        </div>
        <form name="monForm" action="" method="post">
            <div class="form-line mb-4">
                <label class="form-label">Pays *</label>
                <input class="form-control" type="text" name="pays" placeholder="Votre pays" value="<%= v.getPays() %>" required>
            </div>
            <div class="form-line mb-4">
                <label>Ville *</label>
                <input class="form-control" type="text" name="nom" placeholder="Votre ville" value="<%= v.getNom() %>" required>
            </div>

            <div class="form-line mb-4">
                <label class="form-label">Code Postal *</label>
                <input class="form-control" type="text" name="code_postal" placeholder="Votre code postal" value="<%= v.getCode_postal() %>" required>
            </div>

            <div class="form-line mb-4">
                <button type="submit" class="btn btn-primary">Envoyer</button>
            </div>

        </form>
    </main>
    <%@ include file="/fragments/footer.jsp" %>
</body>

</html>