package zhang.shao.scala

object Hello {

  // Scala源码中包含了main方法, 在编译后自动形成了public static void main
  // scala在编译源码时,会生成两个字节码文件, 静态main方法会执行另外一个字节码文件中的成员main方法.
  // scala是完全面向对象的语言,那么没有静态的语法, 只能通过模拟生成静态方法,
  // 编译时将当前类生成一个特殊的类--> Hello$,然后创建对象那来调用这个对象的main方法。

  def main(args: Array[String]): Unit = {
    // 采用伴生对象来创建伴生类
    //println(Student)

    // val student = Student("zhangshaojun")
    println("hello scala")

    test()

    def test() = {
      println("hello java")
    }

    login()
  }
  def login() = {
    println("哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈")
  }

}