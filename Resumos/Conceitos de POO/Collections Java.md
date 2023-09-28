# COLLECTION FRAMEWORK API
    - Uma collection é uma estrutua de dados que serve para agrupar muitos elementos em uma única unidade, sendo que os elementos precisão ser objetos. Collection não utiliza tipos primitivos. Ex: (Usar o Integer ao invés do int)
    - Pode ter coleções homogêneas e heterogêneas, porém normalmente utilizamos coleções homogêneas de um tipo específico.
    - O núcleo principal das coleções é formado por algumas interfaces, essas interfaces permitem manipular a coleção independente do nível de detalh que elas representam.
        Tipos principais: List (lista), Set (conjunto), Queue (fila) e map (mapa) e a partir destqs há várias outras subclasses concretas que implementam várias formas diferentes de se trabalhar com cada coleção.

## GENERICS
    - É um recurso que permite a criação de classes, interfaces e métodos para operar com tipos de dados parametrizados, ou seja, escrever código que pode ser reutilizado com diferentes tipos de dados, tornando o código mais flexível e seguro em termos de tipos.
        Ex: public class Caixa<T> {
            private T conteudo;
            public T getConteudo() { return conteudo; }
            public void setConteudo(T conteudo) { this.conteudo = conteudo;}}
        Nomes de parametros mais comumentes usados:
            E - elementos
            K - chave
            N - número
            T - tipo
            V - valor
            S, U, V, etc - 2°, 3°, 4° tipos

## COMPARABLE X COMPARATOR

### COMPARABLE
    - Fornece uma única sequência de ordenação. Em outras palavras, podemos ordenar a coleção com base em um único elemento, como id, nome e preço.
    - Afeta a classe original, ou seja, a classe atual é modificada
    - Fornece o método compareTo para ordenar elementos.
    - Está presente no pacote java.lang
    - Podemos ordenar os elementos da lista do tipo Comparable usando o método Collections.sorte(List);

### COMPARATOR
    - Fornece o método compare() para ordenar elementos.
    - O comparator fornece múltiplas sequências de ordenação. Em outras palavras, podemos ordenar a coleção com base em múltiplos elementos, como id, nome e preço.
    - O comparator não afeta a classe orinal, ou seja, a classe atual não é modificada.
    - Um comparator está presente no java.util.
    Podemos ordenar os elementos da lista do tipo Comparator usando o método Collections.sort(List, Comparator)

## LIST
    -É uma coleção ordenada que permite a inclusão de elementos duplicados.
    - É  um dos tipos de coleção mais utilizados em Java, e as classes de implementação comuns são: ArrayList e Linkedlist.
    - A list se assemelha a uma matriz com comprimento dinâmico, permitindo adicionar ou remover elementos.
    - A interface list fornece métodos úteis para adicionar elementos em posições específicas, remover ou substituir elementos com base no índice e obter sublistas usando índices.
    - A classe Collections fornece algorítimos úteis para manipulação de list, como ordenação (sort), embaralhamento (shuffle) ordem inversa (reverse) e busca binária (binarySearch)


        - ArrayList: O ArrayList é uma implementação da interface List que armazena os elementos em uma estrutura de array redimensionável. Isso significa que ele pode crescer automaticamente à medida que novos elementos são adicionados. A principal vantagem do ArrayList é o acesso rápido aos elementos por meio de índices, o que permite recuperar um elemento específico de forma eficiente. No entanto, adicionar ou remover elementos no meio da lista pode ser mais lento, pois requer a realocação de elementos.

        - LinkedList: O LinkedList é uma implementação da interface List que armazena os elementos em uma lista duplamente vinculada. Cada elemento contém referências para o elemento anterior e próximo na lista. A principal vantagem do LinkedList é a eficiência na adição ou remoção de elementos no início ou no final da lista, pois não é necessário realocar elementos. No entanto, o acesso aos elementos por meio de índices é mais lento, pois requer percorrer a lista até o elemento desejado.

        - Vector: O Vector é uma implementação antiga da interface List que é semelhante ao ArrayList, mas é sincronizada, ou seja, é thread-safe. Isso significa que várias threads podem manipular um objeto Vector ao mesmo tempo sem causar problemas de concorrência. No entanto, essa sincronização adiciona uma sobrecarga de desempenho, tornando o Vector menos eficiente do que o ArrayList em cenários em que a concorrência não é um problema. Por esse motivo, o uso do Vector é menos comum em aplicações modernas.

