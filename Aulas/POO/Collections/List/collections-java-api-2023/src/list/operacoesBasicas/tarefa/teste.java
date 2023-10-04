package list.operacoesBasicas.tarefa;

public class teste {
    public static void main(String[] args) {
        ListaTarefas novaTarefa = new ListaTarefas();

        novaTarefa.adicionarTarefa("Tarefa 1");
        novaTarefa.adicionarTarefa("Tarefa 1");
        novaTarefa.adicionarTarefa("Tarefa 1");
        novaTarefa.adicionarTarefa("Tarefa 2");
        
        novaTarefa.obterDescricoesTarefas();
        
        System.out.println(novaTarefa.obterNumeroTotalTarefas());
        
        novaTarefa.removerTarefa("Tarefa 1");

        novaTarefa.obterDescricoesTarefas();
        System.out.println(novaTarefa.obterNumeroTotalTarefas());
        
    }
    
}
