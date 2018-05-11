// ClosureDemo1.scala

object ClosureDemo1 {
	val title: String = "Scala 闭包测试";
	def main(args : Array[String]) : Unit = {
		println(title);
		for(i <- 1 to 5){
			println("multiplier(" + i + ") = " + multiplier(i));
		}
	}
	var factor = 3;
	var multiplier = (i:Int) => i * factor;
}