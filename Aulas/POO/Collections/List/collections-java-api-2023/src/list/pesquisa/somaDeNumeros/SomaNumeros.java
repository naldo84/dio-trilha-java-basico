package list.pesquisa.somaDeNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    List<Integer> listaNumeros;

    public SomaNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        listaNumeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (Integer numero : listaNumeros) {
            soma += numero;

        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maior = Integer.MIN_VALUE;
        if (!listaNumeros.isEmpty()) {            
            for (Integer numero : listaNumeros) {
                if (numero > maior) {
                    maior = numero;
                }
            }
        } else {
            throw new RuntimeException("A lista está vazia!");
        }

        return maior;
    }

    public int encontrarMenorNumero(){
        int menor = Integer.MAX_VALUE;
        if (!listaNumeros.isEmpty()){
            for (Integer numero : listaNumeros) {
                if (numero < menor){
                    menor = numero;
                }
            }
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
        return menor;
    }

    public void exibirNumeros(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Lista de Números: " + listaNumeros;
    }

    public static void main(String[] args) {
        SomaNumeros numeros = new SomaNumeros();

        numeros.adicionarNumero(5);
        numeros.adicionarNumero(45);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(55);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(6);

        numeros.exibirNumeros();

        System.out.println("Soma dos nros: " + numeros.calcularSoma());

        System.out.println("Maior Valor: " + numeros.encontrarMaiorNumero());

        System.out.println("Menor Valor: " + numeros.encontrarMenorNumero());


    }
}
