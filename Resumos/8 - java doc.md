# JAVADOC
**É recomendável a compreenssão da documentação oficial da linguagem e dos frameworks que são incorporados nos projetos atuais.**

Documentação: [JavaDOC](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)

## TAGS
    - São informações obtidas através de classes documentadas na linguagem
        - O Java Documentation é composto por tags que representam dados relevantes para a compreensão da proposta de uma classe e os conjuntos de seus métodos e atribuos.
    |-------------------------------------------------------------------|
    |   TAG    |                     Descrição                          |
    --------------------------------------------------------------------|
    | @autor   | Autor / Criador                                        |
    | @version | Versão do recurso disponibilizado                      |
    | @since   | Versão / Data de início da disponibilização do recurso |
    | @param   | Descrição dos parâmetros dos métodos criados           |
    | @return  | Definição do tipo de retorno de um método              |
    | @throws  | Se o método lança alguma exceção                       |
    |-------------------------------------------------------------------|

## COMENTÁRIOS
- // - Comentário de uma linha
- /* * */ - Comentário com várias linhas
- /** * **/ - Comentário com várias linhas para documentação

**Um comentário não possui a finalidade de amenizar um algorítimo não estrutura conforme as convenções da linguagem.**

## JAVADOC
    -E um gerador de documentação para documentar a API dos programas em java, a partir do código fonte e o resultado é expresso em HTML.
        EX: javadoc -encoding UTF-8 -docencoding ISO-8859-1  -d ../docs  src/*.java

