package complementarios

fun main(){

    var n:Int=0;
    var cuadrante_01=0; var cuadrante_02=0; var cuadrante_03=0; var cuadrante_04=0

    print("¿Cuántos puntos desea ingresar?: ")
    n= readLine()!!.toInt()

    var x= DoubleArray(n); var y= DoubleArray(n)

    for (i in 0 until x.size){

        print("Ingrese punto ${i+1} en x: ")
        x[i]= readLine()!!.toDouble()
        print("Ingrese punto ${i+1} en y: ")
        y[i]= readLine()!!.toDouble()

        if(x[i] > 0 && y[i] > 0){
            cuadrante_01= cuadrante_01 +1
        }
        else if (x[i] < 0 && y[i] > 0){
            cuadrante_02= cuadrante_02 +1
        }
        else if (x[i] < 0 && y[i] < 0){
            cuadrante_03= cuadrante_03 +1
        }
        else if (x[i] > 0 && y[i] < 0){
            cuadrante_04= cuadrante_04 +1
        }

    }

    println("Puntos en el primer cuadrante: $cuadrante_01")
    println("Puntos en el segundo cuadrante: $cuadrante_02")
    println("Puntos en el tercer cuadrante: $cuadrante_03")
    println("Puntos en el cuarto cuadrante: $cuadrante_04")
}