class Fisica {
    fun calForca(massa:Float, gravidade:Float): Float {
        return massa * gravidade
    }
    fun calCentripeta(massa:Float, velocidade:Float, raioDaCurva:Float): Float{
        return massa * (velocidade * velocidade / raioDaCurva)
    }
    fun calImpulso(forcaNewton:Float, tempoInicial:Float, tempoFinal:Float): Float{
        return forcaNewton * (tempoInicial + tempoFinal)
    }
    fun caleElastica(forcaNewton:Float, deslocamentoEmMetros:Float): Float{
        return forcaNewton * deslocamentoEmMetros
    }
    fun calVelocidadeMedia(deslocamento:Float, intervaloDeTempo:Float): Float{
        return deslocamento / intervaloDeTempo
    }
    fun calMru(espacoInicial:Float, velocidade:Float, tempoInicial:Float, tempoFinal:Float ): Float{
        return espacoInicial + velocidade * (tempoInicial - tempoFinal)
    }
    fun calMruv(espacoInicial:Float, velocidadeInicial:Float, tempo:Float, aceleracao:Float): Float{
        return espacoInicial + (velocidadeInicial * tempo) + ((aceleracao * (tempo * tempo))/2)
    }
}
