# Respostas Exercícios – Segunda Forma Normal (2FN)

## Exercício 1 – Conceito

A Segunda Forma Normal afirma que todas as colunas que não fazem parte da chave dependem da chave inteira, assim, nenhuma coluna depende só de uma parte de uma chave composta.

## Exercício 2 – Identificação

A tabela não está em 2FN. Isso porque mesmo tendo chave composta, a coluna NomeProduto, depende apenas da coluna ProdutoID.

## Exercício 3 – Dependência Parcial

Uma dependência parcial é quando um atributo não- chave depende apenas de parte da chave primária composta( duas ou mais chaves primárias, mais de uma colua  na mesma tabela), e não da chave inteira. 
Isso viola a segunda forma normal (2FN), pois, a 2FN exige que:
A tabela esteja na primeira forma normal 1FN (ou seja, sem grupos repetitivos).
Todos os atributos não-chaves devem depender da chave primária inteira, e não somente de uma parte dela.
Se houver dependência parcial, a tabela não está de acordo com a 2FN.
Vamos para um exemplo prático

| id_aluno | id_curso | nome_aluno | data_prova |
|---|---|---|---|
|1 | 101 | Ana | 2025-01-10 |
|2 | 101 | Bruno | 2025-01-10|
|1 | 102 | Ana |2025-02-15|

As chaves primárias compostas são: id_aluno, id_curso
Os atributos não- chaves são: nome_aluno, data_prova.

Essa tabela não está na 2FN, Pois a data da prova depende das chaves primárias compostas: id_aluno+ id_curso. Porém o nome_aluno só depende do id_aluno e não do curso, isso é uma dependência parcial.
O correto seria fazer uma tabela somente com o id_aluno e nome_aluno.
E outra somente com o: id_aluno, id_curso e a data_prova.
Pois assim, os atributos de cada tabela dependem totalmente da chave primária de sua respectiva tabela.

## Exercício 4 – Conversão para 2FN

1. Identificar as dependências funcionais:

- PedidoID -> DataPedido, ClienteID
- ClienteID -> NomeCliente
- (PedidoID, ProdutoID) -> Quantidade
- ProdutoID -> PrecoUnitario (supondo que o preço unitário é fixo para cada produto)

2. Criar tabelas separadas:

- Clientes: ClienteID (PK), NomeCliente
- Pedidos: PedidoID (PK), DataPedido, ClienteID (FK_Clientes)
- Produtos: ProdutoID (PK), PrecoUnitario
- ItensPedido: PedidoID (FK_Pedidos), ProdutoID (FK_Produtos), Quantidade(PK composta por PedidoID e ProdutoID)

### Tabela Clientes

|ClienteID|NomeCliente|
|---|---|
|1|Joâo Silva|
|2|Maria Doe|

---

### Tabela Pedidos

|PedidoID|DataPedido|ClienteID|
|---|---|---|
|1|2023-03-01|1|
|2|2023-03-02|2|

---

### Tabela Produtos

|ProdutoID|PrecoUnitario|
|---|---|
|A|10.0|
|B|20.0|

---

### Tabela ItensPedido

|PedidoID|ProdutoID|Quantidade|
|---|---|---|
|1|A|5|
|1|B|3|
|2|A|2|

---

## Exercício 5 – Tabela com Chave Composta

|Atributos|Dependências|  
|---|---|
|Sala|CursoID|
|NomeProfessor|ProfessorID|

---

## A refatoração da Tabela seria:

### Tabela 1

|CursoID|Sala|
|---|---|
|C01|101|
|C02|102|

### Tabela 2

|ProfessorID|Nome Professor|
|---|---|
|P01|Ana|
|P02|Bruno|
|P03|Carla|

## Exercício 6 – Benefícios da 2FN

1. Reduz redundâncias e evita dados duplicados.
2. Evita anomalias de inserção, atualização e exclusão.
3. Melhora a consistência e a manutenção do banco de dados.

## Exercício 7 – Multivalorados e 2FN

## Exercício 8 – Exercício Prático

A Segunda Forma Normal (2FN) exige que a tabela esteja na Primeira Forma Normal (1FN)
e que todos os atributos não-chave depende da chave primária completa. Neste modelo, a tabela de vendas possui chave primária composta (PedidoID + ProdutoID), e as dependências
parciais foram separadas em outras tabelas.

### Tabela Pedidos

|PedidoID (PK)|DataPedido|ClienteID(FK)|
|---|---|---|
|101|2025-10-29|C01|
|102|2025-10-29|C02|

---

### Tabela Produtos

|ProdutoID (PK)|NomeProduto|Categoria|
|---|---|---|
|P01|Camiseta|Roupas|
|P02|Boné|Acessórios|
|P03|Tênis|Calçados|

---

### Tabela Vendas

|PedidoID (PK,FK)|Produto (ID,FK)|Quantidade|Preço unitário|Subtotal|
|---|---|---|---|---|
|101| P01| 2| 50.00| 100.00|
|101| P02| 1| 30.00| 30.00|
|102| P01| 3| 50.00| 150.00|
|102| P03| 1| 80.00| 80.00|

---

As tabelas estão em 2FN, pois: A tabela Vendas possui chave composta (PedidoID +
ProdutoID).

Os atributos Quantidade, PrecoUnitario e Subtotal dependem da chave completa. As
dependências parciais (como informações do cliente e do produto) foram separadas em
suass respectivas tabelas.

## Exercício 9 – Teoria e Prática

## Exercício 10 – Revisão

1. A Tabela não está em 2FN Pois, consta dependência parcial dos atributos-não chaves : NomeProduto e PrecoUnitario, que dependem somente do ProdutoID.
Enquanto a Quantidade depende da VendaID+ProdutoID, Que são as chaves primárias compostas.

2. Tabela Corrigida:

|ProdutoID|NomeProduto|PrecoUnitario|
|---|---|---|
|201|Caneta|2.50|
|202|Lápis|1.50|

---

|VendaID|ProdutoID|Quantidade|
|---|---|---|
|V001|201|10|
|V001|202|5|

Agora cada atributo depende totalmente de sua chave primária da sua tabela, ficando estruturada na 2FN.
