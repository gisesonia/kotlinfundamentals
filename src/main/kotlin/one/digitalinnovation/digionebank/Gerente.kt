package one.digitalinnovation.digionebank

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String
) : Funcionario(nome = nome, cpf=cpf, salario = salario), Logavel{
    override fun calculoAuxilio(): Double = salario * 0.4

    //implementa o método login da interface Logavel
    override fun login(): Boolean = "senha123" == senha

}