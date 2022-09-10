class Square (_name: String) : Shape(_name) {

    private var length = 0.00
    private var height = 0.00

    override fun printDimensions() {
        println("---${name}---")
        println("Length: $length, Height: $height")
    }

    fun setDimensions (_length: Double, _height: Double){
        length = _length
        height = _height
    }

    override fun getArea() : Double{
        return length*height
    }

}