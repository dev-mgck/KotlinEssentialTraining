package chapter4

/*
Usamos coleções para agrupar elementos.
Kotlin tem três tipos de coleção principais: listas, conjuntos e mapas.
Qual desses tipos você escolhe depende da sua tarefa.
A escolha do tipo certo pode fazer uma grande diferença no desempenho
de seu aplicativo. A propósito, arrays não fazem parte deste grupo, embora tenham
muitas semelhanças com listas. Todas as coleções vêm em duas variedades.
Somente leitura e mutável. Somente leitura nos fornece maneiras de acessar
itens, mas não podemos adicioná-los ou modificá-los. Coleções mutáveis VAR
nos fornecem maneiras de adicionar e modificar os elementos.
Nenhum deles tem nada a ver com os tipos de variáveis val ou var.
Gosto de pensar nas coleções como caixas que contêm muitos elementos.
O tipo de coleção determina como ele contém os elementos.
Os mapas os mantêm de uma maneira, definem de outra e listam ainda outra forma.
Se a coleção for somente leitura, isso significa que depois de colocar
os itens na caixa, você não pode retirar nenhum ou adicionar mais.
Da mesma forma, com uma coleção mutável, você pode brincar com os itens da caixa.
E, finalmente, o tipo de variável. Com um tipo de var mutável, posso apontar
para qualquer caixa de itens que eu gostaria, mas com o tipo de val,
só posso apontar para minha caixa original. Começaremos explorando as listas,
elas são as mais populares das três. Mas isso não significa que eles
devam ser sua única escolha.
*/

fun main() {

    // listOf() -> Lista Imutável
    val names = listOf("Daisy", "Hattan", "Rob", "Chenni")
    println(names)
    println("The first name is ${names.get(0)}") // acesso com get() não recomendado
    println("The first name is ${names[0]}") // [] -> acessor de index

    // subList() -> Permite a criação de sublista a partir de uma lista (cópia)
    val subNames = names.subList(1,3)
    println(subNames)
    val newList = names.subList(0, names.size)
    println(newList) // cópia da lista original
    println(names.component1())

    // mutableListOf -> Lista mutável.
    val items = mutableListOf(2, 4, 6, 8, 10, 10, 10, 10, 14)
    items[0] = 1
    items.add(12)
    items.removeAt(3)
    items.remove(99)
    println(items)
    println("There are ${items.size} items.")
    println("The first item is ${items.first()}")
}

