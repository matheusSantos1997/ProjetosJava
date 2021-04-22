package user;

public class Usuario 
{
    private int codigo;
    private String nome;
    private String endereco;
 

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int _codigo) {
        this.codigo = _codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String _nome) {
        this.nome = _nome;
    }
    
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String _endereco){
        this.endereco = _endereco;
    }
}
