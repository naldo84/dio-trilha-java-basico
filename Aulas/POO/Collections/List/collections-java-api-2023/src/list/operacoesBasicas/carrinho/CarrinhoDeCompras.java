package list.operacoesBasicas.carrinho;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaItens;

    public CarrinhoDeCompras() {
        this.listaItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        listaItens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item item : listaItens) {
            if (item.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(item);
            }            
        }
        listaItens.removeAll(itensParaRemover);
    }

    public double calcularValorTotal(){
        double valorTotal = 0;
        double valorItem = 0;
        for (Item item : listaItens) {
            valorItem = item.getQuantidade() * item.getPreco();
            valorTotal += valorItem;
        }
        return valorTotal;
    }

    public void exibirItens(){
        System.out.println(listaItens);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras novaCompra = new CarrinhoDeCompras();

        novaCompra.adicionarItem("Notebook", 1500, 1);
        novaCompra.adicionarItem("Bolacha", 2.50, 4);
        novaCompra.adicionarItem("Teste 1", 10, 4);
        novaCompra.adicionarItem("Pão", 0.50, 5);
        novaCompra.adicionarItem("Danone", 1, 5);

        System.out.println(novaCompra.calcularValorTotal());

        novaCompra.removerItem("bolacha");
        System.out.println(novaCompra.calcularValorTotal());

        novaCompra.exibirItens();
    }
}