# PALAVRAS RESERVADAS
    - São identificadores de uma linguagem que possuem uma finalidade específica, não podendo ser utilizados para nomear variáveis, classes, métodos ou atributos.
    Em java há 52 palavras reservadas, sendo classificadas em grupos e escritas com letra minúscula (nas IDEs normalmente são apresentadas com cores distintas)

    |---------------------------------------------------------------|
    | abstract   continue   goto         package       synchronized |
    | assert     defaulta   if           private       this         |
    | boolean    do         implements   protected     throw        |
    | break      double     import       public        throws       |
    | byte       else       instanceof   return        transiente   |
    | case       extends    int          short         try          |
    | catch      final      interface    static        void         |
    | char       finally    long         strictfp      volatile     |
    | class      float      native       super         while        |
    | const      for        new          switch                     |
    |---------------------------------------------------------------|

## CLASSIFICAÇÕES
#### CONTROLE DE PACOTES
- **import** -  importa pacotes ou classes para dentro do código
- **package** - específica a que pacote todas as classes de um arquivo pertencem

#### MODIFICADORES DE ACESSO
 - **public** - acesso de qualquer classe
 - **private** - acesso apenas dentro da classe
 - **protected** - acesso por classes no mesmo pacote e subclasses (qdo houver concepção de herança)

 #### TIPOS PRIMITIVOS
 - **boolen** - valor indicando verdadeiro ou falso
 - **byte** - inteiro de 8 bits (signed)
 - **char** - caracter unicode de 16 bits
 - **double** - número de ponto fluatuante de 64 bits
 - **float** - número de ponto flutuante de 32 bits
 - **int** - número inteiro de 32 bits
 - **long** - número inteiro de 64 bits
 - **short** - número inteiro de 32 bits
 - **void** - indica que o método não possui retorno de valor

 #### MODIFICADORES DE CLASSES, VARIÁVEIS OU MÉTODOS
 - **abstract** - classe que não pode ser instanciada ou método que precisa ser implementado por uma subclasse abstrata
 - **class** - específica uma classe
 - **extends** - indica a superclasse que a subclasse está extendendo
 - **final** - impossibilita que uma classe seja extendida, que um método seja sobrescrito ou que uma variável seja reinicializada
- **implements** - indica as interface que uma classe irá implementar 
- **interface** - específica uma interface
- **native** - indica que um método está escrito em uma linguagem dependente de plataforma, como o C
- **new** - instancia um novo objeto, chamando seu construtor
- **static** - faz um método ou variável pertencer á classe ao invés da instância
- **strictfp** - usando em frente a um método ou classe para indicar que os nros de ponto flutuante seguirão as regras de ponto flutuante em todas as expressões
- **synchronized** - indica que um método só pode ser acessado por uma thread de cada vez
- **transient** - impede a serialização de campos
- **volatile** -  indica que uma variável pode ser alterada durante o uso de threads

#### CONTROLE DE FLUXO DENTRO DE UM BLOCO DE CÓDIGO
- **break** - sai do bloco de código em que ele está
- **case** - executa um bloco de código dependendo do teste do switch
- **continue** - pula a execução do código e vai para a próxima passagem do loop
- **default** - executa esse bloco de código caso nenhum dos teste de switch-case seja verdadeiro;
- **do** - executa um bloco de código uma vez, e então realiza um teste em conjunto com o while para determinar se o bloco deverá ser executado novamente;
- **else** - executa um bloco de código alternativo caso o teste "if" seja falso;
- **for** - usado para realizar um loop condicional de um bloco de código;
- **instanceof** - determina se um objeto é uma instância de determinada classe, superclasse ou interface
- **return** - retorno do método
- **switch** - expressão case
- **while** - loop que executa um bloco de código enquanto a condição for verdadeira    

#### TRATAMENTO DE ERROS
- **assert** -  testa uma expressão condicional, para verificar uma suposição do programador
- **catch** - declara o bloco de código usado para tratar uma exceção;
- **finally** - bloco de código, após um try-catch, que é executado independentemente do fluxo de programa seguido ao lidar com uma exceção;
- **throw** - usado para gerar uma exceção para o método que o chamou;
- **throws** - indica que um método pode passar uma exceção para o método que o chamou;
- **try** - bloco de código que tentará ser executado, mas que pode causar uma exceção.

#### VARIÁVEIS DE REFERÊNCIA
- **super** - refere-se a uma superclasse
- **this** - refere-se a instância atual do objeto

#### PALAVRAS RESERVADAS NÃO UTILIZADAS
- **const** - para o uso de constantes, deve-se usar use pubic static final
- **goto** - não implementada na linguagem java

#### LITERAIS RESERVADOS
 - De acordo com a Java Language Specification, **null, true** e **false** são tecnicamente chamados de valores literais, e não keywords. Se você tentar criar algum identificador com estes valores, você também terá um erro de compilação.