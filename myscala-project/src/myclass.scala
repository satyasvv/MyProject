
class myclass {
  def test(): Unit = {
       println("This is a test scla program")
       println("This is a test project")
  }
}


object testmyclass {
  
    def main(args: Array[String]): Unit ={
     
      val m = new myclass()
      m.test()
      
    }
     }
