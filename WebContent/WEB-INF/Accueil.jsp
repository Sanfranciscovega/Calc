<%@include file="Menu.jsp"%>
<div class="accueil">

	<div class="infos">
		<c:out value="${ empty server ? '' :  server  }"></c:out>
		<c:out value="${ empty port ? '' : ':' += port  }"></c:out></div>
		<div class="infos">
			<c:out value="${ empty serverInfo ? '' : serverInfo  }"></c:out>
		<div class=infos>
			<img id="tomcat" src="IMG/300px-Tomcat-logo.svg.png"/>
		</div>
		
	</div>
</div>
<%@include file="commonFooter.jsp"%>