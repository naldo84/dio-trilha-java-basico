package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo3 {
    public static void main(String[] args) {
        
      imprimirSelecionados();
        
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

        for (String ativo : candidatos) {
            System.out.println(ativo);
            
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
