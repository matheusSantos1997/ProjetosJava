<%-- 
    Document   : index
    Created on : 23/01/2020, 17:13:03
    Author     : Matheus
--%>
<%@page import="java.io.IOException"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="userDAO.UsuarioDAO"%>
<%@page import="user.Usuario"%>
<%@page import="connection_factory.Conexao"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estilos/estilo.css" />
        <title>Principal</title>
    </head>
    <body>
        <div class="fundo">
        <a href="inserir.jsp">[CADASTRAR USUARIO]</a>
        </div>
        <%
            try
            {
                out.print("<table border='1'>");
                out.print("<tr>");
                out.print("<th>Codigo</th><th>Nome</th><th>Endereço</th><th>Editar</th><th>Excluir</th>");
                
                UsuarioDAO ud = new UsuarioDAO();
                
                //verificaçao se existe usuario cadastrado
                if(request.getParameter("nome") != "" && request.getParameter("endereco") != "")
                {
                    ArrayList<Usuario> lista = ud.listarTodos();
                    
                    for(int num = 0; num < lista.size(); num++)
                    {
                        out.print("<tr>");
                        out.print("<td>"+ lista.get(num).getCodigo() + "</td>");
                        out.print("<td>"+ lista.get(num).getNome() + "</td>");
                        out.print("<td>"+ lista.get(num).getEndereco() + "</td>");
                        out.print("<td><a href='editar.jsp?codigo=" + lista.get(num).getCodigo() + "&nome=" + lista.get(num).getNome() + "&endereco=" + lista.get(num).getEndereco() + "'>[EDITAR]</a></td>");
                        out.print("<td><a href='excluir_submit.jsp?codigo=" + lista.get(num).getCodigo() + "'>[EXCLUIR]</a></td>");
                        out.print("</tr>");
                        
                    }
                }
                
                out.print("</tr>");
                out.print("</table>");
            }
            catch(IOException error)
            {
                throw new RuntimeException("Erro ao listar os dados: " + error);
            }
        %>
    </body>
</html>
