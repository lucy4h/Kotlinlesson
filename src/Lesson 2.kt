import io.kotlintest.shouldBe
import io.kotlintest.specs.DescribeSpec

class BasicsSpec2 : DescribeSpec({
    describe("Checks on Kotlin basics implementations") {
        context("quckSort") {

            bubbleSort(numberList)

            numberList shouldBe arrayOf(1,2,3,4,5)

            numberList[0] shouldBe 1
            numberList[1] shouldBe 2

        }
    }
})

var numberList = arrayOf(1,4,5,2,3)

fun bubbleSort(numbers: Array<Int>) {
    for (pass in 0 until (numbers.size - 1)) {
        // A single pass of bubble sort
        for (currentPosition in 0 until (numbers.size - 1)) {
            // This is a single step
            if (numbers[currentPosition] > numbers[currentPosition + 1]) {
                val tmp = numbers[currentPosition]
                numbers[currentPosition] = numbers[currentPosition + 1]
                numbers[currentPosition + 1] = tmp
            }
        }
    }
}