# MÉTODOS
	- Correspondem a funções ou sub-rotinas disponíveis dentro das classes.

 ### NOMEANDO MÉTODOS
 	- Não são obrigatórios, porém recomendável. Facilita a vida dos devs e torna o código mais legível.
 	- Não há em java o conceito de métodos globais. Todos os métodos devem ser definidos dentro de uma classe.
 	
 	- Deve ser nomeado como verbo
 	- Seguir o padrão camelCase
 	
 	Exs: soma(int 1, int 2) {}, abriconexao() {}, concluirProcessamento() {}
 		calcularImprimir() {} - entra com dualiadade (irá calcular ou imprimir) - O método deve ter apenas uma responsabilidade.
 
 ### CRITÉRIOS PARA DEFINIÇÃO DE MÉTODOS:
 	Nesse caso utilizamos como auxílio uma convenção estrutural para todos os métodos:
 		- Qual a proposta principal do método? - Necessário compreender a real finalidade do método
 		- Qual o tipo de retorno esperado após executar o método? É necessário analisar se o método será responsável por retornar algum valor ou não.
 			Caso não retorne nenhum valor, é necessário representar pela palavra-chave void
 		- Quais os parâmetros serão necessários para execução? Algumas vezes será necessário definir argumentos como critérios para a execução do método.
 		- Há risco de apresentar alguma exceção? Se ocorrer alguma exceção é necessário prever e tratar.
 		- Qual a visibilidade do método? Verificar a necessidade do método ser visível a toda a aplicação, somente no mesmo pacote, através de herança ou apenas na própria classe.
