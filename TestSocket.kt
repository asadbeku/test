import java.net.Socket
import java.util.*

fun main() {
    val socket = Socket("82.97.243.55",4545)

    val scanner= Scanner(socket.getInputStream())

    while (scanner.hasNextLine()){
        val a = scanner.nextLine()
        println(a)
        break
    }

}