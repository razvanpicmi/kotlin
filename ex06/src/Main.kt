fun analizaNumar(numar: Int): String {
    return when (numar) {
        in 1..10 -> {
            println("Număr mic")
            "interval mic"  // valoarea returnată de bloc
        }
        in 11..100 -> {
            println("Număr mediu")
            // și alte prelucrări aici...
            "interval mediu"
        }
        else -> {
            println("Număr mare sau negativ")
            "în afara intervalului 1..100"
        }
    }
}

fun main() {
    val rezultat = analizaNumar(50)
    println("Analiza numărului: $rezultat")
}
