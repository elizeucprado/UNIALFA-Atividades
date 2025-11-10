# Respostas Exercícios – Terceira Forma Normal (3FN)

## Exercício 1 – Conceito

## Exercício 2 – Identificação

A tabela está em 3FN? Justifique sua resposta.
A tabela não está em 3FN, Pois os atributos não-chave GerenteDepartamento depende  de Departamento e não de Funcionário diretamente, gerando uma dependência transitiva, pois isso viola a 3FN, O atributo GerenteDepartamento depende de outro atributo não-chave Departamento, e não diretamente da chave primária.

### 👥 Tabela Funcionarios

|FuncionarioID|Nome|Departamento|
|---|---|---|
|001|Ana|Vendas|
|002|Bruno|Compras|
|003|Carla|Vendas|

### 🏢 Tabela Departamentos

|Departamento|GerenteDepartamento|
|---|---|
|Vendas|Carlos|
|Compras|Carla|

## Exercício 3 – Dependência Transitiva

Em um banco de dados relacional organizado em tabelas, a dependência transitiva surge quando um atributo, que não é chave, tem sua definição atrelada a outro atributo também não chave. 

Em outras palavras, sua existência não depende diretamente da chave primária. De maneira mais formal, identificamos uma dependência transitiva quando observamos o seguinte padrão:

- Se A determina B, e B determina C, então A determina C. (Contudo, a existência de C não está diretamente ligada a A, mas sim à B)

###     Por que isso viola a Terceira Forma Normal (3FN)

Para estar na Terceira Forma Normal (3FN), é preciso que:
A tabela já esteja em Segunda Forma Normal (2FN), o que quer dizer que não pode haver dependências parciais, e Nenhum atributo que não seja chave dependa de um outro atributo que também não seja chave.

Assim, a existência de uma dependência transitiva indica que um atributo que não é chave está atrelado a outro atributo que também não é chave – o que não está de acordo com a 3FN.

- Exemplo prático:

|ID_Aluno| Nome_Aluno| Cod_Curso| Nome_Curso| Coordenador|
|---|---|---|---|---|
|1| Lais| ADS| Análise e Desenvolvimento de Sistemas| Prof. Danilo|
|2| Rodrigo| S.I| Sistema de informação|Prof. Amanda|

### 

- Chave primária: ID_Aluno
- Dependências:
    - ID_Aluno → Cod_Curso (cada aluno está em um curso)
    - Cod_Curso → Nome_Curso, Coordenador (cada curso tem nome e coordenador)

Logo:

- ID_Aluno → Cod_Curso → Coordenador.

**Isso é uma dependência transitiva.**

### Como corrigir (3FN)

Dividimos a tabela em duas:

- Tabela ALUNO:

|ID Aluno|Nome Aluno| Cod Curso|
|---|---|---|

- Tabela CURSO:

|Cod curso| Nome Curso| Coordenador|
|---|---|---|

Agora, cada atributo não chave depende diretamente da chave primária de sua própria tabela — e não há mais dependência transitiva. Assim, as tabelas estão na Terceira Forma Normal (3FN).

## Exercício 4 – Conversão para 3FN

Tabela Original
|AlunolD|NomeAluno|CursolD|NomeCurso|CoordenadorCurso|
|---|---|---|---|---|
|A01|João|C01|Matemática|Professora Ana|
|A02|Maria|C02|Física|Professor Bruno|

### 2ª Forma Normal (2FN)

Para atingir a 2FN, precisamos eliminar dependências parciais. Vamos criar tabelas separadas para Alunos e Cursos.

### Tabela Alunos

|AlunolD|NomeAluno|
|---|---|
|A01|João|
|A02|Maria|

### Tabela Cursos

|CursolD|NomeCurso|CoordenadorCurso|
|---|---|---|
|C01|Matemática|Professora Ana|
|C02|Física|Professor Bruno|

### Tabela Alunos x Cursos

|AlunoID|CursoID|
|---|---|
|A01|C01|
|A02|C01|

### 3ª Forma Normal (3FN)

Na tabela Cursos, o CoordenadorCurso depende apenas do CursolD, então está tudo bem.

### Tabelas Finais
### Tabela Alunos

|AlunolD|NomeAluno|
|---|---|
|A01|João|
|A02|Maria|

### Tabela Cursos

|CursolD|NomeCurso|CoordenadorCurso|
|---|---|---|
|C01|Matemática|Professora Ana|
|C02|Física|Professor Bruno|

### Tabela Alunos x Cursos

|AlunoID|CursoID|
|---|---|
|A01|C01|
|A02|C01|

## Exercício 5 – Tabela com Dependência Transitiva

## Exercício 6 – Benefícios da 3FN

1. Elimina dependências transitivas (campos que dependem de outros campos não-chave).
2. Evita anomalias de atualização, inserção e exclusão.
3. Melhora a integridade, clareza e confiabilidade do modelo de dados.

## Exercício 7 – Redundância e 3FN

A 3FN foca principalmente em remover redundâncias e dependências transitivas.  

Exemplo:  

|AlunoID|NomeAluno|CursoID|NomeCurso|CoordenadorCurso|
|---|---|---|---|---|
|A01|João|C01|Matemática|Prof. Ana|
|A02|Maria|C02|Física|Prof. Bruno|
 
A tabela tem Coordenador que é dependente do NomeCurso que é dependente do Curso ID.  

Logo não se encaixa no padrão 3Fn já que existe chave dependentes de chaves não primárias.

## Exercício 8 – Exercício Prático

### Tabela Departamentos

| Campo | Tipo de Dado | Descrição |
|---|---|---|
| idDepartamento | int (PK) | Identificador único do departamento |
| nome | varchar(100) | Nome do departamento |
| localizacao | varchar(100) | Localização/sede do departamento |
| gerenteId | int (FK -> Funcionarios.idFuncionario) | Referência ao funcionário que é gerente (não repetir dados do funcionário) |

---

### Tabela Funcionários

| Campo | Tipo de Dado | Descrição |
|---|---|---|
| idFuncionario | int (PK) | Identificador único do funcionário |
| primeiroNome | varchar(50) | Primeiro nome |
| sobrenome | varchar(50) | Sobrenome |
| email | varchar(100) | E-mail (único) |
| telefone | varchar(20) | Telefone |
| dataNascimento | date | Data de nascimento |
| dataContratacao | date | Data de contratação |
| cargo | varchar(100) | Cargo/função |
| salario | decimal(12,2) | Salário |
| idDepartamento | int (FK -> Departamentos.idDepartamento) | Departamento onde o funcionário trabalha |

## Exercício 9 – Teoria e Prática

### Tabela.

| CPF | Funcionário | Projeto | Líder_Projeto |
|---|---|---|---|
|1111 | Renan | SIS | Sara|
|2222 | Victor | CAD | Marcos|
|3333 | Eduardo | UNI | Telma|
|4444 | Maria | CAD | Marcos|

Ela pertence a 2FN por não ter grupos repetidos nem dependência parcial. Porém, possui dependência transitiva, pois a coluna Líder_Projeto depende de uma coluna não-chave, a coluna Projeto.

## Exercício 10 – Revisão

Uma tabela está na Terceira Forma Normal (3FN) quando tudo nela depende direto da chave primária, e nada depende de outra coluna que não seja a chave.
Ou seja, depois de aplicar a 2FN (sem dependências parciais), você precisa garantir que não existem dependências transitivas.

Por exemplo: se numa tabela de alunos eu tenho ID_Aluno, Nome, ID_Turma e Nome_Turma, o Nome_Turma depende de ID_Turma, e ID_Turma depende de ID_Aluno. Isso é uma dependência em “cadeia” — ou seja, Nome_Turma depende indiretamente da chave.

Pra deixar essa tabela na 3FN, eu teria que separar:

uma tabela Alunos(ID_Aluno, Nome, ID_Turma) e outra tabela Turmas(ID_Turma, Nome_Turma)

Assim, cada coisa depende só da sua própria chave.