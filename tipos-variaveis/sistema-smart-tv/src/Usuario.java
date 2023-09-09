public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTV smartTV = new SmartTV();

        incluirLinha();
        System.out.println("Situação Atual da Smart TV de Erinaldo");
        System.out.println("Ligada: " + smartTV.ligada);
        System.out.println("Canal: " + smartTV.canal);
        System.out.println(("Volume: " + smartTV.volume));
        
        incluirLinha();
        System.out.println("Ligando a TV...");
        smartTV.ligar();
        System.out.println("TV Ligada: " + smartTV.ligada);
        
        incluirLinha();
        System.out.println("Desligando a TV...");
        smartTV.desligar();
        System.out.println("TV Ligada: " + smartTV.ligada);
        
        incluirLinha();
        System.out.println("Alterando o volume...");
        System.out.println("Volume atual: " + smartTV.volume);
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();
        System.out.println("Novo status do volume:" + smartTV.volume);

        incluirLinha();
        System.out.println("Alterando o canal...");
        System.out.println("Canal atual: " + smartTV.canal);
        smartTV.aumentarCanal();
        smartTV.aumentarCanal();
        smartTV.aumentarCanal();
        smartTV.diminuirCanal();
        System.out.println("Novo canal: " + smartTV.canal);

        incluirLinha();
        System.out.println("Alterando o canal ao digitar o nro...");
        System.out.println("Canal atual: " + smartTV.canal);
        smartTV.mudarCanal(9);
        System.out.println("Novo canal: " + smartTV.canal);

    }

    public static void incluirLinha () {
        System.out.println("\n--------------------------------------");
    }
}
