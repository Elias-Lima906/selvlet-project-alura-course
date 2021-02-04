
<%
String companyName = (String) request.getAttribute("companyName");
System.out.println(companyName);
%>


<!DOCTYPE html>
<html>
<body>
	<h1> <%= companyName %>  cadastrado(a) com sucesso! </h1>
</body>
</html>