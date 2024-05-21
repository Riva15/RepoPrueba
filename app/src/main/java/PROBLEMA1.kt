fun round(number: Double, decimals: Int):Double {
    val factor = Math.pow(10.0, decimals.toDouble())
    return Math.round(number * factor) / factor
}

fun comision(x: Double):Double{
    var monto: Double
    var comision: Double
    if (x > 10001) {
        //comision es de 1.5%
        comision = (x * 0.015)
        monto = (x - comision)
    } else {
        if (x >= 1000) {
            //comision de 0.5%
            comision = (x * 0.005)
            monto = (x - comision)
        } else {
            //comision es de s/ 5.00
            monto = x - 5
        }
    }
    return monto
}

fun main() {
    var total: Double = 105.50
    var its: Double
    var total2: Double
    its = (total * 0.00005)
    total2 = comision(total) - its
    val resultadoFinal = round(total2, 2).toInt() // Redondear a 2 decimales y convertir a entero
    print(resultadoFinal)
}
