package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Gisele"
    var cpf: String = "111.222.333-44"
    private set

    constructor()

    fun pessoaInfo() = "Nome: $nome e CPF: $cpf"
}

fun main(){
    val dados = Pessoa()
    println(dados.pessoaInfo())

    println(dados.nome)
    println(dados.cpf)
}