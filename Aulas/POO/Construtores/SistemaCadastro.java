package Aulas.POO.Construtores;

public class SistemaCadastro {
    public static void main(String[] args) {
        //Pessoa marcos = new Pessoa();  -- erro após criar o construtor

        Pessoa naldo = new Pessoa("Erinaldo Silva", "333333333333");    
        naldo.setEndereco("Rua das Pedras, 9999"); 

        System.out.println("DADOS PESSOAIS");
        System.out.println("Nome: " + naldo.getNome()
        + "\nCPF: " + naldo.getCpf() 
        + "\nEndereço: " + naldo.getEndereco());
    }
}
