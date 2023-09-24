package Aulas.POO.PilaresPOO.ExemploMensagemInstantanea;

public class MsnMessenger extends ServicoMensagem{

    public MsnMessenger(EnumTipoServico tipoServico){
        this.tipoServico = tipoServico;

    }

    @Override
    public void enviarMensagem() {
        System.out.println("Enviando mensagem pelo " + tipoServico);
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo " + tipoServico);
    
    }

}