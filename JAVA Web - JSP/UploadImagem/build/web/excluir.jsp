<%-- 
    Document   : excluir
    Created on : 27/01/2020, 00:06:51
    Author     : Família
--%>
<%@page import="java.io.IOException"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="agenteDAO.AgenteDAO"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Excluir Agente</title>
    </head>
    <body>
         <%
            try
            {
                AgenteDAO agd = new AgenteDAO();
                
                agd.excluir(Integer.parseInt(request.getParameter("id_agente")));
              
                response.sendRedirect("index.jsp");
            }
            catch(IOException error)
            {
                throw new RuntimeException("Erro ao excluir: " + error);
            }
            
        %>
    </body>
</html>
