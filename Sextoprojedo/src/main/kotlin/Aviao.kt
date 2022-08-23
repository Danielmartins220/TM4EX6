class Aviao (
    val modelo: String,
    val acentos: Int,
    val ligado: Boolean,
    ) {

    fun ligarAviao() {
        if (ligado) {
            println("avião ligado e decolando ")
        } else {
            println("avião esta desicado e não decolou ")
        }
    }
}

