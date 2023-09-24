package Aulas.POO.PilaresPOO.ExemploMensagemInstantanea.aplicativos;

public class MsnMessenger extends ServicoMensagem{

    public MsnMessenger(EnumTipoServico tipoServico){
        this.tipoServico = tipoServico;

    }

    @Override
    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Enviando mensagem pelo " + tipoServico);
    }

    @Override
    public void receberMensagem() {
        validarConexaoInternet();
        System.out.println("Recebendo mensagem pelo " + tipoServico);
    
    }

}