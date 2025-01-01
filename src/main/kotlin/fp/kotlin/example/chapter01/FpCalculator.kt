package fp.kotlin.example.chapter01

fun main() {
    val fpCalculator = FpCalculator()
    val plus: (Int, Int) -> Int = { n1: Int, n2: Int -> n1 + n2 }
    val minus: (Int, Int) -> Int = { n1: Int, n2: Int -> n1 - n2 }

    println(fpCalculator.calculate(plus, 3, 1))    // 4
    println(fpCalculator.calculate(minus, 3, 1))    // 2
}

class FpCalculator {
    fun calculate(calculator: (Int, Int) -> Int, num1: Int, num2: Int): Int {
        if (num1 > num2 && num2 != 0) {
            return calculator(num1, num2)
        } else {
            throw IllegalArgumentException()
        }
    }
}