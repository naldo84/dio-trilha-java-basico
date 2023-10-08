package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;


public class AgendaContatos {
    Set<Contato> contatosSet;

    public AgendaContatos() {
        contatosSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatosSet.add(new Contato(nome, numero));

    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatoPorNome = new HashSet<>();

        for (Contato contato : contatosSet) {
            if (contato.getNome().startsWith(nome)) {
                contatoPorNome.add(contato);
            }
        }
        if (contatoPorNome.isEmpty()) {
            throw new RuntimeException("A busca não encontrou nenhum contato com o nome: " + nome);
        } else {
            return contatoPorNome;
        }

    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;

        for (Contato contato : contatosSet) {
            if (contato.getNome().equalsIgnoreCase(nome)){
                contato.setTelefone(novoNumero);
                contatoAtualizado = contato;
                break;
            }  
        } 
        if (contatoAtualizado != null){
            return contatoAtualizado;

        } else {
            throw new RuntimeException("Contato inexistente!");
        }
    }

    public void exibirContatos() {
        System.out.println(contatosSet);
    }

    public static void main(String[] args) {
        AgendaContatos agendaDeContatos = new AgendaContatos();

        agendaDeContatos.adicionarContato("Erinaldo", 33445566);
        agendaDeContatos.adicionarContato("Ivete", 302090);
        agendaDeContatos.adicionarContato("Ivete Silva", 3214566);

        agendaDeContatos.exibirContatos();

        agendaDeContatos.atualizarNumeroContato("Erinaldo", 3314);

        agendaDeContatos.exibirContatos();

        System.out.println("Lista de busca: " + agendaDeContatos.pesquisarPorNome("Ivete"));
    }

};