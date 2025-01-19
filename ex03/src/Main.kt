fun categorieVarsta(varsta: Int): String {
    val categorie = when {
        varsta < 18 -> "minor"
        varsta in 18..64 -> "adult"
        else -> "pensionar"
    }
    return categorie
}

fun main() {
    println(categorieVarsta(10))  // minor
    println(categorieVarsta(30))  // adult
    println(categorieVarsta(70))  // pensionar
}
