fun main(args: Array<String>){
    // val = does not change
    val myName = "Rebecca"
    val longString = """This is a
        veeeery long string that can
        be placed on multiple rows"""
    println("longString : $longString")

    // var can mutate
    //var fName: String = "Becca"
    var fName: String
    var lName: String = "Fransson"

    fName = myName
     var fullName = fName + " " + lName
    println("Name : $fullName")

    println("fullName length is : ${fullName.length}")
    println("Third index in fullName : ${fullName[2]}")
    println("myName is in the fullName : ${fullName.contains(myName)}")
}