package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Gisele"
    var cpf: String = "111.222.333-44"
}

fun main(){
    val dados = Pessoa()

    println(dados.nome)
    println(dados.cpf)
}