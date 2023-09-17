package candidatura;

/* CASE 2
 * Diante das inúmeras candidaturas, selecionar no máximo 5 candidatos para a entrevista onde o salário pretendido seja menor ou igual ao salário base.
 * 
 */

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo2 {
    public static void main(String[] args) {
        selecionarCandidatos();
        
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
        System.out.println("Candidatos selecionados" + candidatosSelecionados);
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1500, 2500);

    }
    
}
