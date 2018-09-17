<%@include file="Menu.jsp"%>

    
	
    <form method="post" action="Upload.jsp" enctype="multipart/form-data">
        <p>
            <label for="description">Description du fichier : </label>
            <input type="text" name="desc" id="desc" />
        </p>
        <p>
            <label for="fichier">Fichier à envoyer : </label>
            <input type="file" name="fic" id="fic" />
        </p>
        <input type="submit" class="operators" name="Envoyer" value="Ok">

    </form>
<c:if test="${ !empty fic }"><p class="result"><c:out value="Le fichier ${ fic } (${ desc}) a été uploadé !" /></p></c:if>
<%@include file="commonFooter.jsp"%>