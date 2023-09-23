package Aulas.POO.Enums;

public class SistemIbge {
    public static void main(String[] args) {
        for (EstadoBrasileiro eb: EstadoBrasileiro.values()){
            System.out.println("Estado: " + eb.getNome() + " - " + eb.getSigla());
            
        }

        EstadoBrasileiro eb = EstadoBrasileiro.ALAGOAS;

        System.out.println(eb);
    }

}
