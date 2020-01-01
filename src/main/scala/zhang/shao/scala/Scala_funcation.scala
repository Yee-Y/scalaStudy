package zhang.shao.scala

object Scala_funcation {
  def main(args: Array[String]): Unit = {
       // 函数式编程-- 难点.
     // TODO Scala是完全面向函数式编程语言
    // TODO Scala是完全面向对象的语言.
    // 函数在Scala中可以做任何的事情. 比如函数可以赋值给变量, 函数可以作为函数的参数.函数可以作为函数的返回值.

    /* def f() = {
         println("hello scala")
     }
     def f0() = {
        // 返回函数
       // 直接返回函数, 有问题, 需要增加特殊符号：下划线
        f _
     }
    val function: () => Unit = f0()*/

    // 简化方式
    // TODO 闭包
    // 一个函数在实现逻辑时,将外部的变量引入到函数的内容, 改变了这个变量的生命周期, 称之为闭包.
    def f1(i : Int) = {

       def f2(j : Int) = {
          i * j
       }
       f2 _
    }

    val i: Int = f1(2)(3)
    println(i)


    // TODO 函数柯里化
    def f2(i : Int)(j : Int) = {
        i * j
    }
    f2(2)(3)














  }
}
