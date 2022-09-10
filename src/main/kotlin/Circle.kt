class Circle (_name: String) : Shape(_name) {

    private  var radius = 0.0

    override fun printDimensions() {
        println("---${name}---")
        println("Radius: $radius")
    }

    fun setDimensions (_radius: Double){
        radius = _radius
    }

    override fun getArea() : Double{
        return radius*radius*3.14
    }
}