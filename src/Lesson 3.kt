import io.kotlintest.shouldBe
import io.kotlintest.shouldNotBe
import io.kotlintest.specs.DescribeSpec

open class Engineer1 (val name: String, val department:String)

class QA1(name: String, department: String):Engineer1(name, department) {
    class EngineerTest : DescribeSpec({
        describe("Checks on Kotlin basics implementations") {
            context("Engineer") {

                releaseTesting(1) shouldBe false
                releaseTesting(5) shouldBe true
                releaseTesting(7) shouldNotBe false
            }
        }
    })
}

fun releaseTesting1(day: Int):Boolean{

    var release = ArrayList<String>()
    release.add("registration")
    release.add("redesign")
    release.add("addButton")
    release.add("test design")
    release.add("authorization")

    var task_count=release.size
    var day_task:Int
    if ((task_count % 2)==0){

        day_task = task_count/2
    }else{

        day_task=task_count/2+1
    }

    if(day>=day_task){
        println("Успеваем")
        return true}
    else if (day<day_task){
        println("Не успеваем")
        return false}

    return true
}