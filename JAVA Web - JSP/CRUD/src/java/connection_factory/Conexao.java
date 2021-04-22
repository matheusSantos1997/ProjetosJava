package connection_factory;

import java.sql.Connection; //importou a biblioteca de conexao
import java.sql.DriverManager; //importou o driverManager 
import java.sql.SQLException; //importou a biblioteca do SQLException

public class Conexao 
{
    //atributos de conexao
    private static String url;
    private static String usuario;
    private static String senha;
    private static Connection conn;
    
//classe da conexao com o banco postgreSQL 
public Connection getConexao(){ 
        
        url = "jdbc:postgresql://localhost:5432/bd_usuario";
        usuario = "postgres";
        senha = "mjcs.21091997";
       
        try
        {
           Class.forName("org.postgresql.Driver");
           conn = DriverManager.getConnection(url, usuario, senha);
           
           System.out.println("conectado com sucesso!");
        }
        catch(ClassNotFoundException | SQLException error)
        {
            throw new RuntimeException("Erro de conexao: " + error);
        }
        return conn;
    }
}
