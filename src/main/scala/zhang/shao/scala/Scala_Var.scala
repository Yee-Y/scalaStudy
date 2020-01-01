package zhang.shao.scala

import scala.io.StdIn

object Scala_Var {
  def main(args: Array[String]): Unit = {
    //声明变量
    //    //var name : String = "zhangsan"
    //    val name = "lisi"
    //    println(name)
    //
    //    var i : Int = 10
    //    val d = i.toDouble
    //    println(d)
    //
    //
    //    var aa : Long = 100000000000L
    //    var bb : Int = 1000000000
    //
    //    var s : String = null
    //
    //    var ss : String = "12.5"
    //    println(ss.toFloat)

    //    println("=================================")
    //    var c : Char = 'a'
    //    var i : Int = 5
    //    var d : Float = .314F
    //    var resul = c+i+//    println(result)


    //               var aa : Byte = 100
    //      var bb : long = 1000000000
    //      var cc : Int = 1000000000
    //    var aa : Float = 1.34F
    //    println(aa.toInt)

    //    val ++ : String = "123"
    //    val +-*/ : String = "1234556"
    //    println(++)
    //    println(+-*/)
    // TODO D
    //    var i = /**/1
    //    i += 1
    //    println(i)



//    var b = 10
//
//    println(b = 10)

//    if ( b ){
//       println(b)
//    }

//    val str : String = StdIn.readLine()
//    println("line = "+ str)

    var a = 10
    var b = 20
    println(s"${a}====${b}")

   /*  1. 使用中间变量来进行替换
    var c = a
    a = b
    c = a;
    println(s"${a}====${b}")
   */

    /*  方法二:
    a = a + b
    b = a - b
    a = a - b
    println(s"${a}====${b}")
    */

    // 方法三:
    a = a ^ b
    b = a ^ b
    a = a ^ b
    println(s"${a}====${b}")








  }
}
