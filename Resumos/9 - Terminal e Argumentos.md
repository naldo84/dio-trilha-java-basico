# TERMINAL E ARGUMENTOS
- Com a JVM devidamente configurada, podemos criar um executável do programam e disponibilizar o instalador para qualquer sistema operacional

    No prompt de comando, acessar a pasta do projeto e abrir a pasta bin (estará um nível antes do src) e executar o comando java nome-da-classe (sem o .class)
        OBS: A pasta bin estará disponível após executar o seu programa ao menos uma vez.


# ARGUMENTOS
    - Quando executar uma classe que contenha o método main, o mesmo permite que passemos um array [] de argumentos do tipo string. Logo podemos após a definição da classe a ser executada informar ester parâmetros.
        Ex: java MinhaClasse argumentoUm argumentoDois (esse comando deve ser executado no terminal)

        É possível definir os argumentos da classe, diretamente via IDE.
            - No visual studio code a inclusão/alteração é efetuada no menu Executar / Adicionar a configuração ou Abrir as configurações (será aberto o arquivo launch.json)
                Ex:         {
            "type": "java",
            "name": "SobreMim",
            "request": "launch",
            "mainClass": "SobreMim",
            "projectName": "JAVA-TERMINAL_999a3fb4",
            "args": [
                "Erinaldo",
                "Silva",
                "18",
                "1.90"
            ]
        }
## SCANNER
    Uma classe que permite que o usuário tenha uma iteração mais assertiva com o nosso programa.