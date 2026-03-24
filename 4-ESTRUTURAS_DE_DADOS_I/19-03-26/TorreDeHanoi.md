# 🧩 20 Perguntas — Torre de Hanói em Java
## **Aluno: Elizeu Corrêa do Prado**

---

## 🧠 Parte 1 – Conceitos Gerais

---

### 1. O que representa o problema da Torre de Hanói?
O problema da Torre de Hanói é um quebra-cabeça matemático que consiste em mover uma pilha de discos de tamanhos diferentes de uma haste para outra, respeitando regras específicas.

> **Comentário:** O objetivo é transferir todos os discos da haste origem para a haste destino, utilizando uma haste auxiliar, e sempre obedecendo às regras do jogo.

---

### 2. Quem foi o criador da Torre de Hanói e em que ano ela foi proposta?
Foi criada pelo matemático francês Édouard Lucas, em 1883.

> **Comentário:** Lucas foi quem idealizou e popularizou este famoso problema matemático.

---

### 3. Quais são as três regras fundamentais do jogo da Torre de Hanói?
1. Apenas um disco pode ser movido por vez.  
2. Um disco maior nunca pode ser colocado sobre um menor.  
3. Apenas o disco do topo de qualquer haste pode ser movido.

> **Comentário:** Essas regras estabelecem a lógica que torna o problema interessante e desafiador.

---

### 4. Qual é o objetivo principal do algoritmo da Torre de Hanói?
Transferir todos os discos da haste origem para a haste destino, seguindo as regras do jogo e utilizando a menor quantidade de movimentos possível.

> **Comentário:** O desafio maior é resolver o problema de forma otimizada.

---

### 5. Qual é a fórmula que calcula o número mínimo de movimentos necessários para resolver o problema com n discos?
O número mínimo de movimentos é dado por: **2ⁿ – 1**.

> **Comentário:** A cada novo disco, o número mínimo de movimentos dobra e soma-se um.

---

### 6. Quantos movimentos são necessários para resolver o problema com 3 discos?
São necessários 7 movimentos.

> **Comentário:** 2³ – 1 = 7.

---

### 7. Qual o tempo de complexidade do algoritmo da Torre de Hanói?
O tempo de complexidade é exponencial: **O(2ⁿ)**.

> **Comentário:** A medida que o número de discos aumenta, o número de movimentos cresce rapidamente.

---

### 8. Por que o problema da Torre de Hanói é considerado um exemplo clássico de recursão?
Porque sua solução natural envolve uma função que resolve versões menores do mesmo problema, chamando a si própria até atingir o caso base.

> **Comentário:** O algoritmo divide o problema em tarefas menores, resolvendo recursivamente.

---

### 9. O que significa “caso base” em um algoritmo recursivo, e qual é o caso base na Torre de Hanói?
Caso base é a condição que encerra a recursão. Na Torre de Hanói, ocorre quando há apenas um disco, que pode ser movido diretamente sem necessidade de novas chamadas recursivas.

> **Comentário:** O caso base evita loops infinitos e torna a função recursiva funcional.

---

### 10. O que acontece com o número de movimentos totais quando se adiciona mais um disco ao problema?
O número de movimentos dobra em relação ao anterior e soma-se mais um.

> **Comentário:** Por isso, a relação de crescimento é exponencial: para cada disco adicional, 2^(n-1) movimentos a mais.

---

## 💻 Parte 2 – Código Java

---

### 11. Qual é o papel dos parâmetros origem, destino e auxiliar no método moverDiscos()?
Representam as três hastes entre as quais os discos são movimentados. Eles determinam de onde os discos são movidos, para onde vão e qual haste serve de apoio temporário.

> **Comentário:** A correta identificação destes parâmetros é fundamental para o algoritmo funcionar.

---

### 12. O que acontece se o caso base `if (n == 1)` for removido do código?
Se o caso base for removido, o algoritmo entrará em recursão infinita, causando estouro de pilha (StackOverflow).

> **Comentário:** O caso base é essencial para interromper a recursão.

---

### 13. No trecho abaixo, o que significa a linha `moverDiscos(n - 1, origem, auxiliar, destino);`?

```java
moverDiscos(n - 1, origem, auxiliar, destino);
System.out.println("Mover disco " + n + " de " + origem + " para " + destino);
moverDiscos(n - 1, auxiliar, destino, origem);
```

Essa linha move os n–1 discos superiores da haste origem para a haste auxiliar, usando a haste destino como apoio.

> **Comentário:** Isso libera o disco maior na base para ser movimentado.

---

### 14. Por que o algoritmo chama o próprio método dentro dele (recursão)?
Para dividir o problema em subproblemas cada vez menores até atingir o caso mais simples (caso base).

> **Comentário:** A recursão simplifica a implementação do algoritmo.

---

### 15. O que a função `System.out.println()` exibe em cada iteração da função recursiva?
Ela exibe uma instrução para mover um disco específico de uma haste para outra.

> **Comentário:** Assim, o usuário acompanha a lista dos movimentos realizados pelo algoritmo.

---

### 16. Como o número de chamadas recursivas está relacionado ao número de discos (n)?
O número de chamadas recursivas aumenta exponencialmente junto com o número de discos.

> **Comentário:** A cada disco a mais, o número de chamadas e movimentos dobra e soma-se mais uma.

---

### 17. O que aconteceria se os parâmetros destino e auxiliar fossem trocados na primeira chamada recursiva?
O algoritmo faria movimentos errados e poderia não resolver corretamente o problema.

> **Comentário:** A ordem correta dos parâmetros é fundamental para a lógica do algoritmo.

---

### 18. Qual é o tipo de dado utilizado para representar as hastes (A, B, C) no código?
O tipo utilizado costuma ser o **char** (caractere).

> **Comentário:** Letras como 'A', 'B' e 'C' são típicas para identificar as hastes.

---

### 19. No programa com contador de movimentos, qual é a finalidade da variável contador?
Suas finalidade é armazenar e exibir o número total de movimentos realizados durante a resolução do problema.

> **Comentário:** Com isso, pode-se saber a eficiência e acompanhar o progresso do algoritmo.

---

### 20. Se n = 4, quantos movimentos o programa imprimirá no total?
Serão impressos 15 movimentos.

> **Comentário:** 2⁴ – 1 = 16 – 1 = 15.