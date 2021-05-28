import java.util.Scanner;
public class Input {
    private final Scanner scan = new Scanner(System.in);

    public int getInt(String mensagem){
        while(true){
            System.out.println(mensagem);
            String res = scan.nextLine();

            try{
                return Integer.parseInt(res); }
            catch (NumberFormatException err) {
                System.out.println("Erro");

            }
        }
    }

    public String getString(String mensagem){
        System.out.print(mensagem);
        return scan.nextLine();
    }
}