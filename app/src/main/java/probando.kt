import kotlin.math.round

fun calcularMontoTotal(montoGiro: Double): Double {
    val itf = 0.005 / 100 // 0.005% en decimal
    val itfMonto = montoGiro * itf

    val comision = when {
        montoGiro <= 1000 -> 5.00
        montoGiro in 1001.0..10000.0 -> montoGiro * 0.005 // 0.5%
        else -> montoGiro * 0.015 // 1.5%
    }

    val montoTotal = montoGiro + itfMonto + comision
    return round(montoTotal)
}

fun main() {
    println("Ingrese el monto del giro:")
    val montoGiro = readLine()?.toDoubleOrNull()

    if (montoGiro != null) {
        val montoTotal = calcularMontoTotal(montoGiro)
        println("El monto total a pagar es: ${montoTotal.toDouble()}")
    } else {
        println("Por favor, ingrese un monto válido.")
    }
}
