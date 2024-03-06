fun soma(a: Int, b: Int = 1): Int {
    return a + b / 2
}

fun main() {
    println(soma(2,3))
    println(soma(11))
}