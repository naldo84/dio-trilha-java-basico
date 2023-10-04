package ordenacao.ordenacao.OrdenacaoNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros{
    List<Integer> listaNumeros;   

    public OrdenacaoNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        listaNumeros.add(numero);
    }

    public List<Integer> ordenarAscendente (){
        List<Integer> ordemCrescente = new ArrayList<>(listaNumeros);
        if (ordemCrescente.isEmpty()){
            throw new RuntimeException("A lista está vazia!");
        } else {
            Collections.sort(ordemCrescente);
            return ordemCrescente;
        }
    }

    public List<Integer> ordenarDescendente () {
        List<Integer> ordemDescendente = new ArrayList<>(listaNumeros);
        if (ordemDescendente.isEmpty()){
            throw new RuntimeException("A lista está vazia!");
        } else {
            ordemDescendente.sort(Collections.reverseOrder());
            return ordemDescendente;
        }
    }



    public static void main(String[] args) {
        OrdenacaoNumeros listadeNumeros = new OrdenacaoNumeros();

        listadeNumeros.adicionarNumero(10);
        listadeNumeros.adicionarNumero(4);
        listadeNumeros.adicionarNumero(1);
        listadeNumeros.adicionarNumero(15);
        listadeNumeros.adicionarNumero(22);
        listadeNumeros.adicionarNumero(34);
        listadeNumeros.adicionarNumero(8);

        System.out.println("Ordem natural: " + listadeNumeros.listaNumeros.toString());
        System.out.println("Ordem crescente: " + listadeNumeros.ordenarAscendente());
        System.out.println("Ordem decrescente: " + listadeNumeros.ordenarDescendente());
    }   
    
}