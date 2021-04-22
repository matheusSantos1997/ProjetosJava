<%-- 
    Document   : cadastro
    Created on : 26/01/2020, 01:11:17
    Author     : Matheus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro Agentes</title>
    </head>
    <body>
        <h1>Cadastrar Agente da Inovação</h1>
        <form action="cadastrar_submit.jsp" method="post" enctype="multipart/form-data">
            <label>nome do agente:</label></br>
            <input type="text" name="nome_agente" /></br></br>
            
            <label>E-mail:</label></br>
            <input type="email" name="email_agente" /></br></br>
            
            <label>telefone:</label></br>
            <input type="text" name="telefone_agente" id="telefone" /></br></br>
            
            <label>Cidade:</label></br>
            <input type="text" name="cidade" /></br></br>
            
            <label>Região:</label></br>
            <select name="regiao">
                <option></option>
                <option value="norte">Norte</option>
                <option value="sul">Sul</option>
                <option value="sudeste">Sudeste</option>
                <option value="centro-oeste">Centro-Oeste</option>
                <option value="nordeste">Nordeste</option>
            </select></br></br>
            
            <label>Unidade:</label></br>
            <select name="unidade">
                <option></option>
                <option value="Adamantina - Fatec Adamantina">Adamantina - Fatec Adamantina</option>
                <option value="Americana - Fatec Americana - Ministro Ralph Biasi">Americana - Fatec Americana - Ministro Ralph Biasi</option>
                <option value="Araçatuba - Fatec Araçatuba - Prof. Fernando Amaral de Almeida Prado">Araçatuba - Fatec Araçatuba - Prof. Fernando Amaral de Almeida Prado</option>
                <option value="Araraquara - Fatec Araraquara">Araraquara - Fatec Araraquara</option>
                <option value="Araras - Fatec Araras">Araras - Fatec Araras</option>
                <option value="Assis - Fatec Assis">Assis - Fatec Assis</option>
                <option value="Barueri - Fatec Barueri - Padre Danilo José de Oliveira Ohl">Barueri - Fatec Barueri - Padre Danilo José de Oliveira Ohl</option>
                <option value="Bauru - Fatec Bauru">Bauru - Fatec Bauru</option>
                <option value="Bebedouro - Fatec Bebedouro - Jorge Caram Sabbag">Bebedouro - Fatec Bebedouro - Jorge Caram Sabbag</option>
                <option value="Botucatu - Fatec Botucatu">Botucatu - Fatec Botucatu</option>
                <option value="Bragança Paulista - Fatec Bragança Paulista - Jornalista Omair Fagundes de Oliveira">Bragança Paulista - Fatec Bragança Paulista - Jornalista Omair Fagundes de Oliveira</option>
                <option value="Campinas - Fatec Campinas">Campinas - Fatec Campinas</option>
                <option value="Capão Bonito - Fatec Capão Bonito">Capão Bonito - Fatec Capão Bonito</option>
                <option value="Carapicuíba - Fatec Carapicuíba">Carapicuíba - Fatec Carapicuíba</option>
                <option value="Catanduva - Fatec Catanduva">Catanduva - Fatec Catanduva</option>
                <option value="Cotia - Fatec Cotia">Cotia - Fatec Cotia</option>
                <option value="Cruzeiro - Fatec Cruzeiro - Prof. Waldomiro May">Cruzeiro - Fatec Cruzeiro - Prof. Waldomiro May</option>
                <option value="Diadema - Fatec Diadema - Luigi Papaiz">Diadema - Fatec Diadema - Luigi Papaiz</option>
                <option value="Ferraz de Vasconcelos - Fatec Ferraz de Vasconcelos">Ferraz de Vasconcelos - Fatec Ferraz de Vasconcelos</option>
                <option value="Franca - Fatec Franca - Dr. Thomaz Novelino">Franca - Fatec Franca - Dr. Thomaz Novelino</option>
                <option value="Franco da Rocha - Fatec Franco da Rocha">Franco da Rocha - Fatec Franco da Rocha</option>
                <option value="Garça - Fatec Garça - Dep. Julio Julinho Marcondes de Moura">Garça - Fatec Garça - Dep. Julio Julinho Marcondes de Moura</option>
                <option value="Guaratinguetá - Fatec Guaratinguetá - Prof. João Mod">Guaratinguetá - Fatec Guaratinguetá - Prof. João Mod</option>
                <option value="Guarulhos - Fatec Guarulhos">Guarulhos - Fatec Guarulhos</option>
                <option value="Indaiatuba - Fatec Indaiatuba - Dr. Archimedes Lammoglia">Indaiatuba - Fatec Indaiatuba - Dr. Archimedes Lammoglia</option>
                <option value="Itapetininga - Fatec Itapetininga - Prof. Antonio Belizandro Barbosa Rezende">Itapetininga - Fatec Itapetininga - Prof. Antonio Belizandro Barbosa Rezende</option>
                <option value="Itapira - Fatec Itapira - Ogari de Castro Pacheco">Itapira - Fatec Itapira - Ogari de Castro Pacheco</option>
                <option value="Itaquaquecetuba - Fatec Itaquaquecetuba">Itaquaquecetuba - Fatec Itaquaquecetuba</option>
                <option value="Itatiba - Fatec Itatiba">Itatiba - Fatec Itatiba</option>
                <option value="Itu - Fatec Itu - Dom Amaury Castanho">Itu - Fatec Itu - Dom Amaury Castanho</option>
                <option value="Jaboticabal - Fatec Jaboticabal - Nilo de Stéfani">Jaboticabal - Fatec Jaboticabal - Nilo de Stéfani</option>
                <option value="Jacareí - Fatec Jacareí- Prof. Francisco de Moura">Jacareí - Fatec Jacareí- Prof. Francisco de Moura</option>
                <option value="Jales - Fatec Jales - Prof. José Camargo">Jales - Fatec Jales - Prof. José Camargo</option>
                <option value="Jaú - Fatec Jahu">Jaú - Fatec Jahu</option>
                <option value="Jundiaí - Fatec Jundiaí - Deputado Ary Fossen">Jundiaí - Fatec Jundiaí - Deputado Ary Fossen</option>
                <option value="Lins - Fatec Lins - Prof. Antonio Seabra">Lins - Fatec Lins - Prof. Antonio Seabra</option>
                <option value="Marília - Fatec Marília - Estudante Rafael Almeida Camarinha">Marília - Fatec Marília - Estudante Rafael Almeida Camarinha</option>
                <option value="Matão - Fatec Matão">Matão - Fatec Matão</option>
                <option value="Mauá - Fatec Mauá">Mauá - Fatec Mauá</option>
                <option value="Mococa - Fatec Mococa">Mococa - Fatec Mococa</option>
                <option value="Mogi das Cruzes - Fatec Mogi das Cruzes">Mogi das Cruzes - Fatec Mogi das Cruzes</option>
                <option value="Mogi Mirim - Fatec Mogi Mirim - Arthur de Azevedo">Mogi Mirim - Fatec Mogi Mirim - Arthur de Azevedo</option>
                <option value="Osasco - Fatec Osasco - Pref. Hirant Sanazar">Osasco - Fatec Osasco - Pref. Hirant Sanazar</option>
                <option value="Ourinhos - Fatec Ourinhos">Ourinhos - Fatec Ourinhos</option>
                <option value="Pindamonhangaba - Fatec Pindamonhangaba">Pindamonhangaba - Fatec Pindamonhangaba</option>
                <option value="Piracicaba - Fatec Piracicaba - Dep. Roque Trevisan">Piracicaba - Fatec Piracicaba - Dep. Roque Trevisan</option>
                <option value="Pompéia - Fatec Pompéia - Shunji Nishimura">Pompéia - Fatec Pompéia - Shunji Nishimura</option>
                <option value="Praia Grande - Fatec Praia Grande">Praia Grande - Fatec Praia Grande</option>
                <option value="Presidente Prudente - Fatec Presidente Prudente">Presidente Prudente - Fatec Presidente Prudente</option>
                <option value="Ribeirão Preto - Fatec Ribeirão Preto">Ribeirão Preto - Fatec Ribeirão Preto</option>
                <option value="Santana de Parnaíba - Fatec Santana de Parnaíba">Santana de Parnaíba - Fatec Santana de Parnaíba</option>
                <option value="Santo André - Fatec Santo André">Santo André - Fatec Santo André</option>
                <option value="Santos - Fatec Baixada Santista - Rubens Lara">Santos - Fatec Baixada Santista - Rubens Lara</option>
                <option value="São Bernardo do Campo - Fatec São Bernardo do Campo - Adib Moisés Dib">São Bernardo do Campo - Fatec São Bernardo do Campo - Adib Moisés Dib</option>
                <option value="São Caetano do Sul - Fatec São Caetano do Sul - Antonio Russo">São Caetano do Sul - Fatec São Caetano do Sul - Antonio Russo</option>
                <option value="São Carlos - Fatec São Carlos">São Carlos - Fatec São Carlos</option>
                <option value="São José do Rio Preto - Fatec São José do Rio Preto">São José do Rio Preto - Fatec São José do Rio Preto</option>
                <option value="São José dos Campos - Fatec São José dos Campos - Prof. Jessen Vidal">São José dos Campos - Fatec São José dos Campos - Prof. Jessen Vidal</option>
                <option value="São Paulo - Fatec Ipiranga - Pastor Enéas Tognini">São Paulo - Fatec Ipiranga - Pastor Enéas Tognini</option>
                <option value="São Paulo - Fatec Itaquera - Prof. Miguel Reale">São Paulo - Fatec Itaquera - Prof. Miguel Reale</option>
                <option value="São Paulo - Fatec São Paulo">São Paulo - Fatec São Paulo</option>
                <option value="São Paulo - Fatec Sebrae">São Paulo - Fatec Sebrae</option>
                <option value="São Paulo - Fatec Tatuapé - Victor Civita">São Paulo - Fatec Tatuapé - Victor Civita</option>
                <option value="São Paulo - Fatec Zona Leste">São Paulo - Fatec Zona Leste</option>
                <option value="São Paulo - Fatec Zona Sul - Dom Paulo Evaristo Arns">São Paulo - Fatec Zona Sul - Dom Paulo Evaristo Arns</option>
                <option value="São Roque - Fatec São Roque">São Roque - Fatec São Roque</option>
                <option value="São Sebastião - Fatec São Sebastião">São Sebastião - Fatec São Sebastião</option>
                <option value="Sertãozinho - Fatec Sertãozinho - Dep. Waldyr Alceu Trigo">Sertãozinho - Fatec Sertãozinho - Dep. Waldyr Alceu Trigo</option>
                <option value="Sorocaba - Fatec Sorocaba - José Crespo Gonzales">Sorocaba - Fatec Sorocaba - José Crespo Gonzales</option>
                <option value="Sumaré - Fatec Sumaré">Sumaré - Fatec Sumaré</option>
                <option value="Taquaritinga - Fatec Taquaritinga">Taquaritinga - Fatec Taquaritinga</option>
                <option value="Tatuí - Fatec Tatuí - Prof. Wilson Roberto Ribeiro de Camargo">Tatuí - Fatec Tatuí - Prof. Wilson Roberto Ribeiro de Camargo</option>
                <option value="Taubaté - Fatec Taubaté">Taubaté - Fatec Taubaté</option>
            </select></br></br>
            <input type="file" name="foto" />
            </br></br>
            <input type="submit" value="Cadastrar" />
        </form>
        <script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
        <script type="text/javascript" src="js/jquery.mask.min.js"></script>
        <script type="text/javascript" src="js/mask.js"></script>
    </body>
</html>
