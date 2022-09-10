import kotlin.math.sqrt

class EquilateralTriangle (_name: String) : Triangle(_name){

    private var side = 0.0

    override fun printDimensions() {
        println("---${name}---")
        println("Side: $side")
    }

    fun setDimensions (_side: Double){
        side = _side
    }

    override fun getArea() : Double{
        val s = (side + side + side) / 2
        return sqrt(s*(s-side)*(s-side)*(s-side))
    }
}