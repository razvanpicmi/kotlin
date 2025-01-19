fun main() {
    val x: Any = 42

    when (x) {
        is Int -> {
            if (x in 1..99) {
                println("x este un Int între 1 și 99")
            } else {
                println("x este un Int, dar în afara intervalului 1..99")
            }
        }
        is String -> println("x este un String de lungime ${x.length}")
        else -> println("x nu este nici Int, nici String")
    }
}
