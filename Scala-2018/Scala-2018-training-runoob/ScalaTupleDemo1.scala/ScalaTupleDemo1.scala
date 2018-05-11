// ScalaTupleDemo1.scala

val t = (1, 3.14, "Fred");

val t = new Tuple3(1, 3.14, "Fred");

val t = (4, 3, 2, 1);


object ScalaTupleDemo1{
	def main(args : Array[String]){
		val t = (4, 3, 2, 1);

		val sum + t._1 + t._2 + t._3 + t._4;

		println("元素之和为 : " + sum);
	}
}



object ScalaTupleDemo2{
	def main(args : Array[String]){
		val t = (4, 3, 2, 1);

		t.productIterator.foreach{ i=> println("Value = " + i)}
	}
}



object ScalaTupleDemo3_toString{
	def main(args : Array[String]){
		val t = new Tuple3(1, "hello", Console);

		println("连接后的字符串为 : " + t.toString());
	}
}



object ScalaTupleDemo4_swap{
	def main(args : Array[String]){
		val t = new Tuple2("www.google.com", "www.runoob.com");

		println("交换后的元组: " + t.swap);
	}
}