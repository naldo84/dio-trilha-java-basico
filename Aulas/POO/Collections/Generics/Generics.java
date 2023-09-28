package Aulas.POO.Collections.Generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        //Exemplo sem generics
        List listaSemGenerics = new ArrayList();
        listaSemGenerics.add("Elemento 1");
        listaSemGenerics.add(10);
    
        //Exemplo com generics
        List<String> listaGenerics = new ArrayList<>();
        listaGenerics.add("Elemento 10");
        listaGenerics.add("Elemento 20");

        //Iterando sobre a lista com generics
        for (String elementos : listaGenerics) {
            System.out.println(elementos); 
        }

        //Iterando sobre a lista sem generics (necessário usar o cast)
        for (Object elemento : listaSemGenerics) {
            String palavra = (String) elemento;
            System.out.println(palavra);  
        }
    }
}
