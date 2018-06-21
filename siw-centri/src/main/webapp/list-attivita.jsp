<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Attivita Form</title>
</head>
<body>
	<input type="button" value="Aggiungi Attivita"
		onclick="window.location.href='showFormAdd'; return false;"
		class="add-button" />
		
		<table>
				<tr>
					<th>Nome</th>
					<th>Data</th>
					<th>Ora</th>
					
				</tr>

				<c:forEach var="attivita" items="${attivita}">
					<tr>
						<td>${attivita.nome}</td>
						<td>${attivita.data}</td>
						<td>${attivita.ora}</td>
					</tr>
				</c:forEach>
			</table>

</body>
</html>