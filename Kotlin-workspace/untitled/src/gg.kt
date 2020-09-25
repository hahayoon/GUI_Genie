import java.util.*

class Main {
    companion object {
        val scanner = Scanner(System.`in`)

        @JvmStatic
        fun main(args: Array<String>) {
            input()
        }

        fun input() {

            val map = HashMap<String, Int>()

            while (true) {
                val st = StringTokenizer(scanner.nextLine())

                val command = st.nextToken()

                when (command) {
                    "set" -> {
                        val key = st.nextToken();
                        val value = st.nextToken()

                        map[key] = value.toInt()
                    }
                    "prt" -> {
                        val key = st.nextToken();

                        println(map[key])
                    }
                }
            }
        }
    }
}