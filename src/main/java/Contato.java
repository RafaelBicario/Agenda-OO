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

    //Validação
    public int validacao(){
        if (this.nome.isBlank() | this.telefone.isBlank() | this.email.isBlank()){ return 1; }
        if (this.email.contains(".") | this.email.contains(".")){ return 2; }
       return 0;
    }//=-=-=-=-=-=-=-=-=-=
    public void print(){
        System.out.println(this.getNome()+"\t"+this.getTelefone()+"\t"+this.getEmail());
    }
}
