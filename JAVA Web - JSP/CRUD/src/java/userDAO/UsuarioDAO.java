package userDAO;

import connection_factory.Conexao; //importou a conexao com o banco
import java.io.IOException;
import java.sql.Connection; //importou a biblioteca privada Connection do atributo coon
import java.sql.PreparedStatement; //metodo de preparação para inserir os parametros evitando ataques sqlInjection
import java.sql.Statement; 
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import user.Usuario; //importou a classe Usuario

public class UsuarioDAO 
{
   
    private final Connection conn; //atributo de conexao
    private PreparedStatement stmt; //atributo de 
    private Statement st; //bjeto Statement executa instruções SQL ao banco de dados
    private ResultSet rs; //Representa o conjunto de resultados de uma tabela no banco de dados
    
    //é uma implementação da interface List que utiliza um vetor para armazenar elementos.
    private final ArrayList<Usuario>lista = new ArrayList<>(); 
    

    /**
    *
    * @throws IOException
    */
    
    //criou o método construtor 
    public UsuarioDAO() throws IOException
     {
        //instanciando a conexao com o banco dentro do metodo construtor UsuarioDAO()
        conn = new Conexao().getConexao();         
     }
     
     //método responsavel por inserir os dados
     public void inserir(Usuario usuarios)
     {
         String sql = "INSERT INTO usuarios (nome, endereco) VALUES (?, ?)";
          try
        {
            stmt = conn.prepareStatement(sql); //passou a variavel sql para preparar a query
            stmt.setString(1, usuarios.getNome());
            stmt.setString(2, usuarios.getEndereco());
            stmt.execute();
            stmt.close();
        }
        catch(SQLException error)
        {
            throw new RuntimeException("Erro ao inserir: " + error);
        }
     }
     
      //método responsável por editar os dados
    public void editar(Usuario usuarios) 
    {
        //vai alterar os dados na tabela
        String sql = "UPDATE usuarios SET nome = ?, endereco = ? WHERE codigo = ?";
        
        try
        {
            stmt = conn.prepareStatement(sql); //passou a variavel sql para preparar a query
            stmt.setString(1, usuarios.getNome());
            stmt.setString(2, usuarios.getEndereco());
            stmt.setInt(3, usuarios.getCodigo());
            stmt.execute();
            stmt.close();
           
        }
        catch(SQLException error)
        {
            throw new RuntimeException("Erro ao editar: " + error);
        }
    }
    
    //método responsavel por excluir os dados

    /**
     *
     * @param id
     */
    public void excluir(int id)
    {
        //vai excluir os dados na tabela
        String sql = "DELETE FROM usuarios WHERE codigo = " + id;
        
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
    public ArrayList<Usuario>listarTodos()
    {    
         String sql = "SELECT * FROM usuarios";
         try
        {
           st = conn.createStatement();
           rs = st.executeQuery(sql);
           
         //enquanto existir um proximo registro
         while(rs.next())
        {
            Usuario u = new Usuario(); //instanciou a classe Usuario 
           //u.setCodigo(rs.getInt("codigo")); //pegando o codigo do usuario
            u.setCodigo(rs.getInt("codigo"));
            u.setNome(rs.getString("nome")); //pegando o nome do usuario
            u.setEndereco(rs.getString("endereco")); //pegando o endereco do usuario
            lista.add(u); //adiciona todos os atributos do usuario dentro da do ArrayList chamado lista
        }
        
        }
        catch(SQLException erro)
        {
            throw new RuntimeException("Erro ao listar os dados: " + erro);
        }
        return lista; //vai retornar a lista
    }
}
