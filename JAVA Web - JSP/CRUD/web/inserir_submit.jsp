<%-- 
    Document   : index
    Created on : 23/01/2020, 17:13:03
    Author     : Matheus
--%>
<%@page import="java.io.IOException"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="connection_factory.Conexao"%>
<%@page import="user.Usuario"%>
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
             
             Usuario u = new Usuario(); //instanciou a classe Usuario
             UsuarioDAO ud = new UsuarioDAO(); // instanciou a classe UsuarioDAO
             
             //verificaçao se os campos estao preenchidos
             
             //se o campo nome e endereco estiverem vazios
             if(request.getParameter("nome").equals("") || request.getParameter("endereco").equals(""))
             {
                 //vai redirecionar para a pagina index
                 response.sendRedirect("index.jsp");
             }
             else
             {
                 //seta os valores nos campos input
                 u.setNome(request.getParameter("nome"));
                 u.setEndereco(request.getParameter("endereco"));
                 ud.inserir(u); //inseri no banco
                
                 //após inserir redireciona para a página principal
                 response.sendRedirect("index.jsp");
             }
         }
         catch(IOException error)
         {
             throw new RuntimeException("Erro ao inserir: " + error);
         }
        %>
    </body>
</html>
