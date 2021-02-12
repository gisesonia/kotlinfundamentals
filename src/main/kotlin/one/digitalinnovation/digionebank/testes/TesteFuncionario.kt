package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main(){
    val dados = Pessoa(nome = "Gisele", cpf = "123456")

    println(dados.nome)
    println(dados.cpf)
    println("------------------------")

    val joao = Funcionario("João da Silva", "123455667", BigDecimal.valueOf(2000.0))

    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)
}