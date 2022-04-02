fun main(){
 /*   var name = "Tom"
    if (name=="tom")
        println("Hello Tom")
    else
      //  println("Who are you?")
    number(12)
    hasVisited("Rwanda")
    saySomething("Thomas")
    saySomething("Frida")

 println(privacy("Romezumeni"))
  println(privacy("mercykirigo"))
   println(privacy("eat"))
    println(privacy("undiscombobulation"))
   println(privacy("password"))
    hasVacated("Kenyan")
    hasVacated("Santorini")
    var languages = arrayOf("Kiswahili", "English", "NYarwands")
    for(lang in languages)
        println(lang)
    for(n in 23..64){
        println(n)
    }
for(x in 1..10)
    if(x%2!==0){
        println(x*x)
    }*/
    for(y in 1..1000)
        if(y%6 == 0 && y%8 ==0){
            println("Bingo")
        }
    else if (y%6 == 0 || y%8 ==0){
        println(y)
        }






}
fun number(x:Int){
    if(x%2==0){
        println("That is an even number")
    }
    else{
        println("That is an odd number")
    }
}
fun hasVisited(nationality: String){
    if(nationality.equals("Tanzania")){
        println("Have you been to Dodoma")}
    else if(nationality.equals("Kenya")){
        println("Have you been to Nairobi")
    }
    else if(nationality.equals("Rwanda")){
        println("Have you been to KIgali")
    }
    else if(nationality.equals("Burundi")){
        println("Have you been to Kigali")
    }
}
fun saySomething(friend: String){
    if(friend.equals("Thomas")){
        println("Collect your books")
    }
   else if(friend.equals("Timothy")){
        println("I went to the zoo")
    }
    else{
        println("Hello $friend")
    }
}
fun privacy(password: String): Boolean{
    if(password.length>=8 && password.length<=16 && !password.equals("password")){
        return true
    }
    return false
}
fun hasVacated(nation: String){
    when(nation){
        "Kenyan" -> println("Have you ever been to Nairobi")
        "Tanzanian" -> println("Have you ever been to Dodoma")
        "Ugandan" -> println("Have you ever been to Kampala")
        "Rwandese" -> println("Have you ever been to KIgali")
        else -> println("Have you ever been to E.A")
    }
}
