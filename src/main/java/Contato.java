public class Contato {
    private String nome;
    private String telefone;
    private String email;

    public Contato(String nome, String telefone, String email){
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }
    //Get e Set Nome.
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }//=-=-=-=-=-=-=-=-=-=

    //Get e Set Telefone.
    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
        this.telefone=telefone;
    }//=-=-=-=-=-=-=-=-=-=

    //Get e Set E-Mail.
    public String getEmail(){
        return email;
    }
    public void setEmail(String email) {
        this.email=email;
    }//=-=-=-=-=-=-=-=-=-=
}
