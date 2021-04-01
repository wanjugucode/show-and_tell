import java.util.*

//import java.util.*
//
fun main() {
    val firstName="Anastasia"
    var weight=58
  var myVariable:Boolean=true
 //I am a comment

//Concatenation
    var s1="call me"
    var s2="maybe"
    var combine=s1+s2
    println(combine)

//operators
  var num1=15
var num2=8
var result=num1+num2
  println(result)

  //Strings
  var myString="KOTLIN"
    println(myString[0])
    println(myString[1])
    println(myString.isEmpty())
    println(myString.length)
    println(myString.substring(2,4))// extarct a part of a String
    println("This is my $myString String")

//conditions
    var score =5
 if(score>=10){
    println("Pass!")
}
  else{
      println("Fail!")
 }
 var names= listOf("Iman","Hamdi","Grace")
println(names[2])
}
fun myFunction(name:String){
     println("Hello $name")}                          //String interpolation
//fun school(student:String,teacher:String,plates:Int):String{
//    var school= arrayOf(student,teacher,plates)
//    return (Arrays.toString(school))
//}
//}
//fun main(){
// var myFunction("Karobia")
//var names=school("Jane","Joel",2)
//    println(names)
//}