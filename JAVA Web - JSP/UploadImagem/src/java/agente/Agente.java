package agente;
/*
 * @author Matheus
 */
public class Agente 
{
    //atributos
    private int id_agente;
    private String nome_agente;
    private String email_agente;
    private String telefone_agente;
    private String cidade;
    private String regiao;
    private String unidade;
    private String foto;
    
    public int getId_agente() {
        return id_agente;
    }
    
    public void setId_agente(int _id_agente) {
        this.id_agente = _id_agente;
    }

    public String getNome_agente() {
        return nome_agente;
    }

    public void setNome_agente(String _nome_agente) {
        this.nome_agente = _nome_agente;
    }

    public String getEmail_agente() {
        return email_agente;
    }

    public void setEmail_agente(String _email_agente) {
        this.email_agente = _email_agente;
    }

    public String getTelefone_agente() {
        return telefone_agente;
    }

    public void setTelefone_agente(String _telefone_agente) {
        this.telefone_agente = _telefone_agente;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String _cidade) {
        this.cidade = _cidade;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String _regiao) {
        this.regiao = _regiao;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String _unidade) {
        this.unidade = _unidade;
    }
    
    public String getFoto(){
        return foto;
    }
    
    public void setFoto(String _foto){
        this.foto = _foto;
    }
}
