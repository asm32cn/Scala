// ScalaSetDemo1.scala

val set = Set(1, 2, 3);
println(set.getClass.getName);

println(set.exists(_ % 2 == 0));
println(set.drop(1));



import scala.collection.mutable.Set;

val mutableSet = Set(1, 2, 3);
println(mutableSet.getClass.getName); // scala.collection.mutable.HashSet

mutableSet.add(4);
mutableSet.remove(1);
mutableSet += 5;
mutableSet -= 2;

println(mutableSet); // Set(5, 3, 4)

val another = mutableSet.toSet
println(another.getClass.getName); // scala.collection.immutable.Set



object ScalaSetDemo1{
	def main(args : Array[String]){
		val site = Set("Runoob", "Google", "Baidu");
		val nums: Set[Int] = Set();

		println("第一网站是 : " + site.head);
		println("最后一个网站是 : " + site.tail);
		println("查看列表 site 是否为空 : " + site.isEmpty);
		println("查看 nums 是否为空 : " + nums.isEmpty);
	}
}


object ScalaSetDemo2{
	def mian(args : Array[String]){
		val site1 = Set("Runoob", "Google", "Baidu");
		val site2 = Set("Facebook", "Taobao");

		// ++ 作为运算符使用
		val site = site1 ++ site2;
		println("site1 ++ site2 : " + site);

		// ++ 作为方法使用
		site = site1.++(site2);
		println("site1.++(site2) : " + site);
	}
}


object ScalaSetDemo3_min_max{
	def main(args : Array[String]){
		val num = Set(5, 6, 9, 20, 30, 45);

		println("Set(5, 6, 9, 20, 30, 45) 集合中的最小元素是 : " + num.min);
		println("Set(5, 6, 9, 20, 30, 45) 集合中的最大元素是 : " + num.max);
	}
}



object ScalaSetDemo4_intersect{
	def main(args : Array[String]){
		val num1 = Set(5, 6, 9, 20, 30, 45);
		val num2 = Set(50, 60, 9, 20, 35, 55);

		// 交集
		println("num1.&(num2) : " + num1.&(num2));
		println("num1.intersect(num2) : " + num1.intersect(num2));
	}
}


