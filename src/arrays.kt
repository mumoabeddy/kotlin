fun main(args: Array<String>) {
    var myarr= arrayOf("Abeddy","joy",true,4,'e')

    myarr[0]="Abeddy"
    println("My name is ${myarr[0]}")
    var myintarr= arrayOf<Int>(32,52,45,-1,0)
    println(myintarr.sorted())

    var myvalues= arrayOf(32,43,5,68,10,1,9)
    println(myvalues.sorted())
}