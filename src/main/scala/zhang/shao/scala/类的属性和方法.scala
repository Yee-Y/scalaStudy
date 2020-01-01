package zhang.shao.scala


/**
  * 类的方法
  * 所谓的方法, 其实就是类中声明的函数,所以声明方式和函数是一样的.
  */

object aa {
  // 类的属性
  def main(args: Array[String]): Unit = {
       val value = new User
       val str: String = value.+("流弊")
       println(str)
  }
}

class User01{
  def login() = {
     println("登录")
  }
// 函数
  def lfogout = {
     println("退出")
  }
 // 函数
  def logout1 = true
}