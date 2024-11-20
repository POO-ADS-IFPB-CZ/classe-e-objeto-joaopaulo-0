# Java
<h1 align="center">Atividade da página 78 a 81</h1>
<h2>Questão 1</h2>
<h3>1. Escreva um modelo para representar uma lâmpada que está à venda em 
um supermercado. Que dados devem ser representados por esse modelo?</h3>

<p>Os dados que vão representar o modelo são, id, marca, preço, potencia, tensao, vida util.</p>

```
+---------------------+
|    ProdutoLampada   |
+---------------------+
| - id       |
| - marca    |
| - preco    |
| - potencia |
| - tensao   |
| - vidaUtil |

```
 <h2>Questão 7</h2>
<h3>7. Identifique e explique o(s) erro(s) na classe abaixo:</h3>

```
 1 class Registro De Eleitor
 2 {
 3 /**
 4 * Declaração dos campos desta classe
 5 */
 6   int tituloDeEleitor; // número do título do eleitor
 7   String nome; // nome do eleitor
 8   short zonaEleitoral; // número da zona eleitoral
 9 } // fim da classe

```
<p>Na primeira linha "class Registro De Eleitor" o erro acontece devido a nomeclatura de classes do Java seguir uma regra padrão chamada de casesensitive.</p>
<p>Na declaração dos campos os erros acontecem devido ao não ter os modificadores de acesso definidos, Já que se tratam de dados dos usuários, eles precisam ter algum tipo de proteção aos dados como o encapsulamento para que não haja problemas com a privacidade.</p>
<p>A falta de métodos de acesso como getters e setters que são meios para acessar e modificar os campos e tambêm a falta de um construtor para definir valores ao atributos da classe no momento de sua criação.</p>
 <h2>Questão 8</h2>
<h3>8. Identifique e explique o(s) erro(s) na classe abaixo:</h3>

```
 1 class Teste2
 2 {
 3 /**
 4 * Declaração dos campos desta classe
 5 */
 6 int num1,num2;
 7 /**
 8 * Declaração dos métodos desta classe
 9 */
 10 int maior()
 11 {
 12   if (num1 > num2)
 13     return true;
 14   else return false;
 15 }
 16 void menor()
 17 {
 18 if (num1 < num2)
 19   return num1;
 20 else return num2;
 21 }
 22 } // fim da classe

```
<p>Na linha onde está a declaração do retorno do método maior há um erro, pois o método maior foi declarado como retornando um tipo int, mas no codigo ele tenta retornar valores boleanos como tue e false.</p>
<p>Na linha 16 do código o problema está no método menor, pois ele foi declarado como void, e como void significa vazio ele não retorna valor algum.</p>
<p>Há tambêm a ausência de modificadores de acesso e ausência de construtor que podem causar problemas nos métodos chamados antes da inicialização dos atributos.</p>

<h2>Questão 14</h2>
<h3>14. Qual a importância de usar o encapsulamento na definição de classes? 
Exemplifique.</h3>
<p>O encapsulamento é de suma importãncia, pois ele visa proteger os dados internos de uma classe, garantindo que eles sejam acessados e modificados somente por métodos controlados, tomamos por exemplo um sistema de conta bancária que teria uma classe ContaBancaria, o atributo saldo pode ser privado e acessado apenas por metododos como getSaldo, depositar e sacar, para assim evitarque o saldo seja alterado de forma incorreta.</p>
