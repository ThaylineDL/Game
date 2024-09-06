import Classes.Mago
import Jogador.Habilidade
import Jogador.Jogador
import Raca.*


fun main(args: Array<String>) {
    println("!----------------PERSONAGEM----------------!")
    val habilidad = Habilidade(9,9,9,0,0,0)
    val playerNew = Jogador("Mestre dos Magos", habilidad,Humano(),Mago())
    playerNew.exibirplayer()

}