import java.util.List;

public class menu {
    private final Agenda agenda = new Agenda();
    private final Input input = new Input();

    public void init(){
        //Sistema de Repetição do Menu.
        while(true){
            int select = menuPrincipal();

            if (select == 1){
                Agenda.printGeral();
            }
            else if (select == 2){
                menuBuscar();
            }
            else if (select == 3){
                menuInserir();
            }
            else if (select == 4){
                menuRemover();
            }
            else if (select == 0){
                break;
            }
            else{
                System.out.println("Opção inválida!!!");
            }

            input.getString("\nAperte qualquer tecla para Prosseguir");
        }
    }//=-=-=-=-=-=-=-=-=-=

    //Menu Principal
    public int menuPrincipal(){
        System.out.println("\n\n1-Lista Geral \n2-Buscador \n3-Inserir \n4-Remover \n0-Sair\n");

        return input.getInt("Escolha sua opção: ");
    }//=-=-=-=-=-=-=-=-=-=

    //Menu de Buscas
    public void menuBuscar(){
        String val = input.getString("\nInforme o Nome, Telefone ou E-Mail desejado: ");

        List<Contato> res = Agenda.buscarNome(val);

        if (res.isEmpty()){
            res = Agenda.buscarTelefone(val);

            if (res.isEmpty()){
                res = Agenda.buscarEmail(val);
            }
        }

        if (res.isEmpty()){
            System.out.println("\n\n Nenhum Registro encontrado");
        }

        else {
            System.out.println("\n\n Registro Encontrado \n");

            for (Contato c : res) {
                c.print();
            }
        }
    }//=-=-=-=-=-=-=-=-=-=

    //Menu de inserções
    public void menuInserir(){
        Agenda.inserir(input.getString("Nome: "), input.getString("Telefone: "), input.getString("E-mail: "));
    }//=-=-=-=-=-=-=-=-=-=

    //menu de remoções.
    public void menuRemover(){

        }

    }//=-=-=-=-=-=-=-=-=-=
}