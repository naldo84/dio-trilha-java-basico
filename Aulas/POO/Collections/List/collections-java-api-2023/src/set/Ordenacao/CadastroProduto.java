package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
    Set<Produto> produtoSet;

    public CadastroProduto() {
        produtoSet = new HashSet<>();
    }

    public void adicionarProduto(int codigo, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(nome, codigo, preco, quantidade));

    }

    public Set<Produto> exibirProdutoPorNome(){
        Set<Produto> produtoPorNome = new TreeSet<>(produtoSet);

        return produtoPorNome;
    }

    public Set<Produto> exibirProdutoPorPreco(){
        Set<Produto> produtoPorPreco =  new TreeSet<>(new ComparatorPorPreco());
        produtoPorPreco.addAll(produtoSet);

        return produtoPorPreco;

    }


    public void exibirProduto(){
        System.out.println(produtoSet);
    }


    public static void main(String[] args) {
        CadastroProduto listaDeProdutos = new CadastroProduto();

        listaDeProdutos.adicionarProduto(2, "Notebook", 1500, 1);
        listaDeProdutos.adicionarProduto(3, "Nintendo Switch", 2100, 1);
        listaDeProdutos.adicionarProduto(4, "Super Mario RPG", 250, 5);
        listaDeProdutos.adicionarProduto(6, "Abacaxi", 2, 50);
        listaDeProdutos.adicionarProduto(6, "Pera", 2, 10);
        listaDeProdutos.adicionarProduto(7, "Pera2", 2, 10);

        listaDeProdutos.exibirProduto();

        System.out.println("Ordenação por nome: " + listaDeProdutos.exibirProdutoPorNome());

        System.out.println("Ordenação por Preço: " + listaDeProdutos.exibirProdutoPorPreco());
    }
    
}
