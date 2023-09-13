import java.util.Locale;
import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite uma nota: ");
        double nota = scan.nextDouble();

        if (nota >= 7)
            System.out.println("Aprovado");
        else if (nota >= 5 && nota < 7) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        //UTILIZANDO O OPERADOR TERNÁRIO
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";

        System.out.println("Resultado (C/ operador Ternário): " + resultado);

        //UTILIZANDO O OPERADOR TERNÁRIO COM IF ENCADEADO
        String resultado2 = nota >= 7 ? "Aprovado" : nota >=5 && nota < 7 ? "Recuperação" : "Reprovado";

        System.out.println("Resultado do if encadeado utilizando o operador Ternário: " + resultado2);

        scan.close();
        
    }
    
}
