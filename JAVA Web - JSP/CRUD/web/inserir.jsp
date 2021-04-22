<%-- 
    Document   : index
    Created on : 23/01/2020, 17:13:03
    Author     : Matheus
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>inserir</title>
    </head>
    <body>
        <form action="inserir_submit.jsp" method="post">
            <label>Seu Nome:</label></br>
            <input type="text" name="nome" /></br></br>
            
            <label>Seu endereco:</label></br>
            <input type="text" name="endereco" /></br></br>
            
            <input type="submit" value="Cadastrar">
        </form>
    </body>
</html>
