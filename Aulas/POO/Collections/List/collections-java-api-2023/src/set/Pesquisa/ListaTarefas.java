package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    Set<Tarefa> listaTarefasSet;

    public ListaTarefas() {
        this.listaTarefasSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        listaTarefasSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaRemover = null;

        for (Tarefa tarefa : listaTarefasSet) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefaRemover = tarefa;
                break;
            }
        }
        listaTarefasSet.remove(tarefaRemover);
            
        }

        public void exibirTarefas(){
            System.out.println(listaTarefasSet);
        }

        public static void main(String[] args) {
            ListaTarefas listaDeTarefas = new ListaTarefas();

            listaDeTarefas.adicionarTarefa("Teste descrição");

            listaDeTarefas.exibirTarefas();
        }

    }
