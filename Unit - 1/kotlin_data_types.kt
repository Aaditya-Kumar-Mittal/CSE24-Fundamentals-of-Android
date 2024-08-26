fun main(){

    //1st way of variable declaration

    val myNum_1 = 1

    val myDouble_1= 5.99

    val myBool_1 = false

    val myString_1 = "String"

    val myChar_1 = 'C'

    println(myNum_1)
    println(myDouble_1)
    println(myChar_1)
    println(myBool_1)
    println(myString_1)

    //2nd way of variable declaration

    val myNum_2: Int = 1

    val myDouble_2: Double= 5.99

    val myBool_2: Boolean= false

    val myString_2: String = "String"

    val myChar_2: Char = 'C'

    println(myNum_2)
    println(myDouble_2)
    println(myChar_2)
    println(myBool_2)
    println(myString_2)

    var myByte: Byte = 127

    println(myByte)

    var myShort: Short = 32562

    println(myShort)

    var myLong: Long = 1500000000000L

    println(myLong)

    //A whole number is an Int as long as it is up to 2147483647. If it goes beyond that, it is defined as Long

    var myFloat :Float = 5.75F

    println(myFloat)


    //Boolean variables are used for conditional testing
    val isKotlinFun: Boolean = true
    val isFishTasty: Boolean = false
    println(isKotlinFun)   // Outputs true
    println(isFishTasty)   // Outputs false

    val myGrade: Char = 'B'
    println(myGrade)

}