package Aulas.POO.Collections.comparableXcomparator;

//Classe livro que implementa Comparable
public class Livro  implements Comparable<Livro>{
    private String titulo;
    private String autor;
    private int ano;

    public Livro(String titulo, String Autor, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    
}
