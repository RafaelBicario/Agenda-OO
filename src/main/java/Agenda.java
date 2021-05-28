import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private final List<Contato> Contato = new ArrayList<>();

    //inserção de um novo contato na agenda.
    public static void inserir(String nome, String telefone, String email){
        Contato c = new Contato(nome, telefone, email);
        int code = c.validacao();
        if (code==0){
            this.Contato.add(c);
        }
        if(code==1){ System.out.println("Há Campos sem dados!"); }

        else if (code==2){ System.out.println(" E-Mail informado é inválido! "); }
    }//=-=-=-=-=-=-=-=-=-=


    //Remove da agenda o contato passado por parâmetro.
    public void remover (Contato contato){
        this.Contato.remove(contato);
    }//=-=-=-=-=-=-=-=-=-=


    //busca por contatos dentro da agenda com base no nome.Só precisa retornar os contatos cujos nomes correspondem exatamente ao termo buscado.
    public static List<Contato> buscarNome(String nome){
        List<Contato> resultado = new ArrayList<>();
        for (Contato c : this.contatos){
            if (c.getNome().equals(nome)){
                resultado.add(c);
            }
        }
        return resultado;
    }//=-=-=-=-=-=-=-=-=-=


    //Busca um Telefone Especifico.
    public static List<Contato> buscarTelefone(String telefone){
        List<Contato> resultado = new ArrayList<>();

        for(Contato c : this.contatos){
            if (c.getTelefone().equals(telefone)){
                resultado.add(c);
            }
        }
        return resultado;
    }//=-=-=-=-=-=-=-=-=-=


    // Busca um E-mail Especifico
    public static List<Contato> buscarEmail(String email){
        List<Contato> resultado = new ArrayList<>();
        for (Contato c : this.contato){
            if (c.getEmail().equals(email)){
                resultado.add(c);
            }
        }
        return resultado;
    }//=-=-=-=-=-=-=-=-=-=


    //Cria uma impressão Geral
    public static void printGeral(){
        for(Contato c : this.Contato){
            System.out.println(c.getNome());
            System.out.println(c.getTelefone());
            System.out.println(c.getEmail());
        }
    }//=-=-=-=-=-=-=-=-=-=
}

