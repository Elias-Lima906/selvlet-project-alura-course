<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:url value="/newCompany" var="linkServletNewCompany"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Company</title>
</head>
<body>
	<form action="${ linkServletNewCompany }" method="post">

		<input type="text" name="id" placeholder="Id"/> 
			<br/>
			<br/>
		<input type="text" name="name" placeholder="Nome"/> 
			<br/>
			<br/>
		<input type="text" name="date" placeholder="Data de abertura"/> 
			<br/>
				<br/>
		<input type="submit" placeholder="Cadastrar" />

	</form>
</body>
</html>