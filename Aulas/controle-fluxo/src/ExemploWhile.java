import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double valorTotalDoces = 0;
        int contDoces = 0;

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o valor da sua mesada: R$");
        double mesada = scanner.nextDouble();

        while(mesada > 0){
            double valorDoce = valorAleatorio();
            
            if (valorDoce > mesada){
                System.out.printf("\nNão é possível comprar esse doce no valor de R$ %.2f", valorDoce);
                break;
            }
            
            System.out.printf("\nDoce do valor: R$ %.2f foi adicionado ao carrinho", valorDoce);
            mesada -= valorDoce;
            valorTotalDoces += valorDoce;
            ++contDoces;  
        }

        scanner.close();

        System.out.println("\n-------------------------------------------------------------");
        System.out.printf("\nValor dos doces: R$ %.2f", valorTotalDoces);
        System.out.printf("\nTroco da Mesada: R$ %.2f", mesada);
        System.out.printf("\n%s gastou toda a sua mesada em %d doces!\n", nome, contDoces);  
    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 10);
    }
    
}
