[link](http://diegomariano.com/lacos-de-repeticao-2/)

# ESTRUTURAS DE REPETIÇÃO
    - Também conhecidos como laços de iteração ou loops, são comandos que permitem que sejam repetidos diversas vezes dentro do bloco.

#### BREAK
    - Comando para interromper o laço de uma estrutura de repetição.

#### CONTINUE
    - Interrompe somente a iteração atual.

## FOR (para)
    - Permite que uma variável contadora seja testada e incrementada a cada iteração, sendo essas informações definidas na chamada do comando. O comando for recebe como entrada uma variável contadora, a condição e o valor de incrementação.
        Etrutura: for(int i = 0; i < 10; i++){
	            System.out.println(i)
            }
### - FOREACH   
    - Está fortemente relaccionado com cenários onde há arrays ou coleção, sendo a interação baseada nos elementos da coleção.
        Ex: for(String aluno: alunos){
            System.out.println(alunos)
        }
## WHILE (enquanto)
    - O bloco de código será executado, enquanto uma condição for válida. O while testa a condição antes de executar o código, logo, caso a condição seja inválida no primeiro teste, sequer o bloco será executado.
        Estrutura: while (expressão booleana){
                        //comando a ser executado até a expressão tornar-se falsa
                    };

## DO WHILE (faça enquanto)
    - Assim como o while, considera que enquanto uma condição for válida o bloco de código será executado. Entretanto o do While testa a condição após executar o código, sendo assim o bloco de código será executado ao menos uma vez.
        Estrutura: do {
                        //comando a ser executado até a expressão tornar-se falsa
                    }
                    while (expressão booleana);
