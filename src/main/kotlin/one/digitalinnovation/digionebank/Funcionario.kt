package one.digitalinnovation.digionebank

import java.math.BigDecimal

//classe abstrata
abstract class Funcionario(
   nome: String,
   cpf: String,
   val salario: BigDecimal
) : Pessoa(nome,cpf) {
    abstract  fun calculoAuxilio();
}


/* Com open class precisa de overrride
class Funcionario(
    override val nome: String,
    override val cpf: String,
    val salario: BigDecimal
) : Pessoa(nome,cpf) {
}*/
