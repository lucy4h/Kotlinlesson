import io.kotlintest.shouldBe
import io.kotlintest.shouldNotBe
import io.kotlintest.specs.DescribeSpec

class EngineerTest : DescribeSpec({
    describe("Checks on Kotlin basics implementations") {
        context("Engineer") {
            val qa=QA("QA tester","QA")
            var currentTask : ArrayList<String> = ArrayList()
            qa.work(2, currentTask)
            qa.work(4, currentTask)

            releaseTesting(3) shouldBe true
            releaseTesting(4) shouldNotBe false

            val dev = Developer("Developer", "Develop")
            dev.work(3, currentTask)
            dev.work(5, currentTask)

            releaseTesting(4) shouldBe true
            releaseTesting(2) shouldBe false



        }
    }
})

abstract class Engineer (val name: String, val department:String) {

    abstract fun work(capacity : Int, currentTask : ArrayList<String>)

}
class Developer (name: String, department:String): Engineer(name, department){
    override fun work(capacity: Int, currentTask: ArrayList<String>) {
        for (n in 0..capacity) {
            currentTask.add("Task$n")
        }
    }
}
class QA(name: String, department: String):Engineer(name, department) {
    override fun work(capacity: Int, currentTask: ArrayList<String>) {
        for(n in capacity..0) {
            currentTask.removeAt(n)
        }
    }
}

fun releaseTesting(day: Int):Boolean{

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