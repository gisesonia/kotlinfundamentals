package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.ClienteTipo
import one.digitalinnovation.digionebank.Logavel
import one.digitalinnovation.digionebank.Pessoa

class Cliente(
    nome: String,
    cpf: String,
    val clienteTipo: ClienteTipo,
    val senha: String
) : Pessoa(nome, cpf) , Logavel{
    override fun login(): Boolean = "123456" == senha

    override fun toString(): String = """
        Nome: $nome,
        Cpf:  $cpf,
        Tipo: $clienteTipo
    """.trimIndent()
}