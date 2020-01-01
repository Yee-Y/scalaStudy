package zhang.shao.scala

object 递归 {
  def main(args: Array[String]): Unit = {
      //递归

     def aa(i : Int):Int = {
      // print("阶乘")
      if (i == 1){
          1
      }else{
        i * aa(i-1)
      }
     }
    println(aa(10))

    val function = (x:Int)=>{}
     print(function)



    def sum(n1 : Int, n2 : Int): Int = {
      print("sum()执行...")
      return n1+n2
    }
    val i: Int = sum(10,20)
    print("======================")
    print("=====================")
    print(i)
    println("=======================================")


    //异常
    try {
      val i = 10
      val j = 0
      val k = i/j
    }catch {
      case ex : Exception => println("捕获了异常")
      case ex : ArithmeticException => println("捕获了除数为零的算术异常")
    }finally {
      println("")
    }







  }
}
