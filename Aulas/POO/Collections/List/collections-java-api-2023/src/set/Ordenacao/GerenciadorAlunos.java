package set.Ordenacao;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }
    
    public void adicionarAluno(String nome, Long matricula, double media){
        alunoSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula){
        Aluno alunoRemover = null;

        if (alunoSet.isEmpty()){
            throw new RuntimeException("Lista vazia!");
        } else {
            for (Aluno aluno : alunoSet) {
                if (aluno.getMatricula() == matricula){
                    alunoRemover = aluno;
                } 
            }
            alunoSet.remove(alunoRemover);
        }
    }

    public void exibirAlunos(){
        System.out.println(alunoSet);
    }

    public Set<Aluno> exibirAlunoPorNome(){
        Set<Aluno> exibirAlunoPorNome = new TreeSet<>(alunoSet);
        return exibirAlunoPorNome;
    }

    public void exibirAlunoPorMedia(){
        Set<Aluno> alunoPorMedia = new TreeSet<>(new comparatorPorNota());
        alunoPorMedia.addAll(alunoSet);
        System.out.println(alunoPorMedia);

    }

    public static void main(String[] args) {
        GerenciadorAlunos listaAlunos = new GerenciadorAlunos();

        listaAlunos.adicionarAluno("Pedro", 10L, 8.5);
        listaAlunos.adicionarAluno("Ivete", 11L, 10);
        listaAlunos.adicionarAluno("Naldo", 12L, 9);
        listaAlunos.adicionarAluno("Leda",  15L, 5);
        listaAlunos.adicionarAluno("Sinha", 13L, 7);
        listaAlunos.adicionarAluno("Ninha", 14L, 8);

        System.out.println("Lista normal: ");
        listaAlunos.exibirAlunos();

        System.out.println("\nLista ordenada por Nome: " + listaAlunos.exibirAlunoPorNome());

        System.out.println("\nLista ordenada por Média: ") ;
        listaAlunos.exibirAlunoPorMedia();

    }
    
}