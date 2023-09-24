package Aulas.POO.PilaresPOO.ExemploMensagemInstantanea.aplicativos;

public class FacebookMessenger extends ServicoMensagem{

    public FacebookMessenger (EnumTipoServico tipoServico){
        this.tipoServico = tipoServico;
    }

    @Override
    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Enviando mensagem pelo " + tipoServico);
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo " + tipoServico);
    }

}
