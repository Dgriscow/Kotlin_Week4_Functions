fun calculateSquareArea(){
    //get one of the sides and calculate the area
    println("What is the Length of One Side?")
    var sideInput = readln().toDouble()

    var area = sideInput * sideInput
    println("The Total Area of the Square is: $area")

}

fun calculateTriangleArea(){
    //get each side first as a seperate variable
    println("What is the length of the base?")
    var base = readln().toDouble()

    println("What is the height of the triangle?")
    var height = readln().toDouble()

    //calculate the area of the triangle
    var area = base * height
    area = area * 0.5

    println("The Area of the Triangle is: $area")

}
 fun calculateParallelogram(){
     println("What is the Length The Base?")
     val base = readln().toDouble()

     println("What is the Height?")
     val height = readln().toDouble()

     val area = base * height
     println("The Total Area of the Parallelogram is: $area")

 }

fun calculateRectangle(){
    println("What is the Length The Base?")
    val base = readln().toDouble()

    println("What is the Height Of the Rectangle?")
    val height = readln().toDouble()

    val area = base * height
    println("The Total Area of the Rectangle is: $area")

}

fun main() {
    println("What Shape Area would you Like To Calculate?\n" +
            "1: Square\n2: Triangle\n3: Parallelogram\n4: Rectangle\n" +
            "Type A Number to Choose Your Calculator")


    var userChoice = readln().toInt()

    when (userChoice){
        1 ->calculateSquareArea()
        2 ->calculateTriangleArea()
        3->calculateParallelogram()
        4->calculateRectangle()


    }



}