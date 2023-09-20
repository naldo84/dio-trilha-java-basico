package Desafios.pblJava;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor do salário Bruto: R$ ");
        double salarioBruto = entrada.nextDouble();

        System.out.print("Digite o valor do benefício: R$ ");
        double valorBeneficio = entrada.nextDouble();

        double valorImposto = 0;

        if (salarioBruto >= 0 && salarioBruto <= 1100){
            valorImposto = salarioBruto * 0.05;
        } else if (salarioBruto > 1100.01 && salarioBruto <= 2500){
            valorImposto = salarioBruto * 0.10;
        } else {
            valorImposto = salarioBruto * 0.25;
        }

        double salarioLiquido = salarioBruto - valorImposto + valorBeneficio;

        System.out.printf("Valor do imposto: R$ %.2f\n", valorImposto);
        System.out.printf("Valor do benefício: R$ %.2f\n", valorBeneficio);
        System.out.printf("Valor do Salário Líquido: R$ %.2f\n", salarioLiquido);

        System.out.println(String.format("%.2f", salarioBruto));
        
    }
    
}
