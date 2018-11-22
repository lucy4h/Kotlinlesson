import io.kotlintest.shouldBe
import io.kotlintest.shouldNotBe
import io.kotlintest.specs.DescribeSpec

//Homework
//Easy. Write a function that accepts a String as its only parameter,
// and returns true if the string has only unique letters, taking letter case into account. Write tests for it.

//Tricky. Write a function that accepts two strings, and returns true if
// one string is rotation of the other, taking letter case into account. Write tests for it.
//Tip: A string rotation is when you take a string, remove some letters
// from its end, then append them to the front. For example, “swift” rotated by two characters would be “ftswi”.

class BasicsSpec3 : DescribeSpec({
    describe("Checks on Kotlin basics implementations") {
        context("unique letters") {
            val obj = GfG()
            val input = "AidosBa"
            it("comparing two strings") {
                obj.uniqueCharacters(input).equals(obj.uniqueCharacters("AidosBaiburin")) shouldBe false
            }
            it("comparing two same strings") {
                obj.uniqueCharacters(input).equals(obj.uniqueCharacters("AidosBa")) shouldNotBe false
            }
            it("comparing two  strings without camel case") {
                obj.uniqueCharacters(input).equals(obj.uniqueCharacters("Aidosba")) shouldNotBe false
            }


            if (obj.uniqueCharacters(input))
                println("The String $input has all unique characters")
            else
                println("The String $input has duplicate characters")


        }

    }
    describe ("String rotate") {
        context("ABCDE") {

            it ("") {

            }
            }
        }
    })


internal class GfG {
    fun uniqueCharacters(str: String): Boolean {
        // If at any time we encounter 2 same
        // characters, return false
        for (i in 0 until str.length)
            for (j in i + 1 until str.length)
                if (str[i] == str[j])
                    return false

        // If no duplicate characters encountered,
        // return true
        return true
    }


}


