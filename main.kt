package view

fun main () {
    val clienteController = controller.Cliente()
    val cliente = clienteController.clienteFactory(
        nome = "João",
        telefone = 5192442324.toShort(),
        cpf = 91313154.toShort(),
        endereco = "Assis Brasil - nº124"
    )
    println(cliente)

    val fornecedorController = controller.Fornecedor()
    val fornecedor = fornecedorController.fornecedorFactory(
        cnpj = 123456789.toShort(),
        endereco = "Av.do forte - nº23",
        nomeFantasia = "Imports",
        razaoSocial = "Imports"
    )
    println(fornecedor)

    val produtoController = controller.Produto()
    val produto = produtoController.produtoFactory(
        cor = "Rosa",
        embalagem = "Plástico",
        tamanho = "Pequeno",
        precoDoProduto = "10 reais",
    )
    println(produto)

    val transportadoraController = controller.Transportadora()
    val transportadora = transportadoraController.transportadoraFactory(
        cnpj = 987654321.toShort(),
        nomeDaEmpresa = "Transporte LTA",
        valorPorFrete = "100 reais",
    )
    println(transportadora)

    val vendaController = controller.Venda()
    val venda = vendaController.vendaFactory(
        comissao = "50 reais"
    )
    println(venda)

    val vendedorController = controller.Vendedor()
    val vendedor = vendedorController.vendedorFactory(
        nome = "Luis",
        cpf = 234567.toShort(),
        telefone = 4892418877.toShort(),
        endereco = "Protásio Alves - nº123",
        contaBanco = 1485243758.toShort(),
    )
    println(vendedor)

}

