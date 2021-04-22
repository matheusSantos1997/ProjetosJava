<%-- 
    Document   : index
    Created on : 23/01/2020, 17:13:03
    Author     : Matheus
--%>
<%@page import="java.io.IOException"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="userDAO.UsuarioDAO"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            try
            {
                UsuarioDAO ud = new UsuarioDAO();
                
                ud.excluir(Integer.parseInt(request.getParameter("codigo")));
              
                response.sendRedirect("index.jsp");
            }
            catch(IOException error)
            {
                throw new RuntimeException("Erro ao excluir: " + error);
            }
            
        %>
    </body>
</html>
