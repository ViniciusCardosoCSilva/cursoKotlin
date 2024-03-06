import java.nio.channels.FileLock

fun main() {

    //Tipos Númericos Inteiros
    val num1: Byte = 127
    val num2: Short = 32767
    val num3: Int = 2_147_483_647
    val num4: Long = 9_223_372_036_854_775_807

    //Tipos Numérios Reais
    val num5: Float = 3.14F
    val num6: Double = 3.14

    //Tipo Caractere
    val char: Char = '?'

    //TipoBooleano
    val boolean: Boolean = true

    println(listOf("\n", num1, "\n", num2,"\n", num3,"\n", num4,"\n", num5,"\n", num6,"\n", char,"\n", boolean))

    println(2 is Int)
    println(1.0 is Double)


}



