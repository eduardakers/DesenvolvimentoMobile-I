package model

data class Fornecedor(
    val cnpj:Short,
    var endereco:String,
    var nomeFantasia: String,
    var razaoSocial:String
)