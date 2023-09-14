package Exceções;

public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("0500010");
            System.out.println(cepFormatado);

        } catch (Exception e) {
            System.out.println("O cep está inválido!!");
           
        }
        
    }

    static String formatarCep(String cep) throws CepInvalidException { 
        
        if (cep.length() != 8){
            throw new CepInvalidException();
        }

        return "05010-010";
    }  
}
