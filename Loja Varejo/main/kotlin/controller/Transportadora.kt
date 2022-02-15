package controller

class Transportadora {
    fun transportadoraFactory(
        cnpj: Short,
        nomeDaEmpresa: String,
        valorPorFrete: String,

    ) = model.Transportadora(
        cnpj = cnpj,
        nomeDaEmpresa = nomeDaEmpresa,
        valorPorFrete = valorPorFrete
    )
}