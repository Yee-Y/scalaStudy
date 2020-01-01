package zhang.shao.scala

object string {
  def main(args: Array[String]): Unit = {
    val function: () => Unit = () => println("hello scala")
    function()

    def f() = {
      println("function")
    }
    def f0() = {
      f _
    }
     f0()()

    def f1(i : Int) ={
      def f2(j : Int) = {
          i * j
      }
      f2 _
    }
    f1(2)(3)

    println("===============================")
    // 函数柯里化
    def f3(i : Int)(j : Int) = {
        i * j
    }
    println(f3(2)(3))


    val function1: () => Unit = () => println("江西应用技术职业学院")
    function1()

    def f4(f : Int => Int) = {
       f(12) + 10
    }
    def f5(i : Int) = {
       i
    }

    println(f4(f5))

    def test() = "zhangshaojun"

    val intToUnit: Int => Int = (x:Int) => x
    println(intToUnit(23))


    val demo1: Int => Unit = (i) => {println("hello scala")}
    demo1(10)

    (a : Int)=>{println("hahaha")}







  }
}
