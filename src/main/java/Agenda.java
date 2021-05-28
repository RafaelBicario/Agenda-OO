import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos = new ArrayList<>();

    //inserção de um novo contato na agenda.
    public void inserir(String nome, String telefone, String email){
        this.contatos.add(new Contato(nome, telefone, email));
    }//=-=-=-=-=-=-=-=-=-=


    //Remove da agenda o contato passado por parâmetro.
    public void remover (Contato contato){
        this.contatos.remove(contato);
    }//=-=-=-=-=-=-=-=-=-=


    //busca por contatos dentro da agenda com base no nome.Só precisa retornar os contatos cujos nomes correspondem exatamente ao termo buscado.
    public List<Contato> BuscarNome(String nome){
        List<Contato> resultado = new ArrayList<>();
        for (Contato c : this.contatos){
            if (c.getNome().equals(nome)){
                resultado.add(c);
            }
        }
        return resultado;
    }//=-=-=-=-=-=-=-=-=-=


    public void print(){
        for(Contato c : this.contatos){
            System.out.println(c.getNome());
        }
    }//=-=-=-=-=-=-=-=-=-=
}
