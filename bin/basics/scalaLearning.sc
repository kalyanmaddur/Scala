package basics

object scalaLearning {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
 println("Hello")                                 //> Hello
  
  val a:Int = 47;                                 //> a  : Int = 47
  var b:String = "Kalyan";                        //> b  : String = Kalyan
  
  println(a + " " + b)                            //> 47 Kalyan
  
  val x = 33; // type inference                   //> x  : Int = 33
  var y = 47;                                     //> y  : Int = 47
  
  var c = true;                                   //> c  : Boolean = true
  //var e:Boolean = true
  
  var d:Char ='a';                                //> d  : Char = a
  
  var pi:Double = 3.1415                          //> pi  : Double = 3.1415
  
  var piSinlePrecession :Float = 3.11415f         //> piSinlePrecession  : Float = 3.11415
  
  val e:Long = 12345678912l                       //> e  : Long = 12345678912
  
  val smallNumber:Byte = 127                      //> smallNumber  : Byte = 127
  //-127 to 128
  
  println("combined : " + x + " " + y);           //> combined : 33 47
  
}