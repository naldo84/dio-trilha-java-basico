package Aulas.POO.PilaresPOO.ExemploMensagemInstantanea;

public abstract class ServicoMensagem {

    EnumTipoServico tipoServico;

    public abstract void enviarMensagem();

    public abstract void receberMensagem();
}