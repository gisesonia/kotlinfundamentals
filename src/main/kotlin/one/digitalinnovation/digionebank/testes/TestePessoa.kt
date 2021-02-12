package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Pessoa

fun main(){
    val dados = Pessoa(nome = "Gisele", cpf = "123456")

    println(dados.nome)
    println(dados.cpf)
}