package one.digitalinnovation.digionebank


class Analista(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(nome, cpf, salario) {
    //implementação da função funcionário
    override fun calculoAuxilio() = salario * 0.1
}