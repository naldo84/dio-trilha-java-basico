package Aulas.POO.lanchonete;

import Aulas.POO.lanchonete.area.cliente.Cliente;
import Aulas.POO.lanchonete.atendimento.Atendente;
import Aulas.POO.lanchonete.atendimento.cozinha.Cozinheiro;


public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        
        // ações que estabelecimento precisa ter ciência
        cozinheiro.adicionarSucoNoBalcao();        ;
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        Atendente atendente = new Atendente();
        atendente.receberPagamento();
        atendente.servindoMesa();

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();

    }
}
