package set.Ordenacao;

import java.util.Comparator;

public class Produto implements Comparable<Produto>{
    private String nome;
    private int codigo;
    private double preco;
    private int quantidade;
    
    public Produto(String nome, int codigo, double preco, int quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    @Override
    public int compareTo(Produto produto) {
        return nome.compareToIgnoreCase(produto.getNome());

    }


    public String getNome() {
        return nome;
    }
    public int getCodigo() {
        return codigo;
    }
    public double getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigo;
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (codigo != other.codigo)
            return false;
        return true;
    }


    @Override
    public String toString() {
        return "\nProduto: " + nome + ", codigo: " + codigo + ", preco: " + preco + ", quantidade:" + quantidade;
    }    
}

class ComparatorPorPreco implements Comparator<Produto>{

    @Override
    public int compare(Produto prod1, Produto prod2) {
        return Double.compare(prod1.getPreco(), prod2.getPreco());
    }
    
}