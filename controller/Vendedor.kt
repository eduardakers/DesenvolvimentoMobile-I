package controller

class Vendedor {
    fun vendedorFactory(
        nome: String,
        cpf: Short,
        telefone: Short,
        endereco: String,
        contaBanco: Short

    ) = model.Vendedor(
        nome = nome,
        cpf = cpf,
        telefone = telefone,
        endereco = endereco,
        contaBanco = contaBanco
    )
}