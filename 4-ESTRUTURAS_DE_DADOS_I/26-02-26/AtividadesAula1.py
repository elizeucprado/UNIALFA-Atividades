print("### Questão 1 ###")
numeros = [10, 5, 30, 2, 18]

print(max(numeros))
print(min(numeros))





print("\n### Questão 2 ###")
numeros = [10, 20, 30, 40]

media = sum(numeros) / len(numeros)

print(media)





print("\n### Questão 3 ###")
lista = [1, 2, 3]
print("Lista Antiga:", lista)

lista.append(4)
print("Lista Nova: ", lista)





print("\n### Questão 4 ###")
lista = [10, 20, 30]

lista.insert(1, 15)

print(lista)





print("\n### Questão 5 ###")
numeros = [1, 2, 3, 4, 5, 6, 7, 8]

numeros = [n for n in numeros if n % 2 != 0]

print(numeros)





print("\n### Questão 6 ###")
lista = [1, 2, 3, 4]

invertida = lista[::-1]

print(invertida)
lista = [1, 2, 3, 4]





print("\n### Questão 7 ###")
lista = [1, 2, 3, 2, 4, 2, 5]

quantidade = lista.count(2)

print("O número 2 aparece:", quantidade, "vezes")





print("\n### Questão 8 ###")
numeros = [10, 5, 30, 25, 18, 30]
listaSemRepetidos = []

for item in numeros:
    if item not in listaSemRepetidos:
        listaSemRepetidos.append(item)

print("Segundo maior:", listaSemRepetidos[-2])
print(numeros)





print("\n### Questão 9 ###")
def busca(lista, valor):
    for i in range(len(lista)):
        if lista[i] == valor:
            return i
    return "Número Não Encontrado!"

lista = [10, 20, 30, 40]

print(busca(lista, 20))




print("\n### Questão 10 ###")
def bubble_sort(lista):
    n = len(lista)

    for i in range(n):
        for j in range(0, n-i-1):
            if lista[j] > lista[j+1]:
                lista[j], lista[j+1] = lista[j+1], lista[j]

    return lista

numeros = [5, 1, 4, 2, 8]

print("Lista Normal: ",numeros)
print("Lista Ordenada(Bubble Sort): ", bubble_sort(numeros))




print("\n### Questão 11 ###")
lista = [1, 2, 3, 2, 4, 1, 7]

listaSemRepetidos = []

for item in lista:
    if item not in listaSemRepetidos:
        listaSemRepetidos.append(item)

print(listaSemRepetidos)




print("\n### Questão 12 ###")
lista1 = [1,2,3]
lista2 = [4,5,6]

resultado = []

for i in range(len(lista1)):
    resultado.append(lista1[i])
    resultado.append(lista2[i])

print(resultado)




print("\n### Questão 13 ###")
lista = [1,2,3,4]

lista = [lista[-1]] + lista[:-1]

print(lista)




print("\n### Questão 14 ###")
lista = [1,2,3,4,3,2,1]

if lista == lista[::-1]:
    print(lista, "É palíndromo")
else:
    print(lista, "Não é palíndromo")