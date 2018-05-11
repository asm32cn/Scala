// ScalaIteratorDemo1.scala

object ScalaIteratorDemo1{
	def main(args : Array[String]){
		val it = Iterator("Baidu", "Google", "Runoob", "Taobao");

		while(it.hasNext){
			println(it.next());
		}
	}
}
// Baidu
// Google
// Runoob
// Taobao



object ScalaIteratorDemo2_min_max{
	def main(args : Array[String]){
		val ita = Iterator(20, 40, 2, 50, 69, 90);
		val itb = Iterator(20, 40, 2, 50, 69, 90);

		println("最大元素是:" + ita.max);
		println("最小元素是:" + ita.min);
	}
}
// 最大元素是: 90
// 最小元素是: 2



object ScalaIteratorDemo3_size_length{
	def main(args : Array[String]){
		val ita = Iterator(20, 40, 2, 50, 69, 90);
		val itb = Iterator(20, 40, 2, 50, 69, 90);

		println("ita.size 的值为: " + ita.size);
		println("itb.length 的值为: " + itb.length);
	}
}
// ita.size 的值为: 6
// itb.length 的值为: 6



