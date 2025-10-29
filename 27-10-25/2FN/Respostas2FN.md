# Respostas Exercícios – Segunda Forma Normal (2FN)

## Exercício 1 – Conceito

A Segunda Forma Normal afirma que todas as colunas que não fazem parte da chave dependem da chave inteira, assim, nenhuma coluna depende só de uma parte de uma chave composta.

## Exercício 2 – Identificação

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

## Exercício 5 – Tabela com Chave Composta

## Exercício 6 – Benefícios da 2FN

## Exercício 7 – Multivalorados e 2FN

## Exercício 8 – Exercício Prático

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
