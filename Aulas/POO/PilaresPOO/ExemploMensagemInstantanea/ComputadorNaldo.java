package Aulas.POO.PilaresPOO.ExemploMensagemInstantanea;

public class ComputadorNaldo {
    public static void main(String[] args) {

        MsnMessenger msn = new MsnMessenger(EnumTipoServico.MESSENGER);

        msn.enviarMensagem();
        msn.receberMensagem();

        criarLinha();
        FacebookMessenger facebook = new FacebookMessenger(EnumTipoServico.FACEBOOK);
        facebook.enviarMensagem();
        facebook.receberMensagem();

        criarLinha();
        Telegram telegram = new Telegram(EnumTipoServico.TELEGRAM);
        telegram.enviarMensagem();
        telegram.receberMensagem();
        criarLinha();
        
        
    }

    public static void criarLinha(){
        System.out.println("\n-----------------------------------------------------------");
    }
}
