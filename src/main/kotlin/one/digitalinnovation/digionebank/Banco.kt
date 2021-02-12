package one.digitalinnovation.digionebank

data class Banco(
    var nome: String,
    val  numero: Int
) {
    fun info() = "$nome - $numero"
}
