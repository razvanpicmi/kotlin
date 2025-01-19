fun main() {
    val zi = "Sâmbătă"

    when (zi) {
        "Sâmbătă", "Duminică" -> println("Este weekend!")
        "Luni", "Marți", "Miercuri", "Joi", "Vineri" -> println("Este zi lucrătoare.")
        else -> println("Zi necunoscută.")
    }
}
