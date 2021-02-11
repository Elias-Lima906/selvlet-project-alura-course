<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<c:url value="/editCompany" var="linkServletEditCompany"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Informations Company</title>
</head>
<body>
	<form action="${ linkServletEditCompany }" method="post">

		<input type="hidden" name="id" placeholder="Id"  value="${ company.id }"/> 
		
		<input type="text" name="name" placeholder="Nome" value="${ company.name }"/> 
			<br/>
			<br/>
		<input type="text" name="date" placeholder="Data de abertura" value="<fmt:formatDate value="${ company.openingDate }" pattern="dd/MM/yyyy"/> "/> 
			<br/>
			<br/>
		<input type="submit" value="Alterar"  />

	</form>
</body>
</html>