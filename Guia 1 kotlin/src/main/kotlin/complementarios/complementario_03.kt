package complementarios

fun main(){

    var par:Int=0; var impar:Int=0; var n:Int=0

    print("¿Cuántos números desea ingresar?: ")
    n= readLine()!!.toInt()

    var numeros=IntArray(n)

    for (i in 0 until numeros.size){
        print("Ingrese el número ${i+1}: ")
        numeros[i]= readLine()!!.toInt()

        while(numeros[i]<1){
            print("Ingrese el número ${i+1}: ")
            numeros[i]= readLine()!!.toInt()
        }

        if (numeros[i] % 2 == 0){
            par= par+1
        }
        else{
            impar=impar+1
        }

    }

    println("\nCantidad de números pares: $par")
    println("\nCantidad de números impares: $impar")
}