fun main(){

    var name ="Aaditya"

    println(name)

    //When using var, you can change the value whenever you want

    name = "Robert"

    println(name)

    var age: Int = 10

    var can_Vote: Boolean = false

    var last_name: String = "Mittal"

    println(age)

    println(can_Vote)

    println(last_name)

    //You can also declare a variable without assigning the value, and assign the value later. However, this is only possible when you specify the type

    var course: String

    course = "CSE224 Android Development"

    println(course)

    /*
    val name = "John"
    name = "Robert"  // Error (Val cannot be reassigned)
    println(name)
    */
    
}