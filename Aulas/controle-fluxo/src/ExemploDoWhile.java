import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");

        do {

            System.out.print("Telefone tocando...");
            
        } while(tocando());

        System.out.println(("Alô!!!"));  
    }
    
    public static boolean tocando() {
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? " + atendeu);

        return !atendeu;
    }
}
