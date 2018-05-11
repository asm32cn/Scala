// ScalaOptionDemo1.scala

val myMap : Map[String, String] = Map("key1" - > "value");
val value1 : Option[String] = myMap.get("key1");
val value2 : Option[String] = myMap.get("key2");

println(value1); // Some("value1")
println(value2); // None



object ScalaOptionDemo1{
	def main(args : Array[String]){
		val sites = Map(
			"runoob" -> "http://www.runoob.com",
			"google" -> "http://www.google.com");

		println("sites.get(\"runoob\") : " + sites.get("runoob")); // Some(www.runoob.com)
		println("sites.get(\"baidu\") : " + sites.get("baidu")); // None
	}
}



object ScalaOptionDemo2{
	def main(args : Array[String]){
		val sites = Map(
			"runoob" -> "www.runoob.com",
			"google" -> "www.google.com");

		println("show(sites.get(\"runoob\") : " +
			show(sites.get("runoob")));
		println("show(\"baidu\") : " +
			show(sites.get("baidu")));
	}

	def show( x : Option[String]) = x match{
		case Same(s) => s
		case None => "?"
	}
}
//show(sites.get("runoob")) : www.runoob.com
//show(sites.get("baidu")) : ?


object ScalaOptionDemo3_getOrElse{
	def main(args : Array[String]){
		val a : Option[Int] = Some(5);
		val b : Option[Int] = None;

		println("a.getOrElse(0): " + a.getOrElse(0));
		println("b.getOrElse(10): " + b.getOrElse(10));
	}
}
//a.getOrElse(0): 5
//b.getOrElse(10): 10



object ScalaOptionDemo4_isEmpty{
	def main(args : Array[String]){
		val a:Option[Int] = Some(5);
		val b:Option[Int] = None;

		println("a.isEmpty: " + a.isEmpty);
		println("b.isEmpty: " + b.isEmpty);
	}
}
//a.isEmpty: false
//a.isEmpty: true



