open class mzazi{
    var dad="He likes watching football"
    var mum="she likes cooking"
}
class girl:mzazi(){
    fun  cooking(){
        println(mum)
    }

}
class boy:mzazi() {
    fun football(){
        println(dad)
    }
}

fun main() {
    var obj1=girl()
    obj1.cooking()
    var obj2=boy()
    obj2.football()
}