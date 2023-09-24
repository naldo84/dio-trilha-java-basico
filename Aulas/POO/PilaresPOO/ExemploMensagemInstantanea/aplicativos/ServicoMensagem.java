package Aulas.POO.PilaresPOO.ExemploMensagemInstantanea.aplicativos;

public abstract class ServicoMensagem {

    public EnumTipoServico tipoServico;

    public abstract void enviarMensagem();

    public abstract void receberMensagem();

    protected void validarConexaoInternet() {
        System.out.println("Validando se está conectado a Internet");
    }
}