<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Salva Attivita</title>
</head>
<body>
	<form:form action="salvaAttivita" modelAttribute="attivia"
		method="post">

		<!-- associa il customer con il database -->
		<form:hidden path="id" />

		<table>
			<tbody>
				<tr>
					<td><label>Name:</label></td>
					<td><form:input path="Nome" /></td>
				</tr>

				<!--  <tr>
						<td><label>Data:</label></td>
						<td><form:input path="data" /></td>
					</tr>

					<tr>
						<td><label>Ora:</label></td>
						<td><form:input path="ora" /></td>
					</tr>-->
				<tr>
					<td><label></label></td>
					<td><input type="submit" value="Salva" class="Save" /></td>
				</tr>
			</tbody>
		</table>

	</form:form>



</body>
</html>