package zhang.shao.scala

import zhang.shao.scala.b1.scala.zhong
import zhang.shao.scala.test.test1.Worker

/**
  *  Scala是一个完全面向对象的语言
  */
object Scala_ObjectDemo {
  def main(args: Array[String]): Unit = {
       // 创建类的对象
       val user : User = new User()
       //调用对象的属性或者方法
//        user.age = 100
        user.username = "王五"
//       println(user.age)
       println(user.username)
       println()
      // test
    new zhong
  }
}

//声明类
class User{

    var aa = null
     // 类的主体内容 ==> 类体

    // 声明属性
    // Scala中给类声明属性, 默认为私有的, 但是底层提供了公共的setter和getter方法.
    var username : String = _

    // 如果给属性增加private修饰符, 那么属性无法在外部访问, 因为底层生成的setter和getter方法都是私有的
    private var age : Int = _

    // 如果声明的属性使用val, 那么属性是私有的. 并且使用final修饰, 底层只提供getter方法, 而没有提供setter方法.
    val email : String = ""
//
//    var age : Int = _
//
//    def login() = {
//      true
//    }
}