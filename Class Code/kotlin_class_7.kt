
/*
class Class_name{

//Function inside the class
fun area(){}

}

fun main(){

//creating object of the class
var a = xyz()

//calling class function

a.area()
}
//Primary Constructor - 1
class xyz(var a:String="Hello"){}


 */


//Program for Primary Constructor.
class Person(var name:String, var age:Int){

    /*
    * When primary constructor in secondary constructor, error of conflicting overloads occurred.
    * Primary Constructor is the base of all the constructors
    * Secondary constructor just accepts the value and send it to primary constructor
    * If primary constructor is present, then sec just accepts and sends to primary. Hence, the error : primary constructor call is expected.
    * Primary constructor -> Doesn't mean default, it is automatically called, offers less flexibility.
    * */

    //Value giving inside the block may work and may not work
    constructor(x:String):this(){
        this.name =x
        this.age =0
    }

    //Default value given to this would always work.
    constructor():this("Rahul",50)

    fun intro(){
        println("My name is $name and age is $age")
    }

}

//First line of the class is called class header
class BasicClass{

    fun introduction(){
        println("My name is Aaditya Mittal")
    }
}

class Introduction{

    var name: String
    var age: Int

    /*
    * Constructor are used initialize the variables.
    * Secondary constructor is an additional way to create an object.
    * All are secondary constructors.
    * */

    constructor( name: String, age: Int){
        //Initialize the variables
        this.name = name
        this.age = age
    }

    constructor(name:String){
        this.name = name
        this.age = 0 //Set to default age
    }

    constructor(){
        this.name= "Default Name"
        this.age = 0
    }

    fun printIntro(){
        //Using String Interpolation for Custom Output
        println("The intro is: Name: $name and Age: $age")
    }
}

fun main(){

    var myName = BasicClass()

    myName.introduction()

    var myName2 =Introduction()

    myName2.printIntro()

    var myName3 =Introduction("Madhav")

    myName3.printIntro()

    var myName4 =Introduction("Krishna",25)

    myName4.printIntro()

    //By taking input from the user using readln().

    var inputName = readln()

    var inputAge = readln().toInt()

    println("$inputAge and $inputName")

    var myName5 = Introduction(inputName, inputAge)

    myName5.printIntro()

    //Object of Primary Constructor

    var person1 = Person()

    person1.intro()

    //Passing parameters
    var person2 = Person("Diwan")

    person2.intro()
}

//Constructor are used initialize the variables.
//It can be defined before the actual body of the class starts, all the arguments are needed to be supplied, some may have default and some may not, and it would not be offered in the primary constructor.
//Primary constructor can only be one, but secondary constructor can be many
