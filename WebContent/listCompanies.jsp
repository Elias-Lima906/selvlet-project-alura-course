<%@ page import="java.util.List, br.com.zup.gerenciador.models.Company"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<c:url value="/removeCompany" var="linkServletRemoveCompany"/>
<c:url value="/showCompany" var="linkServletShowCompany"/>

<html>
<body>
	<ul>
		<c:if test="${ not empty companyName }">
			<h1>${ companyName } Cadastrada com sucesso!</h1>
		</c:if>
	
		<c:forEach items="${ companies }" var="company">
			
			<li><strong> 
			Id: ${ company.id }
			<br/>
			Nome: ${ company.name }
			<br/>
			Data: <fmt:formatDate value="${ company.openingDate }" pattern="dd/MM/yyyy"/> 
			<br/>

			<a href = "${ linkServletShowCompany }?id=${ company.id }"> EDITAR </a>
			<a href = "${ linkServletRemoveCompany }?id=${ company.id }"> REMOVER </a>
			
			</strong></li>
			<br/>
			<br/>
		</c:forEach>
	</ul>
</body>
</html>