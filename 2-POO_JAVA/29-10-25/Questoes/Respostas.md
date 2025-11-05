# Exercícios Simples de Java — Iniciantes

A seguir estão 20 exercícios com os respectivos códigos em Java. Cada exercício tem o título e o código em um bloco de código. Copie cada classe para um arquivo .java com o mesmo nome da classe pública e execute.

### 1. Olá, Mundo!
```java
public class Ex1_OlaMundo {
    public static void main(String[] args) {
        System.out.println("Olá, Mundo!");
    }
}
```

### 2. Soma de Dois Números
```java
import java.util.Scanner;

public class Ex2_SomaDoisNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro inteiro: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo inteiro: ");
        int b = sc.nextInt();
        System.out.println("Soma: " + (a + b));
        sc.close();
    }
}
```

### 3. Média de Três Números
```java
import java.util.Scanner;

public class Ex3_MediaTresNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double a = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double b = sc.nextDouble();
        System.out.print("Digite o terceiro número: ");
        double c = sc.nextDouble();
        double media = (a + b + c) / 3.0;
        System.out.printf("Média: %.2f%n", media);
        sc.close();
    }
}
```

### 4. Entrada e Saída de Nome
```java
import java.util.Scanner;

public class Ex4_EntradaSaidaNome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Olá, " + nome + "!");
        sc.close();
    }
}
```

### 5. Cálculo da Idade
```java
import java.util.Scanner;

public class Ex5_CalculoIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ano de nascimento: ");
        int nasc = sc.nextInt();
        System.out.print("Ano atual: ");
        int atual = sc.nextInt();
        int idade = atual - nasc;
        System.out.println("Idade: " + idade + " anos");
        sc.close();
    }
}
```

### 6. Conversão de Dólares
(Assume-se que a cotação informada é o valor em reais por 1 dólar.)
```java
import java.util.Scanner;

public class Ex6_ConversaoDolares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor em reais: ");
        double reais = sc.nextDouble();
        System.out.print("Cotação do dólar (R$ por US$1): ");
        double cotacao = sc.nextDouble();
        if (cotacao == 0) {
            System.out.println("Cotação inválida.");
        } else {
            double dolares = reais / cotacao;
            System.out.printf("Valor em dólares: %.2f%n", dolares);
        }
        sc.close();
    }
}
```

### 7. Área do Retângulo
```java
import java.util.Scanner;

public class Ex7_AreaRetangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Base do retângulo: ");
        double base = sc.nextDouble();
        System.out.print("Altura do retângulo: ");
        double altura = sc.nextDouble();
        double area = base * altura;
        System.out.printf("Área: %.2f%n", area);
        sc.close();
    }
}
```

### 8. Conversão de Minutos
```java
import java.util.Scanner;

public class Ex8_ConversaoMinutos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de minutos: ");
        int minutos = sc.nextInt();
        int horas = minutos / 60;
        int resto = minutos % 60;
        System.out.println(minutos + " minutos = " + horas + " hora(s) e " + resto + " minuto(s)");
        sc.close();
    }
}
```

### 9. Par ou Ímpar
```java
import java.util.Scanner;

public class Ex9_ParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Ímpar");
        }
        sc.close();
    }
}
```

### 10. Maior de Dois Números
```java
import java.util.Scanner;

public class Ex10_MaiorDoisNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Primeiro número: ");
        double a = sc.nextDouble();
        System.out.print("Segundo número: ");
        double b = sc.nextDouble();
        if (a > b) {
            System.out.println("Maior: " + a);
        } else if (b > a) {
            System.out.println("Maior: " + b);
        } else {
            System.out.println("Os números são iguais: " + a);
        }
        sc.close();
    }
}
```

### 11. Menor de Três Números
```java
import java.util.Scanner;

public class Ex11_MenorTresNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double a = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double b = sc.nextDouble();
        System.out.print("Digite o terceiro número: ");
        double c = sc.nextDouble();
        double menor = a;
        if (b < menor) menor = b;
        if (c < menor) menor = c;
        System.out.println("Menor: " + menor);
        sc.close();
    }
}
```

### 12. Positivo, Negativo ou Zero
```java
import java.util.Scanner;

public class Ex12_PositivoNegativoZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double n = sc.nextDouble();
        if (n > 0) {
            System.out.println("Positivo");
        } else if (n < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Zero");
        }
        sc.close();
    }
}
```

### 13. Dias da Semana
```java
import java.util.Scanner;

public class Ex13_DiasSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número (1-7): ");
        int d = sc.nextInt();
        switch (d) {
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda-feira");
            case 3 -> System.out.println("Terça-feira");
            case 4 -> System.out.println("Quarta-feira");
            case 5 -> System.out.println("Quinta-feira");
            case 6 -> System.out.println("Sexta-feira");
            case 7 -> System.out.println("Sábado");
            default -> System.out.println("Número inválido. Use 1 a 7.");
        }
        sc.close();
    }
}
```

### 14. Tabuada do Número
```java
import java.util.Scanner;

public class Ex14_Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
        sc.close();
    }
}
```

### 15. Contagem de 1 a N
```java
import java.util.Scanner;

public class Ex15_Contagem1aN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite N (inteiro positivo): ");
        int N = sc.nextInt();
        if (N < 1) {
            System.out.println("N deve ser >= 1");
        } else {
            for (int i = 1; i <= N; i++) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
```

### 16. Soma de 1 a 100
```java
public class Ex16_Soma1a100 {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 1; i <= 100; i++) {
            soma += i;
        }
        System.out.println("Soma de 1 a 100: " + soma);
    }
}
```

### 17. Fatorial de um Número
```java
import java.util.Scanner;

public class Ex17_Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um inteiro não-negativo: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Fatorial não definido para números negativos.");
        } else {
            long fat = 1;
            for (int i = 2; i <= n; i++) {
                fat *= i;
            }
            System.out.println(n + "! = " + fat);
        }
        sc.close();
    }
}
```

### 18. Números Pares de 1 a 50
```java
public class Ex18_Pares1a50 {
    public static void main(String[] args) {
        for (int i = 2; i <= 50; i += 2) {
            System.out.println(i);
        }
    }
}
```

### 19. Contagem de Letras
(Usando somente length() conforme solicitado.)
```java
import java.util.Scanner;

public class Ex19_ContagemLetras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine().trim();
        System.out.println("Número de letras: " + palavra.length());
        sc.close();
    }
}
```

### 20. Cálculo de Consumo de Combustível
```java
import java.util.Scanner;

public class Ex20_ConsumoCombustivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Distância percorrida (km): ");
        double distancia = sc.nextDouble();
        System.out.print("Total de combustível gasto (litros): ");
        double litros = sc.nextDouble();
        if (litros == 0) {
            System.out.println("Litros informados inválidos (zero).");
        } else {
            double consumo = distancia / litros;
            System.out.printf("Consumo médio: %.2f km/l%n", consumo);
        }
        sc.close();
    }
}
```