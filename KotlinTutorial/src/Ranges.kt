fun main(args: Array<String>){
    val oneTo10: IntRange = 1..10 // 1.rangeTo(10)
    val alphabet = "A".."Z"
    println(oneTo10)
    println(alphabet)

    // Search for letter in alphabet
    println("R in alphabet?: ${"R" in alphabet}")

    val tenTo1 = 10.downTo(1)
    println(tenTo1)

    //Reverse a range
    println("reversed:")
    for(x in tenTo1.reversed()) print(" $x")
}