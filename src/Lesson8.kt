import io.kotlintest.shouldBe
import io.kotlintest.specs.DescribeSpec

class BasicsSpec5 : DescribeSpec({
    describe("Checks on Kotlin basics implementations") {
        context("swap two variables") {
            it("test") {
                ttt(1,2) shouldBe 4
            }
        }
    }

})



fun ttt(a: Int, b: Int) {

}





