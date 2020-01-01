package zhang.shao.scala



/**
  * Scala是一个完全面向对象的语言
  */
// import 用于导入类
// import 可以在任意的地方使用
// import 可以导入一个包中的所有的类


object Scala_Import {
  def main(args: Array[String]): Unit = {
     class demo{
        val s : String = "10"
        def ha() = {
          println("hello scala")
        }
     }
    val function: () => Unit = () => {
      val demo = new demo
      println(demo.s)
      demo.ha()
    }
    function()




  }
}
