import java.util.Locale;
import java.util.Scanner;

public class SobreMim2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Digite o seu nome: ");
        String nome =  scan.next();

        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = scan.next();

        System.out.print("Digite a sua idade: ");
        int idade = scan.nextInt();


        System.out.print("Digite o sua altura (m): ");
        double altura = scan.nextDouble();


        System.out.println("\nOlá, me chamos " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Possuo " + altura + "cm de altura");


    }
}
