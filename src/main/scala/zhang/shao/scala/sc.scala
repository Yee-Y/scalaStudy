package zhang.shao.scala

object sc {
  def main(args: Array[String]): Unit = {
    // 函数柯里化
//    def f1(i : Int)(j : Int) = {
//       i * j
//    }
//
//    println(f1(2)(3))
//      使用匿名函数来改善代码
//      def f1(f : ()=>Unit ) = {
//          f()
//      }
//      f1(()=>{println("hello scala")})
//
//
//    val function: Int => Unit = (i : Int) => println(i)
//    function(1)
//
//    val function1: () => Unit = () => println("hello scala")
//    function1()
//
//    val haha : () => Unit = () => println("hello zhangshaojun");println("hello world")
//    println(haha())
//
//    ()->{println("hello scala")
//         ;println("hello world"); println("哈哈哈")}
//    ()->println("hello zhangshaojun")
//
//    ()=>println("hello scala")
//
//
//      def  f1(f : () => Unit)  = {
//          f()
//      }
//      f1(()=>println("hello scala"))
//
//
//     def f2(f : (Int)=>Unit) : Unit = {
//         f(100)
//     }
//    f2((x : Int)=>println(x))
//
//
//      def f3(f : (Int, Int) => Unit, x : Int) : Unit = {
//          f(2,x)
//      }
//      val unit: Unit = f3((x : Int, y : Int)=>println(x+y), 10)


     //()->println("hello scala")

   //  (x)->println()

   //  (x : Int)->println(x)
//      val function: () => Unit = () => {println("hello scala")}
//      function()
//



//    var inc = (s:String) => s+1
//    println(inc("张少军"))
//
//
//    val function: () => Unit = () => println("hello scala")
//    println(function())

    //val function: () => Unit = () => println("abcde")
    //function()


    val function: () => Unit = () => println("hello scala")
    function()

    def  aa=println("hello hadoop")

    val unit: Unit = aa

    def bb = ()=>println("hello world")
    bb()

    def cc = {
      ()=>println("zhangshaojun")
    }
    val shaojun = cc()

   def demo() = ()=>{println("jiangxiyingyongjishuzhiyexueyuan")
                              "String"}

   val str = demo
    println(str)

   // val function: () => Unit = () => println("hello scala")


  }
}
