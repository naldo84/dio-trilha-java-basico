package Aulas.POO.PilaresPOO.ExemploMensagemInstantanea;

import Aulas.POO.PilaresPOO.ExemploMensagemInstantanea.aplicativos.EnumTipoServico;
import Aulas.POO.PilaresPOO.ExemploMensagemInstantanea.aplicativos.FacebookMessenger;
import Aulas.POO.PilaresPOO.ExemploMensagemInstantanea.aplicativos.MsnMessenger;
import Aulas.POO.PilaresPOO.ExemploMensagemInstantanea.aplicativos.ServicoMensagem;
import Aulas.POO.PilaresPOO.ExemploMensagemInstantanea.aplicativos.Telegram;

public class ComputadorNaldo {
    public static void main(String[] args) {
        ServicoMensagem smi = null;
        
        String appEscolhido = "tele";

        if (appEscolhido.equals("msn")){
            smi = new MsnMessenger(EnumTipoServico.MESSENGER);
        } else if (appEscolhido.equals("face")){
            smi = new FacebookMessenger(EnumTipoServico.FACEBOOK);
        } else if (appEscolhido.equals("tele")){
            smi = new Telegram(EnumTipoServico.TELEGRAM);
        }

        smi.enviarMensagem();
        smi.receberMensagem();
    }

    public static void criarLinha(){
        System.out.println("\n-----------------------------------------------------------");
    }
}
