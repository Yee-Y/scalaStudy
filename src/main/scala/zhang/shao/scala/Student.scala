package zhang.shao.scala

import java.beans.BeanProperty

class Student {
  private val sname = "李四"

  def test(): Unit = {
    println("hello scala")
  }

  @BeanProperty var address: String = _
}

/**
  * 伴生对象
  * 伴生对象可以访问伴生类的私有属性
  * 创建伴生对象, 需要提供特殊的方法,实现相应的功能.
  */
object Student {
  def test() = {
    new Student().sname
  }

  var aa = "String"



  def apply(s: String) = new Student()

  def main(args: Array[String]): Unit = {
    Student.test()
    println(aa)
  }
  @BeanProperty var name : String = "李磊"
}

object demo {
  def main(args: Array[String]): Unit = {
    val student = Student("zhangshaojun")
    student.test()
    println(Student.name)
  }
}