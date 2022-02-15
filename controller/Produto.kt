package controller

class Produto {
    fun produtoFactory(
        cor: String,
        embalagem: String,
        tamanho: String,
        precoDoProduto: String,

    ) = model.Produto(
        cor = cor,
        embalagem = embalagem,
        tamanho = tamanho,
        precoDoProduto = precoDoProduto

    )
}