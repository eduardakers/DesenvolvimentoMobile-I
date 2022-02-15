package controller

class Venda {
    fun vendaFactory(
        comissao: String,

    ) = model.Venda(
        comissao = comissao
    )
}