package Aulas.escola;

public class Escola {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();

        // aluno1.nome = "João Pedro";
        // aluno1.idade = 17;

        // System.out.println("O aluno " + aluno1.nome + " tem " + aluno1.idade + " anos de idade.");

        aluno1.setNome("João Anastácio");
        aluno1.setIdade(8);;
        aluno1.setSexo("Masculino");

        System.out.println("O aluno " + aluno1.getNome() + " tem " + aluno1.getIdade() + " anos e é do sexo " + aluno1.getSexo());
    }
    
}
