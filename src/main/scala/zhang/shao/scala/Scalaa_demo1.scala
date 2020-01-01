package zhang.shao.scala

object Scalaa_demo1 {
//  def main(args: Array[String]): Unit = {
//    //非静态成员
//    val w1 = Worker()
//    w1.show()
//    Worker.haha()
//    Worker.apply()
//
//    //静态成员
//    //println(Worker.x)
//
//  }

 // Worker.haha()

}

class Worker{
  var name : String = "张少军"

  def show() = {
    println("hello scala")
  }

  def aa = "printn"
}
object Worker{
  var x = 110

  def apply(): Worker = new Worker()

  def haha() = {
    println("哈哈哈哈")

    var zhangshaojun = "张少军"

    println(Worker.x)
    def test() = {
      println("hello world")
    }
  }
}
