<%-- 
    Document   : FormInscricao
    Created on : Sep 2, 2019, 8:02:40 PM
    Author     : romao
--%>

<%@page import="romao.domain.FormsIns"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado do Formulário</title>
    </head>
    <body>
        <h1>Bem vindo ao curso</h1>
        <%
            FormsIns forms = (FormsIns) application.getAttribute("forms");
        %>
        <p> <%=forms.getNome()%></p>
        <p> <%=forms.getEmail()%></p>
        <p> <%=forms.getSexo()%></p>
        <p> <%=forms.getSelect()%></p>
        <p> <%=forms.getCursos()%></p>
    </body>
</html>
