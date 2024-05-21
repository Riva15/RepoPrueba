fun suma(a:Int, b:Int):Int
{
    return a+b
}
fun factorial(n: Int):Int
{
    var result: Int = 1
    for (i in 2..n) {
        result *= i
    }
    return result
}

fun mayor(n:Int)
{
    if(n>=18){
        print("Eres mayor de edad")
    }
    else{
        print("Eres menor de edad")
    }
}
fun main(){
    val numero1: Int = 5
    //print(factorial(numero1))
    mayor(numero1)
}
