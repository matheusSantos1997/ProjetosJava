<%-- 
    Document   : index
    Created on : 26/01/2020, 01:03:43
    Author     : Matheus
--%>

<%@page import="java.io.IOException"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="agenteDAO.AgenteDAO"%>
<%@page import="agente.Agente"%>
<%@page import="manipularImagem.Upload"%>
<%@page import="connection_factory.Conexao"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Princital</title>
    </head>
    <body>
        <h1>Agentes da Inovação</h1>
        <a href="cadastrar.jsp">[CADASTRAR AGENTE]</a></br></br>
        <hr>
        <%
            try
            {
                
                AgenteDAO agd = new AgenteDAO();
                
                //verificaçao se existe usuario cadastrado
                if(request.getParameter("nome_agente") != "" && request.getParameter("email_agente") != "" && request.getParameter("telefone_agente") != ""
                        && request.getParameter("cidade") != "" && request.getParameter("regiao") != "" && request.getParameter("unidade") != "")
                {
                    ArrayList<Agente> mostrar = agd.mostrarTodos();
                    
                    for(int num = 0; num < mostrar.size(); num++)
                    {

                        out.print(mostrar.get(num).getNome_agente() + "</br>");
                        out.print(mostrar.get(num).getEmail_agente() + "</br>");
                        out.print(mostrar.get(num).getTelefone_agente() + "</br>");
                        out.print(mostrar.get(num).getCidade() + "</br>");
                        out.print(mostrar.get(num).getRegiao() + "</br>");
                        out.print(mostrar.get(num).getUnidade() + "</br></br>");
                        %>
                        <img src="./imagens/<%=mostrar.get(num).getFoto()%>" width="70" height="70" />
                        <%
                          
                        //mostrar.get(num).getFoto();
                        out.print("<p><a href='editar.jsp?id_agente=" + mostrar.get(num).getId_agente() + "&nome_agente=" + mostrar.get(num).getNome_agente() + 
                        "&email_agente=" + mostrar.get(num).getEmail_agente() + "&telefone_agente=" + mostrar.get(num).getTelefone_agente() + 
                        "&cidade=" + mostrar.get(num).getCidade() + "&regiao=" + mostrar.get(num).getRegiao() + "&unidade=" + mostrar.get(num).getUnidade() + "'>[EDITAR]</a></p>");
                        out.print("<p><a href='excluir.jsp?id_agente=" + mostrar.get(num).getId_agente() + "'>[EXCLUIR]</a></p>");
                        out.print("<hr>");
                        
                    }
                }
                
            }
            catch(IOException error)
            {
                throw new RuntimeException("Erro ao mostrar os dados: " + error);
            }
        %>
    </body>
</html>
