import java.util.*

fun main() {

    print("Digite o numero do mes: ")
    val reader = Scanner(System.`in`)

    val mes = reader.nextInt()

    val nomeDomes = when (mes) {
        1 -> "Janeiro"
        2 -> "Fevereiro"
        3 -> "Março"
        4 -> "Abril"
        5 -> "Maio"
        6 -> "Junho"
        7 -> "Julho"
        8 -> "Agosto"
        9 -> "Setembro"
        10 -> "Outubro"
        11 -> "Novembro"
        12 -> "Dezembro"
        else -> "Mês invalido"
    }
    println(nomeDomes)
}