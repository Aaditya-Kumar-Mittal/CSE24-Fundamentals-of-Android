//Progam with 2 variables to print sum

var d = 50 // Created a global variable

fun xyz(){
    
    var d = 50;
    
    println(d)
}

fun main() {
    
    /*
    
    var a = 10
    
    var b = 20
    
    println("Sum of "+a+" and "+b+" is "+(a+b))
    
    println("Sum of $a and $b is ${a+b}")
    
    //Using back ticks in Kotlin
    
    var `try` = 50
    
    println(`try`)
    
    */
    
    xyz()
    
		println(d)

		// 	By default, the scope of the variable is local
		
		//  var e : Int = 166464654646465486465464 //Value out of range.
		
		// 	By default, the scope of the variable is local
    
		//  var e : Int = 166464654646465486465464 //Value out of range.
    
    println('$')
    
		// Types of Strings - Single Line String, Multi Line String and Escaped String (contains Escaped Sequences), Raw String( as it is displayed if written in triple quotes)
    
    var multiLine = "Indian\n\Institute\n\t\of Technology, Delhi"
    
    println(multiLine)
    
    var multiLineRaw=
    """Aaditya
			    Kumar
				    Mittal
    """
    println(multiLineRaw)
	
}