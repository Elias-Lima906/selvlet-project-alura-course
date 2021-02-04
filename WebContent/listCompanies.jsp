<%@ page import="java.util.List, br.com.zup.gerenciador.models.Company"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<body>
	<ul>
		<c:forEach items="${ companies }" var="company">
			
			<li><strong> 
			Id: ${ company.id }
			<br/>
			Nome: ${ company.name }
			<br/>
			Data: <fmt:formatDate value="${ company.openingDate }" pattern="dd/MM/yyyy"/> 
			</strong></li>
			<br/>
			<br/>
		</c:forEach>
	</ul>
</body>
</html>