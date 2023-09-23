package Aulas.POO.PilaresPOO.ExemploMensagemInstantanea;

public class ServicoMensagem {

    EnumTipoServico tipoServico;

    public void enviarMensagem() {

        validarConectadoInternet();
        System.out.println("Enviando mensagem do " + tipoServico);
        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem do " + tipoServico);
    }

    private void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Salvando o histórico da mensagem");
    }
}