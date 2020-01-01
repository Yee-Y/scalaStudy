package zhang.shao.scala



package test{
  class Emp{

  }



  package test1 {
    class Worker{

    }

    package object dept{
       val test = "123"
       def test1() = {
          println("hello hadoop")
       }
    }

    object Scala_Package {
      def main(args: Array[String]): Unit = {
        println("hello scala")
        println(dept.test)
        dept.test1()
      }
    }

  }
}

class Stu{

}
