<%@include file="Menu.jsp"%>

	<c:choose>
		<c:when test="${ empty sessionScope.Nom }">
			<form method="post" action="Connexion">
        	<p>
            <label for="lblPrenom">Votre prénom : </label>
            <input type="text" name="Prenom" id="prenom" />
        	</p>
        	<p>
            <label for="lblNom">Votre nom : </label>
            <input type="text" name="Nom" id="nom" />
        	</p>
       		 <input type="submit" class="operators" name="LogIn" value="Ok">
       		 </form>
       </c:when>
		<c:when test="${ !empty sessionScope.Nom }">
			<p class="result">Vous êtes connecté en tant que "${ sessionScope.Prenom += ' ' += sessionScope.Nom }"</p>
			<form method="post" action="Connexion">
						<input type="submit" class="operators" name="LogOut" value="Me déconnecter">
       		 </form>
		</c:when>
	</c:choose>
	
    

<%@include file="commonFooter.jsp"%>