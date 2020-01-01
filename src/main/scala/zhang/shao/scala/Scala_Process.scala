package zhang.shao.scala

object Scala_Process {
  def main(args: Array[String]): Unit = {
       // 流程控制
//      var flg = true
//      val value : Any = if (flg){
//          "张少军"
//      }else{
//          "学校"
//      }
//       println(value)
//      Unit

    // i表示循环的变量, i 将会从1-5到循环, 前后闭合(包括1和5)
    // to 表示循环的范围.


    // 使用1 until 5表示循环的范围.从1截止到5(不包含5)
//    for (i <- 1 until  5){
//      println(s"i = ${i}")
//    }

    // 0.until(5)
//
//    for ( i <- 1 to 3){
//        for ( j <- 1 until 3) {
//           println(s"${i} ==${j}")
//        }
//    }

    // Range(start,end)范围对象, 等同于until,不包含end
//    for ( i <- Range(0,5,2)){
//        println(s"i=====${i}")
//    }


    // Range(start,end)范围对象, 等同于until,不包含end
//    for ( i <- Range(0,5,2)){
//      println(s"i=====${i}")
//    }


  /*  var a = "aaa"
    var b = a * 5
    println(b)*/

//    var a = "张少军" * 3
//    println(a)

    for ( i <- Range(1,18,2)) {
       println(" "*((17-i)/2)+"*"*i)
    }



  }
}
