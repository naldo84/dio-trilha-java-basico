public class ExemploForArray {
    public static void main(String[] args) {
        String[] nomes = {"Naldo", "Eris", "Pedro", "Maria", "Joaquina", "Florentina"};

        for (int i = 0; i < nomes.length; i++){
            System.out.println("Aluno " + i + ": " + nomes[i]);
        }

        //Usando o foreach
        for (String nome : nomes) {
            System.out.println("Nome do Aluno: " + nome);
            
        }
    }
}
