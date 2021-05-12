import kotlin.math.roundToInt
import kotlin.text.lastIndex

fun main() {
    var output: String = ""
    println("________________________________________")

    while (true) {

        println("Enter the amount of Likes. If you have finished, enter -1")
        val likes = Integer.parseInt(readLine())

        if (likes == -1) {
            println("Application is close!")
            break
        }
        if (likes == 1 || likes % 10 == 1 && likes != 11) {
            output = "user"
        } else output = "users "
        println("$likes $output liked your message.")
    }

}


