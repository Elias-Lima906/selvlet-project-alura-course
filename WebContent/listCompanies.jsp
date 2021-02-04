
<%@page import="java.util.List, br.com.zup.gerenciador.models.Company" %>

<%
	List<Company> companies = (List<Company>) request.getAttribute("companies");
%>


<!DOCTYPE html>
<html>
<body>
	<ul>
		<%
		for (Company company : companies) {
		%>
			
		<li> <strong> <% out.println(company);%> </strong>  </li>
			
		<%
			}
		%>
	</ul>
</body>
</html>