package zhang.shao.scala

import zhang.shao.scala.b1.scala.zhong

package b1{
  package object ee{
    var name = "jack"
    def say = {
      println("hello scala")
    }
  }

  package scala{
    class zhong {
      def test() = {
        println(  )

      }
    }


  }


}


object 匿名函数 {
  def main(args: Array[String]): Unit = {
       import zhang.shao.scala.b1.scala
       new zhong
  }
}
