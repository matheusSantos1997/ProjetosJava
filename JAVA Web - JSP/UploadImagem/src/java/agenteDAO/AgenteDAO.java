package agenteDAO;
/* @author Matheus
 */

import connection_factory.Conexao; //importou a conexao com o banco
import java.sql.Connection; //importou a biblioteca privada Connection do atributo coon
import java.sql.PreparedStatement; //metodo de preparação para inserir os parametros evitando ataques sqlInjection
import java.sql.Statement; 
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import agente.Agente; //importou a classe Usuario
import java.io.IOException;

public class AgenteDAO 
{
    private final Connection conn; //atributo de conexao
    private PreparedStatement stmt; //atributo de PreparedStatement
    private Statement st; //objeto Statement executa instruções SQL ao banco de dados
    private ResultSet rs; //Representa o conjunto de resultados de uma tabela no banco de dados
    
    //é uma implementação da interface List que utiliza um vetor para armazenar elementos.
    private final ArrayList<Agente>mostrar = new ArrayList<>();
    
    //criou o método construtor 
    public AgenteDAO() throws IOException
    {
        //chamando a conexao com o banco dentro do metodo construtor UsuarioDAO()
        conn = new Conexao().getConexao();  
    }
    
    //método responsavel por inserir os dados
     public void inserir(Agente agentes)
     {
         String sql = "INSERT INTO agentes (nome_agente, email_agente, telefone_agente, cidade, regiao, unidade, foto) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try
        {
            stmt = conn.prepareStatement(sql); //passou a variavel sql para preparar a query
            stmt.setString(1, agentes.getNome_agente());
            stmt.setString(2, agentes.getEmail_agente());
            stmt.setString(3, agentes.getTelefone_agente());
            stmt.setString(4, agentes.getCidade());
            stmt.setString(5, agentes.getRegiao());
            stmt.setString(6, agentes.getUnidade());
            stmt.setString(7, agentes.getFoto());
            stmt.execute();
            stmt.close();
        }
        catch(SQLException error)
        {
            throw new RuntimeException("Erro ao inserir: " + error);
        }
     }
     
    //método responsável por editar os dados
    public void editar(Agente agentes) 
    {
        //vai alterar os dados na tabela
        String sql = "UPDATE agentes SET nome_agente = ?, email_agente = ?, telefone_agente = ?, cidade = ?, regiao = ?, unidade = ?, foto = ? WHERE id_agente = ?";
        
        try
        {
            stmt = conn.prepareStatement(sql); //passou a variavel sql para preparar a query
            stmt.setString(1, agentes.getNome_agente());
            stmt.setString(2, agentes.getEmail_agente());
            stmt.setString(3, agentes.getTelefone_agente());
            stmt.setString(4, agentes.getCidade());
            stmt.setString(5, agentes.getRegiao());
            stmt.setString(6, agentes.getUnidade());
            stmt.setString(7, agentes.getFoto());
            stmt.setInt(8, agentes.getId_agente());
            stmt.executeUpdate();
            stmt.close();
           
        }
        catch(SQLException error)
        {
            throw new RuntimeException("Erro ao editar: " + error);
        }
    }
    
    //método responsavel por excluir o usuario
    public void excluir(int id)
    {
        //vai excluir os dados na tabela
        String sql = "DELETE FROM agentes WHERE id_agente = " + id;
        
        try
        {
            st = conn.createStatement();
            st.execute(sql);
            st.close();
        }
        catch(SQLException error)
        {
            throw new RuntimeException("Erro ao excluir: " + error);
        }
    }
    
    //método para mostrar os dados do usuario
    public ArrayList<Agente>mostrarTodos()
    {    
         String sql = "SELECT * FROM agentes order by id_agente";
         try
        {
           st = conn.createStatement();
           rs = st.executeQuery(sql);
           
         //enquanto existir um proximo registro
         while(rs.next())
        {
            Agente ag = new Agente(); //instanciou a classe Agente
            //Upload up = new Upload();
            
            ag.setId_agente(rs.getInt("id_agente"));
            ag.setNome_agente(rs.getString("nome_agente")); //vai pegar o nome do agente e mostrar
            ag.setEmail_agente(rs.getString("email_agente"));
            ag.setTelefone_agente(rs.getString("telefone_agente"));
            ag.setCidade(rs.getString("cidade"));
            ag.setRegiao(rs.getString("regiao"));
            ag.setUnidade(rs.getString("unidade"));
            ag.setFoto(rs.getString("foto"));
            mostrar.add(ag); //adiciona todos os atributos do usuario dentro da do ArrayList chamado lista
        }
        
        }
        catch(SQLException erro)
        {
            throw new RuntimeException("Erro ao listar os dados: " + erro);
        }
        return mostrar; //vai retornar o statement
    }
   
}
