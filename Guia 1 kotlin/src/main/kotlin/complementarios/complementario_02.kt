package complementarios

fun main(){

    var mayor=0
    var menor=0
    var alumnos=DoubleArray(10)

    for (i in 0 until alumnos.size){
        print("Ingrese la nota del alumno ${i+1}: ")
        alumnos[i]= readLine()!!.toDouble()

        while(alumnos[i]<0 || alumnos[i]>10){
            print("Ingrese la nota del alumno ${i+1}: ")
            alumnos[i]= readLine()!!.toDouble()
        }

        if (alumnos[i] >= 7){
             mayor=mayor+1
        }
        else if(alumnos[i] < 7){
            menor=menor+1
        }
    }

    println("\nAlumnos con notas iguales o mayores a 7: $mayor")
    println("\nAlumnos con notas menores a 7: $menor")

}