<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inclus�o</title>

<jsp:useBean id="livro" class="modelo.dominio.Gerente" scope="request"></jsp:useBean>
</head>
<%
	String mensagem = (String) request.getAttribute("mensagem");
	if (mensagem != null)
		out.println("<h3>" + mensagem + "</h3>");
%>
<body>
	<form action="salvarGerente" method="post" onsubmit="return validar()">
		<table>
			<tr>
				<td>Nome:</td>
				<td><input type="text" name="nomeLivro" size="30"
					maxlength="80" placeholder="Nome do Livro"></td>
			</tr>
			<tr>
				<td>Descri��o:</td>
				<td><input type="text" name="descricao"placeholder="Descri��o do Livro">
			</td>
			</tr>
			<tr>
				<td>Ano de Lan�amento:</td>
				<td><input type="text" name="anoLancamento" size="4" maxlength="4"
					placeholder="Ano de Lan�amento do Filme"></td>
			</tr>
			<tr>
				<td>N�mero de P�ginas:</td>
				<td><input type="text" name="numPaginas" size="30"
					maxlength="80" placeholder="N�mero de P�ginas"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Enviar"></td>
			</tr>
		</table>
	</form>
	<br>
	<br>
	<a href="logout">Sair</a>
</body>
</html>








