# Atividade da Classe

Em estudos de geografia e relações entre territórios, é comum representar países e suas fronteiras. Em sistemas computacionais, essas relações podem ser modeladas utilizando estruturas de dados dinâmicas, como **listas ligadas**.

Sua tarefa é implementar uma estrutura em Java que represente um país e a lista de países que fazem fronteira com ele, utilizando lista ligada.

## Requisitos

1. **Classe `Pais`** contendo:
	- `String nome`
	- Uma lista ligada com os países fronteiriços

2. **Classe para o nó da lista ligada** (por exemplo, `NoFronteira`) contendo:
	- Um objeto `Pais` (ou apenas o nome do país vizinho)
	- Uma referência para o próximo nó da lista

3. **Métodos em `Pais`**:
	- `void adicionarFronteira(Pais pais)` — adiciona um país à lista de fronteiras.
	- `void removerFronteira(String nomePais)` — remove um país da lista de fronteiras.
	- `void listarFronteiras()` — exibe todos os países que fazem fronteira.
	- `boolean fazFronteiraCom(String nomePais)` — retorna `true` se o país informado estiver na lista de fronteiras.

4. **Classe `Principal`** para:
	- Instanciar alguns países.
	- Definir manualmente algumas fronteiras.
	- Exibir as fronteiras de pelo menos três países.

 