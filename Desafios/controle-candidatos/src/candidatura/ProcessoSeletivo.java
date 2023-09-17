package candidatura;
/* CASE 1
 * Em um processo seletivo há uma valor base salarial de R$ 2000,00 e o salário pretendido pelo candidato.
 *      - Se o salário base for maior que o salário pretendido, imprimir: "LIGAR PARA O CANDIDATO"
 *      - Senão se o salário base for igual ao salário pretendido, imprimir: "LIGAR PARA O CANDIDATO COM CONTRAPROPOSTA"
 *      - Senão imprima: "AGUARDANDO RESULTADO DEMAIS CANDIDATOS"
 * 
 */


public class ProcessoSeletivo {
    public static void main(String[] args) {

        System.out.println(" -- PROCESSO SELETIVO -- ");

        // analisarCandidato(1900);
        // analisarCandidato(2200);
        // analisarCandidato(2000);

        
    }

    static void selecionarCandidatos(){
        String[] candidatos = {"Felipe", "Pedro", "Marcia", "Ivete", "João", "Maria", "Josefina", "Rodolfo", "Paulo", "Maria Joaquina", "Luciana", "Sônia"};
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRAPROPOSTA");
        } else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}