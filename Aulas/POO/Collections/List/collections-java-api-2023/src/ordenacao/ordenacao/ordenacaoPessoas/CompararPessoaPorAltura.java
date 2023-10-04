package ordenacao.ordenacao.ordenacaoPessoas;

import java.util.Comparator;

public class CompararPessoaPorAltura implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa pessoa1, Pessoa pessoa2) {

        return Double.compare((pessoa1.getAltura()), pessoa2.getAltura());

    }  
}
