# Respostas Exercícios – Primeira Forma Normal (1FN)

## Exercício 1 – Conceito

Uma tabela estar na primeira forma normal significa que ela não contém grupos repetidos ou valores multivalorados, sendo assim os dados serão organizados em um formato simples e consistente, facilitando consultas e a manipulação dos dados.

## Exercício 2 – Identificação

Não está na 1FN, uma vez que possui múltiplos valores em uma única coluna (valor não-atômico).

## Exercício 3 – Conversão

### Tabela Aluno

| Id | Nome | CPF |
|---|---|---|
|001|João|000.000.000-01|
|002|Maria|000.000.000-02|
|003|Pedro|000.000.000-03|

---

### Tabela Diciplinas

| Id_Disciplina | Id_Aluno | Disciplina |
|---|---|---|
|1|001|Matemática|
|2|001|Física|
|3|002|Química|
|4|003|História|
|5|003|Geografia|
|6|003|Filosofia|

## Exercício 4 – Valores Atômicos

Na Primeira Forma Normal (1FN), cada atributo da tabela deve ter valores atômicos, ou seja, um único valor por campo — nada de listas ou valores múltiplos.

### Exemplo Incorreto

| Nome | Telefones |
|------|-----------|
|Ana| 9999-1111, 9888-2222|

---

### Exemplo Correto

| Nome | Telefone |
|------|----------|
| Ana  | 9999-1111|
| Ana  | 9888-2222|

---

**Assim, a tabela fica em conformidade com a 1FN.**

## Exercício 5 – Tabela com Repetição

1. A tabela não está na 1FN.

2. Tabela na 1FN:

| Pedido | Produto | Quantidade |
|---|---|---|
|001|Caneta|10|
|001|Lápis|5|
|002|Caderno|2|

## Exercício 6 – Identificador

Dever haver chave primária para que seja possível uma indentificação única que não se repete sendo assim possível localizar e indentificar precisamente o dado, para não houver confusão/erro de dados.

- Exemplo:

### Alunos Reprovados

| Nome | CPF |
|---|---|
| João Batista | 000.000.000-**01**|
| Maria Eduarda | 000.000.000-03 |
| William Henrique | 000.000.000-04 |

### Aluno Aprovados

| Nome | CPF |
|---|---|
| João Batista |000.000.000-**02**|
| Maria José | 000.000.000-05 |

---

Nesse exemplo vemos que se não tivéssemos a chave primária (CPF) não saberiamos qual João Batista seria aprovado ou reprovado.

## Exercício 7 – Multivalorados

### Tabela Paciente

| Id | Nome |
|---|---|
|1|Ana|
|2|Bruno|

---

### Tabela Alergia

| Id_Alergia | Id_Paciente | Alergia |
|---|---|---|
|001|1|Polén|
|002|1|Penicilina|
|003|2|Frutos do Mar|

## Exercício 8 – Exercício Prático

### Tabela Livros

| Campo | Tipo de Dado | Descrição |
|---|---|---|
| idLivro | int | Identificador único do livro |
| titulo | varchar(100) | Título do livro |
| autor | varchar(100) | Autor do livro |
| anoPublicacao | date | Ano de publicação do livro |
| editora | varchar(100) | Editora do livro |

### Tabela Auditores

| Campo | Tipo de Dado | Descrição |
|---|---|---|
| idAuditor | int | Identificador único do auditor |
| nome | varchar(100) | Nome do auditor |
| email | varchar(100) | E-mail do auditor |
| telefone | varchar(20) | Telefone do auditor |

### Tabela Livros_Auditores

| Campo | Tipo de Dado | Descrição |
|---|---|---|
| idLivro | int | Identificador do livro |
| idAuditor | int | Identificador do auditor |
| dataAuditoria | date | Data da auditoria |

## Exercício 9 – Teoria e Prática

Na Primeira Forma Normal (1FN), cada campo de uma tabela deve conter somente valores atômicos, ou seja, um único dado indivisível.
Não é permitido armazenar listas, conjuntos ou valores repetidos em um mesmo campo, pois isso dificulta filtrar, ordenar e atualizar os dados de forma correta.

### Exemplo que Viola a 1FN

| ID_Aluno | Nome | Telefones |
|---|---|---|
|1|Maria Silva|(62)99999-0000, (62)98888-1111|
|2|João Lima|(62)97777-2222, (62)96666-3333|

Problema: o campo “Telefones” contém vários valores na mesma célula, o que quebra a atomicidade dos dados.

---

### Exemplo Correto de 1FN

### Tabela Aluno

|ID_Aluno|Nome|
|---|---|
|1|Maria Silva|
|2|João Lima|

---

### Tabela Telefone

| ID_Telefone | ID_Aluno | Telefone |
|---|---|---|
|1|1|(62)99999-0000|
|2|1|(62)98888-1111|
|3|2|(62)97777-2222|
|4|2|(62)96666-3333|

## Exercício 10 – Revisão

1. A tabela não está na 1FN.

2. Tabela na 1FN:

| Id | Funcionario | CPF |
|---|---|---|
|001|Carlos|XXX|
|002|Marina|XXX|
|003|Roberto|XXX|

---

| Id | Projetos |
|---|---|
|001|P1|
|001|P2|
|002|P2|
|003|P3|
|003|P4|
|003|P5|