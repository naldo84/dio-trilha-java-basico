package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //atributos
    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados(){
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadePorCodigoConvite(int codigoConvite){
        Convidado  convidadoParaRemover = null;
        for (Convidado convidado : convidadosSet) {
            if (convidado.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = convidado;
                break;
            }  
        }

        convidadosSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){

        return convidadosSet.size();
    }

    public void exibirConvidados(){
        System.out.println("Lista de Convidados:" + convidadosSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        
        conjuntoConvidados.adicionarConvidado("Erinaldo", 1234);
        conjuntoConvidados.adicionarConvidado("Ivete", 1235);
        conjuntoConvidados.adicionarConvidado("Roseli", 1236);
        conjuntoConvidados.adicionarConvidado("Jacquelina", 1236);
        conjuntoConvidados.adicionarConvidado("Gabriela", 1238);
        conjuntoConvidados.adicionarConvidado("Isabel", 1239);

        conjuntoConvidados.exibirConvidados();

        System.out.println("Qtde de convidados: " + conjuntoConvidados.contarConvidados());

        System.out.println("Removendo um dos candidatos");
        conjuntoConvidados.removerConvidadePorCodigoConvite(1238);
        System.out.println("Qtde de convidados: " + conjuntoConvidados.contarConvidados());

        
    }
}
