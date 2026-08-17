package basics

@main def runVariables(): Unit = {
  println("--- Reusable Variable Examples (Scala 3) ---")

  println("Hello") //> Hello

  val a: Int = 47; //> a  : Int = 47
  var b: String = "Kalyan"; //> b  : String = Kalyan

  println(s"$a $b") //> 47 Kalyan

  //a = 33 -- reassignment to val is not possible
  // val a = 33 -- this is declaring a val as new not reassignment and does not throw any error

  val x = 33; // type inference                   //> x  : Int = 33
  var y = 47; //> y  : Int = 47

  var c = true; //> c  : Boolean = true
  //var e:Boolean = true

  var d: Char = 'a'; //> d  : Char = a

  var pi: Double = 3.1415 //> pi  : Double = 3.1415

  var piSinglePrecession: Float = 3.11415f //> piSinglePrecession  : Float = 3.11415

  val e: Long = 12345678912L //> e  : Long = 12345678912

  val smallNumber: Byte = 127 //> smallNumber  : Byte = 127
  //-127 to 128

  println("combined : " + x + " " + y); //> combined : 33 47


}