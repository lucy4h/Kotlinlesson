import io.kotlintest.shouldBe
import io.kotlintest.specs.DescribeSpec

//Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
//Example 1:
//input: 117711
//output: true
//
//Example 2:
//input: -7887
//output: false (because from right to left the number becomes 7887-)
//
class BasicsSpec4 : DescribeSpec({
    describe("Checks on Kotlin basics implementations") {
        context("palindrome") {
               it("test") {
                   palindrome(1010) shouldBe true
                   palindrome(1) shouldBe true
               }
                }
        }

})

fun palindrome (args: Int):Boolean {
    var num = 1
    var reversedInteger = 0
    var remainder: Int
    val originalInteger: Int

    originalInteger = num

    while (num != 0) {
        remainder = num % 10
        reversedInteger = reversedInteger * 10 + remainder
        num /= 10
    }

        if (originalInteger == reversedInteger)
            return true
        else
            return false
    }
