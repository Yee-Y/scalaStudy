package zhang.shao.scala

object Scala_Method {
  def main(args: Array[String]): Unit = {
       val user = new User("zhangsan")
       println(user)
  }
}
// Scala是完全面向函数的语言, 所以类也是函数
// 类是函数, 可以使用小括号作为函数的参数列表
class  User(s : String){
//   println("哈哈哈哈")
}
