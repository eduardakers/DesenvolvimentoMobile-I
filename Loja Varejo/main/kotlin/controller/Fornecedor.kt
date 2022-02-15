package controller

class Fornecedor {
    fun fornecedorFactory(
        cnpj: Short,
        endereco: String,
        nomeFantasia: String,
        razaoSocial: String

    ) = model.Fornecedor(
        cnpj = cnpj,
        endereco = endereco,
        nomeFantasia = nomeFantasia,
        razaoSocial = razaoSocial
    )
}