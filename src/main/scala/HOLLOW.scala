object HOLLOW    {
  def main(args: Array[String]): Unit = {
    for(i<-1 to 4){
      for(j<-1 to 6){
        if(i ==1 || i ==4 || j ==1 || j==6){
          print("* ")
        }
        else{
          print(" ")
        }
      }
      println()
    }
  }
}
