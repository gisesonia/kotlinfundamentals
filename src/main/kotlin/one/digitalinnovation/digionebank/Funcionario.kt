package one.digitalinnovation.digionebank

//classe abstrata
abstract class Funcionario(
    nome: String,
    cpf: String,
    val salario: Double
) : Pessoa(nome,cpf) {
    //só a classe funcionário e as classes filhas tem acesso com o protected
   protected abstract  fun calculoAuxilio(): Double;

//formatação de texto para não aparecer somente a referência do objeto
    override fun toString(): String = """
        Nome: $nome
        Cpf: $cpf
        Salario: $salario
        Auxilio: ${calculoAuxilio()}
    """.trimIndent()
}


/* Com open class precisa de overrride
class Funcionario(
    override val nome: String,
    override val cpf: String,
    val salario: BigDecimal
) : Pessoa(nome,cpf) {
}*/
