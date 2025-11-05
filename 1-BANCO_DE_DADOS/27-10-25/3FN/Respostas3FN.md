# Respostas Exercícios – Terceira Forma Normal (3FN)

## Exercício 1 – Conceito

## Exercício 2 – Identificação

## Exercício 3 – Dependência Transitiva

## Exercício 4 – Conversão para 3FN

## Exercício 5 – Tabela com Dependência Transitiva

## Exercício 6 – Benefícios da 3FN

1. Elimina dependências transitivas (campos que dependem de outros campos não-chave).
2. Evita anomalias de atualização, inserção e exclusão.
3. Melhora a integridade, clareza e confiabilidade do modelo de dados.

## Exercício 7 – Redundância e 3FN

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
