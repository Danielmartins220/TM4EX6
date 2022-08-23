fun main() {
    println(" Digite o modelo do avião que voce ira decolar: ")
    val modelo = readln()

    println(" Digite o numero de acentos ")
    val acentos = readln().toInt()

    println(" Digite se o avião ja esta ligado e decolou ")
    val ligado = readln().toBoolean()

    val AviaoPronto = Aviao(
        modelo,
        acentos,
        ligado
    )
    println(AviaoPronto.modelo)
    println(AviaoPronto.acentos)
    println(AviaoPronto.ligado)

    AviaoPronto.ligarAviao()

}