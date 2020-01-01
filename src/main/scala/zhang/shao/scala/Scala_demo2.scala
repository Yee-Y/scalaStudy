package zhang.shao.scala

// 伴生类
class  Person{
   var name = "张少军"
   def sayHi: Unit ={
     println("class Person...")
   }
}

// 伴生对象
object Person{
   var age = 20
   def  syaHi: Unit ={
     println("object Person...")
   }
}



object Scala_demo2 {
  def main(args: Array[String]): Unit = {
      println(Person.age)
      Person.syaHi

      val person = new Person
      person.sayHi

  }
}
