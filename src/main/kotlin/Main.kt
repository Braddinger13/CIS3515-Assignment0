import java.util.Scanner

fun main(args: Array<String>){

    val reader = Scanner(System.`in`)

    print("Enter Square Length: ")
    val sqLength : Double = reader.nextDouble()

    print("Enter Square Height: ")
    val sqHeight : Double = reader.nextDouble()

    val square = Square("Square1")
    square.setDimensions(sqLength, sqHeight)

    square.printDimensions()
    println(square.getArea())

    print("Enter Radius: ")
    val rad : Double = reader.nextDouble()

    val circle = Circle("Circ1")
    circle.setDimensions(rad)
    circle.printDimensions()
    println(circle.getArea())

    print("Enter Side1 Length: ")
    val side1 : Double = reader.nextDouble()
    print("Enter Side2 Length: ")
    val side2 : Double = reader.nextDouble()
    print("Enter Side3 Length: ")
    val side3 : Double = reader.nextDouble()

    val triangle = Triangle("Tri1")
    triangle.setDimensions(side1, side2, side3)
    triangle.printDimensions()
    println(triangle.getArea())

    print("Enter Side Length: ")
    val side : Double = reader.nextDouble()
    val equilatTri = EquilateralTriangle("Tri2")
    equilatTri.setDimensions(side)
    equilatTri.printDimensions()
    println(equilatTri.getArea())

}