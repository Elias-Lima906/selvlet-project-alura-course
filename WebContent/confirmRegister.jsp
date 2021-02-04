<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<body>
	<c:if test="${ not empty companyName }">
		<h1>${ companyName } Cadastrada com sucesso!</h1>
	</c:if>
	
	<c:if test="${ empty companyName }">
		<h1> Nenhuma empresa foi cadastrada </h1>
	</c:if>
</body>
</html>