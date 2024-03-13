//Positive or Negative: Write a Kotlin function that takes an integer as a parameter and prints "Positive" if the number is greater than 0, "Negative" if it's less than 0, and "Zero" if it's equal to 0.
//}
fun main(){
greater(10)
    argument(argument(12))
    println(sum(66,88,99))
    if (isLeapYear(2015))
    {
        println("true")
    }
    else
    {
        println("false")
    }
    println(score(66))
}

fun greater(a:Int){

    var num = 2
    if (10>0){
        println("positive") }
    else{
        println("negative")
    }
}
//Even or Odd: Create a Kotlin function that accepts an integer as an argument and returns true if the number is even and false if it's odd. Print the result.
fun argument(a:Int):Int{
    var num1=4
    if(1==3){
        println("even")
    }
    else{
        println("odd")
    }
return num1
}
//Maximum of Three Numbers: Write a Kotlin function that takes three numbers as parameters and returns the maximum of the three. Print the result.
fun sum(num1:Int,num2: Int,num3: Int):Int{
    var add=num1 + num2 + num3
    return add

}

//Leap Year: Create a Kotlin function that takes a year as a parameter and returns true if it's a leap year and false otherwise. Print the result.
fun isLeapYear(year: Int): Boolean {
    return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)
}




//Grade Calculation: Write a Kotlin function that takes a student's score as a parameter and returns the corresponding grade based on the following criteria:
//90 or above: "A"
//80-89: "B"
//70-79: "C"
//60-69: "D"
//Below 60: "F" Print the grade.
fun score(num1:Int):Int {

    var student = 100
    if (90 == 100)
        println("A")
    if
            (80 <= 100)
        println("B")

    if (70 <= 100)
        println("C")
    if (60 <= 100)
        println("D")

    return student
}


