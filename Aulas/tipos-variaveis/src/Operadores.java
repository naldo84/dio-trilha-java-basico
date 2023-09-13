public class Operadores {
    public static void main(String[] args) throws Exception {
        double salarioMinio = 2500.33;

        System.out.println(salarioMinio);

        int número = 3;
        System.out.println(++número);

        //Operadores relacionais
        int numero1 = 4;
        int numero2 = 6;
        boolean simNao;

        System.out.println("Número 1: " + numero1);
        System.out.println("Número 2: " + numero2);

        simNao = numero1 == numero2;
        System.out.println("Número 1 é igual ao número 2: " + simNao);

        simNao = numero1 != numero2;
        System.out.println("Número 1 é diferente do número 2: " + simNao);

        simNao = numero1 > numero2;
        System.out.println("Número 1 é maior que o número 2: " + simNao);

        simNao = numero1 >= numero2;
        System.out.println("Número 1 é maior ou igual ao número 2: " + simNao);

        simNao = numero1 < numero2;
        System.out.println("Número 1 é menor que o número 2: " + simNao);

        simNao = numero1 <= numero2;
        System.out.println("Número 1 é menor ou igual ao número 2: " + simNao);

        String nome1 = "Erinaldo";
        String nome2 = new String("Erinaldo");

        simNao = nome1.equals(nome2);
        System.out.println("Nome 1 é igual ao nome2: " + simNao);

        //OPERADORES RELACIONAIS

        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2){
            System.out.println("As condições são verdadeiras!!");
        } else {
            System.out.println("As condições são falsas!!");
        }

        if (condicao1 || condicao2) {
            System.out.println("Uma das condições é verdadeira");
        } else {
            System.out.println("Nenhuma das condiçõe são verdadeiras!!");
        }
    }
}
