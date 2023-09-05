package basics

object scalaLearning {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(82); 
  println("Welcome to the Scala worksheet");$skip(21); 
  
 println("Hello");$skip(21); 
  
  val a:Int = 47;System.out.println("""a  : Int = """ + $show(a ));$skip(27); ;
  var b:String = "Kalyan";System.out.println("""b  : String = """ + $show(b ));$skip(26); ;
  
  println(a + " " + b);$skip(35); 
  
  val x = 33;System.out.println("""x  : Int = """ + $show(x ));$skip(14); ; // type inference
  var y = 47;System.out.println("""y  : Int = """ + $show(y ));$skip(19); ;
  
  var c = true;System.out.println("""c  : Boolean = """ + $show(c ));$skip(47); ;
  //var e:Boolean = true
  
  var d:Char ='a';System.out.println("""d  : Char = """ + $show(d ));$skip(28); ;
  
  var pi:Double = 3.1415;System.out.println("""pi  : Double = """ + $show(pi ));$skip(45); 
  
  var piSinlePrecession :Float = 3.11415f;System.out.println("""piSinlePrecession  : Float = """ + $show(piSinlePrecession ));$skip(31); 
  
  val e:Long = 12345678912l;System.out.println("""e  : Long = """ + $show(e ));$skip(32); 
  
  val smallNumber:Byte = 127;System.out.println("""smallNumber  : Byte = """ + $show(smallNumber ));$skip(59); 
  //-127 to 128
  
  println("combined : " + x + " " + y);}
  
}
