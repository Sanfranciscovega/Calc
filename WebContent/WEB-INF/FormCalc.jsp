<%@include file="Menu.jsp"%>
	<div class="calc">
		<h1>Calculatrice en ligne</h1>
		<!-- Include forms -->
		<%@include file="formulaire.jsp" %>
		<!-- Show calculation result -->
		<h2>${ ! empty result ? field1 += " " +=  operator += " " += field2 += " = " += result : ''}</h2>
	</div>
