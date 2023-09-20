# Baixo nível 
    - são linguagens que estão mais próximas da interpretação da máquina. Ex: Assembly e C

# Alto nível:
    - São linguagens que disponibilizam uma linguagem de sintaxe (forma de escrever processos para serem executados pelo computador) mais próxima da interpretação humana. Ex: Java, Javascript, python, etc

# PROGRAMAÇÃO ESTRUTURADA
    - Um paradigma de programação que visa melhorar a clareza, qualidade e o tempo de desenvolvimento de um programa, fazendo uso extensivo das construções de fluxo de controle estruturado de seleção (if / the / else) e repetição (while e for), estrutura de blocos e sub-rotinas.
    - Os algoritimos são implementados com estruturas sequenciais, denominados de procedimentos lineares, podendo afetar o valor das variáveis de escopo globla ou local em uma aplicação.

# PROGRAMAÇÃO ORIENTADA A OBJETOS
    -  Um paradigma da programação baseado no conceito de "objetos" que podem conter dados na forma de campos, também conhecidos como atributos e códigos, na forma de procedimentos (métodos)
    
    - Toda a estrutura de código na linguagem Java é distribuído em arquivos .java, denominados de **classes**. São compostas por:
        - Classe: A estrutura ou representação que direciona a criação dos objetos de mesmo tipo.
        - Identificador (identity): Propósito existencial aos objetos que serão criados
        - Características (states): Denominado tb de atributos ou propriedades, é toda a informação que representa o estado do objeto.
        - Comportamentos (behavior): São as ações ou métodos, sendo a parte comportamental que um objeto dispõe.
        - Instanciar (new): o ato de criar um objeto a partir da estrutura definida em um classe.

### - Seguindo algumas convenções, as classes são classificadas como:
    - Classe de modelo (model): representam estrutura de domínio da aplicação. Ex: Cliente, Pedido, NotaFiscal, etc
    - Classe de serviço (service): classes que contém regras de negócio e validação de sistema.
    - Classe de repostirório (repository): classes que conté integração com o banco de dados.
    - Classe de controle (controller): classes que possuem a finalidade de disponibilizar alguma comunicação externa á nossa aplicação, tipo http, web ou werbservices.
    - Classe utilitária (util): classe que contém recursos comuns á toda nossa aplicação.

## PACOTES
    São subdiretórios, a partir da pasta src do projeto, para organização das classes.

## VISIBILIADDE DOS RECURSOS
### PUBLIC 
    - Qualquer outra classe em qualquer outro pacote pode visualizar os recursos

### DEFAULT
    - Está disponível para visualizar dentro do pacote

### PRIVATE
    - Está disponível para visualizar apenas na própria classe.

# GETTERS E SETTERS
    - São utiizados para buscar valores de atributos ou definir novos valores de atributos de instâncias de classes.
        - GETTER: Retorna o valor do atributo específicado. Ex: public String getNome() {}
        - SETTER: Define outro valor para o atributo especificado: Ex public void setNome(String newNome)
    Os atributoos precisam ter o modificador de acesso private. Dessa forma é necessário usar os métodos getter e setter.
