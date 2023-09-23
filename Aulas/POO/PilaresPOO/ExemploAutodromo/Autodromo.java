package Aulas.POO.PilaresPOO.ExemploAutodromo;

public class Autodromo{
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("55667788");
        // jeep.ligar(); 

        Moto harleyD = new Moto();
        harleyD.setChassi("334455");
        // harleyD.ligar();

        Veiculo coringa = jeep;
        coringa.ligar();
    }
}