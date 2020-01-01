package zhang.shao.scala

object StringPrint {
  def main(args: Array[String]): Unit = {
    //
    //    val ints = for ( i <- 1 to 5) yield i *2
    //    println(ints)
    // 无参, 无返回值
    def test(): Unit = {
      println("test")
    }

    test();


    def test1(s: String): Unit = {
      println(s)
    }

    test1("张少军")


    def test2(s: String): String = {
      //   println(s)
      return s + "......"
    }

    val str: String = test2("hadoop")
    println(str)


    def test3(): String = {
      return "hello world"
    }

    val str1: String = test3()
    println(str1)

    // TODO scala可以采用自动推断功能来简化函数的声明.
    // 1. 如果函数声明时,明确无返回值Unit, 那么即使函数体中有return也不起作用.
    def demo(): Unit ={
       return "hello scala"
    }
    val unit: Unit = demo()
    println(unit)

    // TODO 如果将函数体的最后一行代码进行返回,那么return关键字可以省略.
    def demo1(): Any ={
        "哈哈哈"
        "111"
    }
    val value: Any = demo1()
    println(value)
//
//    def demo4(){
//        "aaa"
//        "bbb"
//    }
//    println(demo2())
//

    def demo5{
        "aaa"
         "bbbb"
    }
    println(demo5)


    def demo6  {
        "aaa"
    }
    println(demo6)

    ()->{println("hello zhangshaojun")}

  }
}
