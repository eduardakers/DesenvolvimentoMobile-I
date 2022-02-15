package controller

class Cliente {
    fun clienteFactory(
        nome: String,
        telefone: Short,
        cpf: Short,
        endereco: String,

    ) = model.Cliente(
        nome = nome,
        telefone = telefone,
        cpf = cpf,
        endereco = endereco
    )



}