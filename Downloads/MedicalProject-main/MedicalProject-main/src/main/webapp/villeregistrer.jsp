<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <title>Formulaire d'ajout Ville</title>
    <link href="style.css" rel="stylesheet">
</head>

<body>
	<%@ include file="../fragments/header.jsp" %>
    <main class="container">
        <h1>Formulaire d'ajout d'une ville</h1>
        <hr>
        <div>
        </div>
        <form name="monForm" action="http://localhost:8080/medical7/registerVille" method="post">
            <div class="form-line mb-4">
                <label class="form-label">Pays *</label>
                <input class="form-control" type="text" name="pays" placeholder="Votre pays" required>
            </div>
            <div class="form-line mb-4">
                <label>Ville *</label>
                <input class="form-control" type="text" name="nom" placeholder="Votre ville" required>
            </div>

            <div class="form-line mb-4">
                <label class="form-label">Code Postal *</label>
                <input class="form-control" type="text" name="code_postal" placeholder="Votre code postal" required>
            </div>

            <div class="form-line mb-4">
                <button type="submit" class="btn btn-primary">Envoyer</button>
            </div>

        </form>
    </main>
    <%@ include file="/fragments/footer.jsp" %>
</body>

</html>