fun main() {
    var mychar='a'
    when(mychar){
//        in 0..9-> println("Single digit number")
        'a'-> println("a is a vowel")
        'e'-> println("e is a vowel")
        'i'-> println("i is a vowel")
        'o'-> println("o is a vowel")
        'u'-> println("u is a vowel")
        else-> println("$mychar is consonant")
    }
}