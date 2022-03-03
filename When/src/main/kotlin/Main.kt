import java.util.Scanner

fun main (args: Array<String>) {
    atividade2()
}

fun atividade1() { val numeroDeObitos = 16520
    val numeroDeNascimento = 19529
    val numeroDeHabitantes = 1492530


    val natalidade = (numeroDeNascimento * 1000) / numeroDeHabitantes
    val mortalidade = (numeroDeObitos * 1000) / numeroDeHabitantes
    val opcao = 1
    when (opcao) {
        1 -> {
            println("mortalidade :"+ mortalidade+"%")
        }
        2 -> {
            println("natalidade :"+natalidade+"%")
        }
        else -> {
            println("opcao inválida")
        }
    }


}
fun atividade2() {

    var valorProduto = 0.0
    var opcaoPagamento = 0
    var numeroParcelas = 0
    val scanner  = Scanner(System.`in`)
    print("Digite o valor do produto: R$")
    valorProduto = scanner.nextDouble();
    println("Escolha o método de pagamento")
    println("1 - à vista")
    println("2 - à prazo (30 dias)")
    println("3 - à prazo parcelado")
    opcaoPagamento = scanner.nextInt()

    when(opcaoPagamento) {
        1 -> {
            var valorFinal = valorProduto / 0.9
            println("Valor final R$" + valorFinal)
        }
        2 -> {
            var valorFinal = valorProduto + (valorProduto * 0.03)
            println("Valor final R$" + valorFinal)
        }
        3 -> {
            println("Digite o número de parcelas")
            numeroParcelas = scanner.nextInt();
            var valorFinal = valorProduto + ((valorProduto * 0.015) * numeroParcelas)
            println("Valor final R$" + valorFinal)
        }



    }

}