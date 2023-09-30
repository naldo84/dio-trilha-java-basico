package operacoesBasicas.CatalogoLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> listaLivros;

    //construtor que define o listalivros instanciando um novo arraylist
    public CatalogoLivros() { this.listaLivros = new ArrayList<>(); }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        listaLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();

        if (!listaLivros.isEmpty()){
            for (Livro livro : listaLivros) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(livro);
                }  
            }
        } else { 
            System.out.println("Lista Vazia!!");
        }

        return livrosPorAutor;   
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> listaPorAno= new ArrayList<>();
        
        if (!listaLivros.isEmpty()){
            for (Livro livro : listaLivros) {
                if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal){
                    listaPorAno.add(livro);
                }   
            }
        }
        return listaPorAno;        
    }

        public List<Livro> pesquisarPorIntervaloAnos(int ano){
        List<Livro> listaPorAno= new ArrayList<>();
        
        if (!listaLivros.isEmpty()){
            for (Livro livro : listaLivros) {
                if (livro.getAnoPublicacao() == ano){
                    listaPorAno.add(livro);
                }   
            }
        }
        return listaPorAno;        
    }

    public Livro pesquisarPorTitulo (String titulo){
        Livro livroPorTitulo = null;
        for (Livro livro : listaLivros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)){
                livroPorTitulo = livro;
                break;
            }
        }
        return livroPorTitulo;
        
    }

    public void listaLivros(){
        System.out.println(listaLivros);
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        System.out.println("Lista de Livros: ");
        catalogoLivros.adicionarLivro("A volta dos que não foram", "Suminildo", 2000);
        catalogoLivros.adicionarLivro("A volta dos que não foram", "Suminildo", 2030);
        catalogoLivros.adicionarLivro("O Retorno da volta dos que não foram ", "Suminildo", 2010);
        catalogoLivros.adicionarLivro("O barulho do silêncio", "Gritonildo", 2020);
        catalogoLivros.adicionarLivro("Subindo pra cima", "Subinildo", 2015);
        catalogoLivros.adicionarLivro("Descendo pra baixo - O Retorno", "Subinildo", 2000);
        catalogoLivros.adicionarLivro("Descendo pra baixo - O Retorno (Parte 2)", "Subinildo", 2005);
        catalogoLivros.listaLivros();

        System.out.println("\nBusca por Autor: " + catalogoLivros.pesquisarPorAutor("Subinildo"));

        System.out.println("Busca por título: " + catalogoLivros.pesquisarPorTitulo("A volta dos que não foram"));

        System.out.println("Busca por Intervalo de anos: " + catalogoLivros.pesquisarPorIntervaloAnos(2001, 2019));

        System.out.println("Busca em um ano: " + catalogoLivros.pesquisarPorIntervaloAnos(2010));
    
    }
}
