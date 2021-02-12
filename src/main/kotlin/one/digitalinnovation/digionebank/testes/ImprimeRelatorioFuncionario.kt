package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario

class ImprimeRelatorioFuncionario {

    //método estático consegue acessar sem criar uma instância
    companion object {
        fun imprime(funcionario: Funcionario) {
            println(funcionario.toString())
        }
    }
}