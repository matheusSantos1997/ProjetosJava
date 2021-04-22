<%-- 
    Document   : index
    Created on : 23/01/2020, 17:13:03
    Author     : Matheus
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="user.Usuario"%>
<%@page import="userDAO.UsuarioDAO"%>
<%@page import="java.io.IOException"%>
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
                Usuario u = new Usuario();
                UsuarioDAO ud = new UsuarioDAO();
                
                if(request.getParameter("nome").equals("") || request.getParameter("endereco").equals(""))
                {
                    response.sendRedirect("index.jsp");
                }
                else
                {
                    u.setNome(request.getParameter("nome"));
                    u.setEndereco(request.getParameter("endereco"));
                    u.setCodigo(Integer.parseInt(request.getParameter("codigo")));
                    ud.editar(u);
                    
                    response.sendRedirect("index.jsp");
                }
            }
            catch(IOException error)
            {
                 throw new RuntimeException("Erro ao editar: " + error);
            }
        
        %>
    </body>
</html>
