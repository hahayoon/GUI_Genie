import java.util.*

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var scanner = Scanner(System.`in`)
            var obj = Object()

            for (item in 0..4) {
                println("숫자 1 입력하세요 ")
                var num1 = scanner.nextInt()

                println("숫자 2 입력하세요 ")
                var num2 = scanner.nextInt()

                println("연산자를 선택하세요. ")
                println(" 1.[+]  2.[-]  3.[*]  4.[/]  5.[%] ")


                var operation = scanner.nextInt()
                var oper: Char

                when (operation) {
                    1 -> {
                        oper = '+'
                    }
                    2 -> {
                        oper = '-'
                    }
                    3 -> {
                        oper = '*'
                    }
                    4 -> {
                        oper = '/'
                    }
                    else -> {
                        oper = '%'
                    }
                }


                calc2(num1, num2, oper)
            }
        }


        fun calc(num1: Int, num2: Int, oper: Char): Int {

            var result = if (oper == '+') {
                num1 + num2
            } else {
                num1 - num2
            }

            return result
        }


        fun calc2(num1: Int, num2: Int, oper: Char) {
            var result = when (oper) {
                '+' -> num1 + num2
                '-' -> num1 - num2
                '*' -> num1 * num2
                '/' -> num1 / num2
                '%' -> num1 % num2
                else -> -1
            }

            println("[결과는  $result  입니다.")
        }
    }
}
