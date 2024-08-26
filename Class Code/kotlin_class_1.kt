
// keyword for funcion is fun

fun main(){
    
    //2 ways to declare vaiable in Kotlin - var 
    
    var a = 10 ; //semicolon is optional in Kotlin
    
    println(a); // after printing new line character is printed
    
    print(a); //no new line is printed after the code
    
	  //     b = 50; // Gives error Unresolved reference 'b'.
    
    println(50);
    
	  //     var b  // Gives error explicit type or be intialized
    
    var b : Int = 20; // Every data type is in the form of class
    
    // var name : type = value
    
    //variables in Kotlin are either mutable(var) or immutable(val)
    
    var c = 30;
    
    c = 40;
    
    println(c);
    
    /*
    val e = 30; //values never change
    
    e = 50;
    
    println(e); // Gives error 'val' cannot be reassigned.
    
    */
   
}