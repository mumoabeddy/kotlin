class safaristudents(val jina:String,val miaka:Int,val jinsia:String){

}

fun main() {
    val myobj=safaristudents("Abeddy",19,"Male")
    println("My name is ${myobj.jina}")
    println("Am ${myobj.miaka} years old")
    println("I am a ${myobj.jinsia}")

    val myob=safaristudents("Happy",10,"Female")
    println("My name is ${myob.jina}")
    println("Am ${myob.miaka} years old")
    println("I am a ${myob.jinsia}")

}