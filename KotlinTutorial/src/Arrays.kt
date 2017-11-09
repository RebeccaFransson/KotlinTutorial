fun main(args: Array<String>){

    // Non specific type
    var myArray = arrayOf("hejsan", "jag är", 23, true)
    println(myArray)
    myArray[3] = false


    println("Arrays length: ${myArray.size}")
    println("hejsan is in array: ${myArray.contains("hejsan")}")
    println("First in array: ${myArray.first()}")
    println("Index of in false: ${myArray.indexOf(false)}")

    var partArray = myArray.copyOfRange(0,2)
    println("Part array: $partArray")

    // Type specific
    val array2: Array<Int> = arrayOf(1,2,3)
    println("Array with type int: $array2")

}