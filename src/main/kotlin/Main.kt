fun main() {
   /*
   val favoriteActor = null
   println(favoriteActor) = null
    */
    /*
    var favoriteActor: String? = "Hola desde Yesith "
    println(favoriteActor)

    favoriteActor = null
    println(favoriteActor)
    = Hola desde Yesith
      null
     */
    /*
        var number: Int? = 10
    println(number)

    number = null
    println(number)
    = 10
    null
     */
    /*
    var favoriteActor: String? = "Sandra Oh"
    println(favoriteActor.length)
    =Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?
    */
    /*
    var favoriteA: String? = "Hola desde Yesith"
    println(favoriteA?.length)
    var favoriteB: String? = null
    println(favoriteB?.length)
    = 17
      null
     */
    /*
    var favoriteActor: String? = null
    println(favoriteActor!!.length)
    =   Exception in thread "main" java.lang.NullPointerException
	    at MainKt.main(Main.kt:39)
	    at MainKt.main(Main.kt)
     */
    /*
    var favoriteActor: String? = "Yesith Jimenez CODELAB 3"

    if (favoriteActor != null) {
        println("The number of characters in your favorite actor's name is ${favoriteActor.length}.")
    }
    = The number of characters in your favorite actor's name is 24.
     */
    /*
    var favoriteA: String? = null

    if(favoriteA != null) {
        println("The number of characters in your favorite actor's name is ${favoriteA.length}.")
    } else {
        println("You didn't input a name.")
    }
    var favoriteB: String? = "Hola desde contador de letras de una Frase Aleatoria"

    if (favoriteB != null) {
        println("The number of characters in your favorite actor's name is ${favoriteB.length}.")
    } else {
        println("You didn't input a name.")
    }
    = You didn't input a name.
      The number of characters in your favorite actor's name is 52.
     */
    /*
    val favoriteA: String? = "Contador de letras  --Cuenta los espacios--"

    val lengthOfName = if(favoriteA != null) {
        favoriteA.length
    } else {
        0
    }


    println("The number of characters in your favorite actor's name is $lengthOfName.")
        = The number of characters in your favorite actor's name is 43.
     */
    /*
    val favoriteActor: String? = "Contador de letras mas extenso para mayor numero de letras dentro de conteo"

    val lengthOfName = favoriteActor?.length ?: 0

    println("The number of characters in your favorite actor's name is $lengthOfName.")
    = The number of characters in your favorite actor's name is 75.
    */

}