package zhang.shao.scala

object Scala_def {
  def main(args: Array[String]): Unit = {
    // 函数式编程--扩展
    // 可变参数
//    def test(s : String*)= {
//      println(s)
//    }
//
//    test("hello", "scala", "张", "少")
//    test()
//
//    // TODO 默认参数
//    // 如果希望函数
//    def test1(name : String, age : Int = 20) = {
//      println(s"${name}----${age}")
//    }
//    test1("zhangshao", 100)


    def test(s : String, age : Int = 20)= {
        println(s"${s}--${age}")
    }
    test("hello scala")

    def test1(s : String, age : Int = 20) = {
      println(s"${s}----${age}")
    }
    test1("hello scala", 1000)
  }
}
