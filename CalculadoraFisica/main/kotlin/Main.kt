
fun main(){
    val aulaFisica = Fisica()

    println("Digite a massa:")
    val num1:Float = readLine()!!.toFloat()
    println("Digite a gravidade:")
    val num2:Float = readLine()!!.toFloat()
    println("Digite a velocidade:")
    val num3:Float = readLine()!!.toFloat()
    println("Digite o raioDaCurva:")
    val num4:Float = readLine()!!.toFloat()
    println("Digite a foraNewton:")
    val num5:Float = readLine()!!.toFloat()
    println("Digite o tempoFinal:")
    val num6:Float = readLine()!!.toFloat()
    println("Digite o deslocamentoEmMetros:")
    val num7:Float = readLine()!!.toFloat()
    println("Digite o deslocamento:")
    val num8:Float = readLine()!!.toFloat()
    println("Digite o intervaloDeTempo:")
    val num9:Float = readLine()!!.toFloat()
    println("Digite a espacoInicial:")
    val num10:Float = readLine()!!.toFloat()
    println("Digite o tempo:")
    val num11:Float = readLine()!!.toFloat()
    println("Digite o tempoInicial:")
    val num12:Float = readLine()!!.toFloat()
    println("Digite a aceleracao:")
    val num13:Float = readLine()!!.toFloat()
    println("Digite a velocidadeInicial:")
    val num14:Float = readLine()!!.toFloat()
    println("Digite o tempoFinal:")
    val num15:Float = readLine()!!.toFloat()

    val calForca = aulaFisica.calForca(num1,num2)
    val calCentripeta = aulaFisica.calCentripeta(num1,num3,num4)
    val calImpulso = aulaFisica.calImpulso(num5,num6,num12)
    val calElastica = aulaFisica.caleElastica(num5,num7)
    val calVelocidadeMedia = aulaFisica.calVelocidadeMedia(num8,num9)
    val calMru = aulaFisica.calMru(num3,num11,num10,num15)
    val calMruv = aulaFisica.calMruv(num10,num11,num13,num14)

    println("o resultado da calForca é $calForca")
    println("o resultado da calCentripeta é $calCentripeta")
    println("o resultado da calImpulso é $calImpulso")
    println("o resultado da calElastica é $calElastica")
    println("o resultado da calVelocidadeMedia é $calVelocidadeMedia")
    println("o resultado da calMru é $calMru")
    println("o resultado da calMruv é $calMruv")
}