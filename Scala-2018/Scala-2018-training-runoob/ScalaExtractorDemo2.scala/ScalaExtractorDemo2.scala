// ScalaExtractorDemo2.scala

object ScalaExtractorDemo2{
	def main(args: Array[String]){
		val x = Text(5);
		println(x);

		x match {
			case Test(num) => println(x + " 是 " + num + " 的两倍!");
			// unapply 被调用
			case _ => println("无法计算");
		}
	}
	def apply(x: Int) = x + x;
	def unapply(z: Int): Option[Int] = if(z % 2 == 0) Some(z / 2) else None;
}