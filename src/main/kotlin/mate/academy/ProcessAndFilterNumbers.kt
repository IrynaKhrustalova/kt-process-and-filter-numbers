package mate.academy

const val ZERO = 0
const val TWO = 2
const val TWENTYFIVE = 25

fun processAndFilterNumbers(numbers: List<Int>): List<Int> {
    val result = mutableListOf<Int>()
    numbers.forEach {
        if (it % TWO == ZERO) {
            result.add(it / TWO)
        } else {
            result.add(it * TWO)
        }
    }
    return result.filter { it > TWENTYFIVE }.toList()
}
