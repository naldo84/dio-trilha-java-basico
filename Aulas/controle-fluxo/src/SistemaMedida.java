import java.util.Locale;
import java.util.Scanner;

public class SistemaMedida {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite a Media (P/M/G)");
        String medida = scan.nextLine();

        switch (medida) {
            case "P" : System.out.println("Pequeno"); break;
            case "M" : System.out.println("Médio"); break;
            case "G" : System.out.println("Grande"); break;
            default : System.out.println("Medida Indefinida");
        }

    }
    
}
