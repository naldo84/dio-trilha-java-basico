package ordenacao.ordenacao.ordenacaoPessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class OrdenacaoPessoa {
    List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    } 

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);

        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new CompararPessoaPorAltura());

        return pessoasPorAltura;
    }  

    public static void main(String[] args) {
        OrdenacaoPessoa ordenarPessoa = new OrdenacaoPessoa();

        ordenarPessoa.adicionarPessoa("Erinaldo", 39, 1.63);
        ordenarPessoa.adicionarPessoa("Ivete", 33, 1.49);
        ordenarPessoa.adicionarPessoa("Sileide", 42, 1.68);
        ordenarPessoa.adicionarPessoa("Ciene", 41, 1.55);
        ordenarPessoa.adicionarPessoa("Sonia", 42, 1.53);
        ordenarPessoa.adicionarPessoa("Grazy", 3, 0.80);
        ordenarPessoa.adicionarPessoa("José", 65, 1.62);

        System.out.println("Ordenação natural: " + ordenarPessoa.pessoaList);


        System.out.println("Ordem por Idade: " + ordenarPessoa.ordenarPorIdade());

         System.out.println("\nOrdem por Altura: " + ordenarPessoa.ordenarPorAltura());
   
    }
}
