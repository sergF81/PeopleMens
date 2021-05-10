import kotlin.math.roundToInt
import kotlin.text.lastIndex

fun main() {
    var output: String = ""
    println("________________________________________")

    while (true) {

        println("Enter the amount of Likes. If you have finished, enter N")
        var likes = readLine();
        if (likes == "N") {
            println("Application is close!")
            break
        }
        if (likes != null) {
            if (likes.get(likes.lastIndex).toString() == "1") {
                output = "user"
            } else output = "users "
        }
        println("$likes $output liked your message.")
    }
}

