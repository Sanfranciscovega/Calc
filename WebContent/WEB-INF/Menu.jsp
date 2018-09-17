<%@include file="commonHead.jsp"%>
<body>
	<div id="menu">
		<ul class="n1">
			<li class="d3"><a href="Accueil">Accueil</a></li>
			<li class="d3"><a href="">Menu</a>
				<ul class="n2">
					<li><a href="Calc">Calculatrice</a>
						<ul class="n3">
							<li><a href="Calc">Exercice OpenClassRooms</a></li>
							<li><a href="calcButton">Calculatrice à boutons</a></li>
						</ul> 
					</li>
					<li><a href="Upload">Upload de fichier</a></li>
				</ul>
			</li>
			<c:choose>
				<c:when test="${ empty sessionScope.Nom }">
					<li class="d3"><a href="Connexion">Connexion</a></li>
				</c:when>
				<c:when test="${ !empty sessionScope.Nom }">
					<li class="d3"><a href="Connexion">Deconnexion</a></li>
				</c:when>
			</c:choose>
		</ul>
	</div>
