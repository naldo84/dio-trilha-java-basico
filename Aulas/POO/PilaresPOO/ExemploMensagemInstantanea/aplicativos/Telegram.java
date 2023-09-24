package Aulas.POO.PilaresPOO.ExemploMensagemInstantanea.aplicativos;

public class Telegram extends ServicoMensagem{

    public Telegram (EnumTipoServico tipoServico){
        this.tipoServico = tipoServico;
    }

    @Override
    public void enviarMensagem() {
        System.out.println("Enviando mensagem pelo " + tipoServico);
    }

    @Override
    public void receberMensagem() {
        validarConexaoInternet();
        System.out.println("Recebendo mensagem pelo " + tipoServico);
    }

}