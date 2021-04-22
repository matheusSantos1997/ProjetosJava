<%-- 
    Document   : cadastrar_submit
    Created on : 26/01/2020, 15:32:19
    Author     : Matheus
--%>
<%@page import="java.io.IOException"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="agente.Agente"%>
<%@page import="agenteDAO.AgenteDAO"%>
<%@page import="manipularImagem.Upload"%>
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
             
             Agente ag = new Agente(); //instanciou a classe Usuario
             AgenteDAO agd = new AgenteDAO(); // instanciou a classe UsuarioDAO
             Upload up = new Upload(); //instanciou a classe Upload
             
             //caminho do diretório onde irá salvar as imagens
             up.setFolderUpload("imagens");
             
             
           if(up.formProcess(getServletContext(), request))
           {
             //verifica se os campos nao estao vazios
            if(up.getForm().get("nome_agente").toString().isEmpty() || up.getForm().get("email_agente").toString().isEmpty() 
              || up.getForm().get("telefone_agente").toString().isEmpty() || up.getForm().get("cidade").toString().isEmpty() 
              || up.getForm().get("regiao").toString().isEmpty() || up.getForm().get("unidade").toString().isEmpty())
             {
                 out.println("Preencha todos os campos!");
             }
             else
             {
                 if(!up.getFiles().isEmpty())
                 {
                  //seta os valores nos campos input
                 ag.setNome_agente(up.getForm().get("nome_agente").toString());
                 ag.setEmail_agente(up.getForm().get("email_agente").toString());
                 ag.setTelefone_agente(up.getForm().get("telefone_agente").toString());
                 ag.setCidade(up.getForm().get("cidade").toString());
                 ag.setRegiao(up.getForm().get("regiao").toString());
                 ag.setUnidade(up.getForm().get("unidade").toString());
                 ag.setFoto(up.getFiles().get(0).toString());
                 
                
                 }
                   agd.inserir(ag); //inseri no banco
                
                 //após inserir redireciona para a página principal
                 response.sendRedirect("index.jsp");
             }
           
            }
         }
         catch(IOException error)
         {
             throw new RuntimeException("Erro ao inserir: " + error);
         }
        %>
    </body>
</html>
