package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* CASE 4
 * O RH deverá realizar uma ligação com no máximo 3 tentativas para cada candidato selecionado e caso o candidato atenda, imprimi
 *  " - Conseguimos contato com o candidato [candidato] após [tentativas] tentativa(s)"
 *  " - Do contrário imprimir "Não conseguimo contato com o [candidato]"
 */

public class ProcessoSeletivo4 {
    public static void main(String[] args) {

        String[] candidatos = {"Felipe", "Pedro", "Marcia", "Ivete", "João"};

        for (int i = 0; i < candidatos.length; i++){
            String candidato = candidatos[i];
            entrarEmContato(candidato);
        }
        
             
    }

    static void entrarEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;

            if (continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("Contato realizado com sucesso!!");

        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu)
            System.out.println("Conseguimos contato com o candidato " + candidato + " na " + tentativasRealizadas + "ª tentativa.");
        else 
            System.out.println("Não conseguimos contato com o candidato " + candidato + " após o máximo de " + tentativasRealizadas + " tentativas");

    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }



    static void imprimirSelecionados() {
        String[] candidatos = {"Felipe", "Pedro", "Marcia", "Ivete", "João"};

        System.out.println("Impressão usando o FOR normal: ");
        for (int i = 0; i < candidatos.length; i++){
            System.out.println("O candidato de n° " + (i + 1) + " é o " + candidatos[i]);
        }

        System.out.println("\nImpressão usando o FOREACH");
        for (String candidato: candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);

            
        }

    }

    static void selecionarCandidatos(){
        String[] candidatos = {"Felipe", "Pedro", "Marcia", "Ivete", "João", "Maria", "Josefina", "Rodolfo", "Paulo", "Maria Joaquina", "Luciana", "Sônia"};

        int candidatosSelecionados = 0;
        int candidadtoAtual = 0;
        double salarioBase = 2000;
        while (candidatosSelecionados < 5 && candidadtoAtual < candidatos.length){
            String candidato = candidatos[candidadtoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " tem o salário pretendido de R$ " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                candidatosSelecionados++;

            }
            candidadtoAtual++;


        }
        System.out.println("Candidatos selecionados: " + candidatosSelecionados);
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1500, 2500);

    }
    
}