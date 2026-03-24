# 📚 20 Questões Objetivas — Pilhas em Python  
## **Aluno: Elizeu Corrêa do Prado**

---

### 1. Uma pilha (stack) segue qual princípio?

- [ ] A) FIFO  
- [X] B) LIFO  
- [ ] C) FILO  
- [ ] D) LILO  

> **Comentário:** Uma pilha segue o princípio **LIFO (Last In, First Out)**; o último elemento inserido é o primeiro a ser removido.

---

### 2. Qual estrutura nativa de Python é mais usada para implementar uma pilha?

- [ ] A) Tuple  
- [ ] B) Dictionary  
- [X] C) List  
- [ ] D) Set  

> **Comentário:** A estrutura `list` é mais utilizada em Python para implementar pilhas, usando os métodos `append()` e `pop()`.

---

### 3. Qual método adiciona um elemento ao topo da pilha em Python?

- [ ] A) insert()  
- [X] B) append()  
- [ ] C) add()  
- [ ] D) push()  

> **Comentário:** O método `append()` adiciona um elemento no final da lista, que representa o topo da pilha.

---

### 4. Qual método remove o elemento do topo da pilha?

- [ ] A) delete()  
- [ ] B) remove()  
- [X] C) pop()  
- [ ] D) clear()  

> **Comentário:** O método `pop()` remove e retorna o último elemento da lista.

---

### 5. Qual estrutura representa corretamente uma pilha?

- [ ] A) 1 → 2 → 3 → 4  
- [X] B)  
    Topo  
    4  
    3  
    2  
    1  
    Base  
- [ ] C) 1 2 3 4  
- [ ] D) 4 → 3 → 2 → 1  

> **Comentário:** A alternativa B representa elementos empilhados verticalmente, do topo à base.

---

### 6. Qual código cria uma pilha vazia em Python?

- [ ] A) `pilha = ()`  
- [ ] B) `pilha = {}`  
- [X] C) `pilha = []`  
- [ ] D) `pilha = set()`  

> **Comentário:** Uma lista vazia (`[]`) representa uma pilha em Python.

---

### 7. Qual código adiciona um elemento à pilha?

- [ ] A) `pilha.add(10)`  
- [ ] B) `pilha.push(10)`  
- [X] C) `pilha.append(10)`  
- [ ] D) `pilha.insert(10)`  

> **Comentário:** O método `append()` adiciona ao topo da pilha.

---

### 8. Qual código remove o elemento do topo da pilha?

- [X] A) `pilha.pop()`  
- [ ] B) `pilha.remove()`  
- [ ] C) `pilha.delete()`  
- [ ] D) `pilha.clear()`  

> **Comentário:** `pop()` remove o último elemento da lista.

---

### 9. Qual erro ocorre ao usar `pop()` em uma pilha vazia?

- [ ] A) SyntaxError  
- [X] B) IndexError  
- [ ] C) TypeError  
- [ ] D) ValueError  

> **Comentário:** Com `pop()` em lista vazia, Python lança um IndexError.

---

### 10. Qual operação permite visualizar o topo da pilha sem removê-lo?

- [ ] A) `pilha.peek()`  
- [X] B) `pilha[-1]`  
- [ ] C) `pilha.top()`  
- [ ] D) `pilha.get()`  

> **Comentário:** `pilha[-1]` retorna o último elemento da lista (topo da pilha).

---

### 11. Qual biblioteca Python possui uma estrutura específica para pilha?

- [ ] A) random  
- [X] B) collections  
- [ ] C) math  
- [ ] D) statistics  

> **Comentário:** A biblioteca `collections` oferece estruturas como deque.

---

### 12. Qual estrutura da biblioteca `collections` pode ser usada como pilha?

- [ ] A) Counter  
- [ ] B) OrderedDict  
- [X] C) deque  
- [ ] D) ChainMap  

> **Comentário:** `deque` é eficiente para operações em ambos os extremos.

---

### 13. Qual comando cria uma pilha usando `deque`?

- [X] A) `pilha = deque()`  
- [ ] B) `pilha = list()`  
- [ ] C) `pilha = stack()`  
- [ ] D) `pilha = queue()`  

> **Comentário:** O comando correto é `pilha = deque()`.

---

### 14. Qual aplicação clássica usa pilhas?

- [ ] A) Banco de dados  
- [X] B) Avaliação de expressões matemáticas  
- [ ] C) Redes neurais  
- [ ] D) Sistemas operacionais  

> **Comentário:** Pilhas são úteis em avaliação de expressões.

---

### 15. Qual algoritmo usa pilha?

- [ ] A) Busca em largura  
- [X] B) Busca em profundidade (DFS)  
- [ ] C) Ordenação por seleção  
- [ ] D) Bubble Sort  

> **Comentário:** DFS utiliza pilha para explorar grafos.

---

### 16. Qual estrutura armazena chamadas de funções em Python?

- [ ] A) Heap  
- [ ] B) Queue  
- [X] C) Call Stack  
- [ ] D) Cache  

> **Comentário:** Chamadas de função são armazenadas na **call stack**.

---

### 17. Qual a complexidade da operação `append()` em uma pilha Python?

- [ ] A) O(n)  
- [X] B) O(1)  
- [ ] C) O(log n)  
- [ ] D) O(n²)  

> **Comentário:** `append()` tem complexidade constante O(1).

---

### 18. Qual estrutura pode implementar uma pilha?

- [ ] A) Lista  
- [ ] B) Lista encadeada  
- [ ] C) Array  
- [X] D) Todas as alternativas  

> **Comentário:** Pilhas podem ser implementadas com diversas estruturas.

---

### 19. Qual alternativa representa corretamente as operações de pilha?

- [ ] A) enqueue / dequeue  
- [X] B) push / pop  
- [ ] C) add / remove  
- [ ] D) insert / delete  

> **Comentário:** As operações fundamentais de uma pilha são push (inserir) e pop (remover).

---

### 20. Qual código representa corretamente uma pilha em Python?

- [X] A)
    ```python
    pilha = []
    pilha.append(1)
    pilha.append(2)
    pilha.pop()
    ```
- [ ] B) `pilha = {}`  
- [ ] C) `pilha = set()`  
- [ ] D) `pilha = ()`  

> **Comentário:** O código da alternativa A utiliza corretamente uma lista como pilha, inserindo e removendo elementos.

---