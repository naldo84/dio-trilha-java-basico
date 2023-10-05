package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavras(String palavra) {
        palavrasUnicas.add(palavra);
    }

    public void removerPalavras(String palavra) {
        if (palavrasUnicas.isEmpty()) {
            throw new RuntimeException("A lista está vázia!");
        } else {
            String palavraParaRemover = null;

            for (String p : palavrasUnicas) {
                if (p.equalsIgnoreCase(palavra)) {
                    palavraParaRemover = p;
                    break;
                }

                if (palavraParaRemover != null) {
                    palavrasUnicas.remove(palavraParaRemover);
                }
            }

        }
    }

    public void exibirPalavrasUnicas() {
        System.out.println(palavrasUnicas.toString());
    }

    public boolean verificarPalavra(String palavra) {
        if (palavrasUnicas.isEmpty()) {
            throw new RuntimeException("A lista está vazia");
        } else {
            return palavrasUnicas.contains(palavra);
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavras("Cadeira");
        conjuntoPalavrasUnicas.adicionarPalavras("Mesa");
        conjuntoPalavrasUnicas.adicionarPalavras("Geladeira");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        System.out.println("Contém a palavra Cadeira: " + conjuntoPalavrasUnicas.verificarPalavra("Cadeira"));
    }
}
