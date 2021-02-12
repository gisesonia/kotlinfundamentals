package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
/*
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal
*/

fun main(){

    val joao = Analista("João Souza", "2345678",5000.0)
    ImprimeRelatorioFuncionario.imprime(joao)

  /* Referência para estudo
   val dados = Pessoa(nome = "Gisele", cpf = "123456")

    println(dados.nome)
    println(dados.cpf)
    println("------------------------")

    val joao = Funcionario("João da Silva", "123455667", BigDecimal.valueOf(2000.0))

    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)*/
}

//fun imprimeRelatorio(funcionario: Funcionario) = println(funcionario)
