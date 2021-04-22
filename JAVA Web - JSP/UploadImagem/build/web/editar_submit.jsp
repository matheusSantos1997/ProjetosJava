<%-- 
    Document   : editar_submit
    Created on : 26/01/2020, 18:15:54
    Author     : Matheus
--%>
<%@page import="manipularImagem.Upload"%>
<%@page import="java.io.IOException"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="agente.Agente"%>
<%@page import="agenteDAO.AgenteDAO"%>
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
                Agente ag = new Agente(); //instancia a classe Agente
                AgenteDAO agd = new AgenteDAO(); //inatancia a classe AgenteDAO
                Upload up = new Upload(); //instancia a classe Upload
                
                //caminho do diretório onde irá salvar as imagens
                up.setFolderUpload("imagens");
                
                if(up.formProcess(getServletContext(), request))
                {
                     if(up.getForm().get("nome_agente").toString().isEmpty() || up.getForm().get("email_agente").toString().isEmpty() 
                  || up.getForm().get("telefone_agente").toString().isEmpty() || up.getForm().get("cidade").toString().isEmpty() 
                  || up.getForm().get("regiao").toString().isEmpty() || up.getForm().get("unidade").toString().isEmpty())
                {
                    out.println("preencha todos os campos!");
                }
                else
                {
                    if(!up.getFiles().isEmpty())
                    {
                        ag.setNome_agente(up.getForm().get("nome_agente").toString());
                        ag.setEmail_agente(up.getForm().get("email_agente").toString());
                        ag.setTelefone_agente(up.getForm().get("telefone_agente").toString());
                        ag.setCidade(up.getForm().get("cidade").toString());
                        ag.setRegiao(up.getForm().get("regiao").toString());
                        ag.setUnidade(up.getForm().get("unidade").toString());
                        ag.setFoto(up.getFiles().get(0).toString());
                        ag.setId_agente(Integer.parseInt(up.getForm().get("id_agente").toString()));
                    }
                    agd.editar(ag);
                    
                    response.sendRedirect("index.jsp");
                }
                }
            }
            catch(IOException error)
            {
                 throw new RuntimeException("Erro ao editar: " + error);
            }
        
        %>
    </body>
</html>
