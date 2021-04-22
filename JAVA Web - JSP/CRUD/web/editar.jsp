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
        <title>JSP Page</title>
    </head>
    <body>
        <form action="editar_submit.jsp" method="post">
            
            <input type="hidden" name="codigo" value="<%=request.getParameter("codigo")%>" />
            
            <label>Nome:</label></br>  
            
            <input type="text" name="nome" value="<%=request.getParameter("nome")%>" /></br></br>
            
            <label>endereço:</label></br>
            <input type="text" name="endereco" value="<%=request.getParameter("endereco")%>" /></br></br>
            
            <input type="submit" value="Editar" />
        </form> 
    </body>
</html>
