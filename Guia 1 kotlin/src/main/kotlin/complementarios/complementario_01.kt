package complementarios

fun main(){

    var num1:Int=0; var num2:Int=0

    print("Ingrese el primer número: ")
    num1= readLine()!!.toInt()

    print("Ingrese el segundo número: ")
    num2= readLine()!!.toInt()

    if(num1 % num2==0){
        println("Los números $num1 y $num2, son divisibles entre si.")
    }
    else{
        println("Los números $num1 y $num2, no son divisibles entre si.")
    }



}