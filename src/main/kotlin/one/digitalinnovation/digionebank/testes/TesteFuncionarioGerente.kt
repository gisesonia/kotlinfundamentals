package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario


fun main(){

    val joao = Analista("João Souza", "2345678",5000.0)
    ImprimeRelatorioFuncionario.imprime(joao)


}


