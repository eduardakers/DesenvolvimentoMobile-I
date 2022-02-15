package model

data class Cliente(
    val nome: String,
    var telefone: Short,
    val cpf: Short,
    val endereco: String,
)