fun main1() {
    println(" Digite o nome do produto")
    val nome =  readln()

    println(" Digite o a marca do produto")
    val marca =  readln()

    println(" Digite o processador do produto")
    val processador =  readln()

    println(" Digite  a carga do produto")
    val carga =  readln().toDouble()

    println(" Digite  a voltagem do produto")
    val voltagem =  readln().toDouble()


    val cpu = ProdutoEletronico(
    nome,
    marca,
    processador,
    carga,
    voltagem
    )
    cpu.ligarDesligar()

    cpu.carregar(valor = 600.5)
}
