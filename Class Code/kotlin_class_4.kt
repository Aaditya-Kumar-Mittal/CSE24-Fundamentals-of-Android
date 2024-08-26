// keyword for funcion is fun

//Class - 4 August 21st, 2024

fun main(){
    
    //when statement in Kotlin
    
    var number = 3
    
    var remainder = number % 2
    val typeOfNumber = when(remainder){
        0 -> println("Even")
       	1 -> println("Odd")
        else -> println("Invalid Number")
    }
    
    //Using when here as statement
    when{
        number%2 == 0 -> println("Even")
        number%2 == 1 -> println("Odd")
        else -> println("Invalid Number")
    }
    
    //Expression returns some value.
    //Statement does not return some value.
}

/*
 * Code - 1
 * val x: Int = 100
    val y: Long = x
    println(x)
 * Error 
 * 
Unresolved reference 'int'.
Unresolved reference 'long'.
Overload resolution ambiguity between candidates: @InlineOnly() fun println(message: Any?): Unit @InlineOnly() fun println(message: Boolean): Unit @InlineOnly() fun println(message: Byte): Unit @InlineOnly() fun println(message: Char): Unit @InlineOnly() fun println(message: CharArray): Unit @InlineOnly() fun println(message: Double): Unit @InlineOnly() fun println(message: Float): Unit @InlineOnly() fun println(message: Int): Unit @InlineOnly() fun println(message: Long): Unit @InlineOnly() fun println(message: Short): Unit
*/

/*
 * Code - 2
 * val x: Int = 100
   val y: Long = x.toLong()
   println(x)
 * Works
*/

/*
 * Code - 3
 * val x: String = "Hello"
    val y:Int = x.toInt();
    println(y)
    
 * Exception in thread "main" java.lang.NumberFormatException: For input string: "Hello"
 at java.lang.NumberFormatException.forInputString (:-1) 
 at java.lang.Integer.parseInt (:-1) 
 at java.lang.Integer.parseInt (:-1)
 */
 
 /* A question mark while type casting then it compiles and instead of error it gives null and no output is generated and this is called safe and unsafe casting*/
 
 /* Code - 4
  * 
  * val a: String = "Hi";
    
    val b: Int = a as Int;
    
    println(b)
    
  * Generates Exception
 */
 
 /* Code - 5
  * val a: String = "Hi";
    
    val b: Int? = a as? Int;
    
    println(b)
 */
 
 /* Code - 6 (Works)
  * 
  * fun main(){
    
    val a: String = "100";
    
    val b: Int = a.toInt();
    
    println(b) }
    
 */
 
 /* Code - 7 (Works)
  * val a: String = "100";
    
    val b: Int? = a as? Int;
    
    if(b == null) println("It is not null. Type-cast unsuccessful.");
    else println("It is not null. Type-cast successful.");
    
    println(b)
 */
 
 /* Code - 8
  * var amountPurchase: Int  = 3000;
    
    var membership: Boolean = false;
    
    if(amountPurchase >= 1000){
        if(membership){
            println(amountPurchase - 0.20*amountPurchase);
        }
        else{
            println(amountPurchase - 0.10*amountPurchase);
        }
    }
    else{
        println("No discount given.");
        println("Amount is $amountPurchase");
    }
  */
 
 /*
 fun main(){
    
    //when statement in Kotlin
    
    var dayOfWeek = 3
    
    val dayName = when(dayOfWeek){
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid Day"
    }
    
    println("Day fo he week is : $dayName")
    
    //Expression returns some value.
    //Statement does not return some value.
}
*/

/*
fun main(){
    
    //when statement in Kotlin
    
    var number = 30
    
    var remainder = number % 2
    val typeOfNumber = when(remainder){
        0 -> println("Even")
       	1 -> println("Odd")
        else -> println("Invalid Number")
    }
    
    //Expression returns some value.
    //Statement does not return some value.
}
*/