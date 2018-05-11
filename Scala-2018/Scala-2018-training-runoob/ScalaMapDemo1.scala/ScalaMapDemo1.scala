// ScalaMapDemo1.scala

var A:Map[Char:Int] = Map();

val colors = Map("red" -> "#ff0000", "azure" -> "#f0ffff");

A += ('I' -> 1);
A += ('J' -> 5);
A += ('K' -> 10);
A += ('L' -> 100);



object ScalaMapDemo1{
	def main(args : Array[String]){
		val colors = Map(
				"red" -> "#ff0000",
				"azure" -> "#f0ffff",
				"peru" -> "#cd853f"
			)
		val nums: Map[Int, Int] = Map();

		println("colors 中的键为 : " + colors.keys);
		println("colors 中的值为 : " + colors.values);
		println("检测 colors 是否为空 : " + colors.isEmpty);
		println("检测 nums 是否为空 : " + nums.isEmpty);
	}
}



object ScalaMapDemo2{
	def main(args : Array[String]){
		val colors1 = Map(
			"red" -> "#ff0000",
			"azure" -> "#f0ffff",
			"peru" -> "#cd853f");
		val colors2 = Map(
			"blue" -> "#0033ff",
			"yellow" -> "#ffff00",
			"red" -> "#ff0000");

		// ++ 作为运算符
		var colors = colors1 ++ colors2;
		println("colors1 ++ colors2 : " + colors);

		// ++ 作为方法
		colors = colors1.++(colors2);
		println("colors1.++(colors2) : " + colors);
	}
}



object ScalaMapDemo3_keys_values{
	def main(args : Array[String]){
		val sites = Map(
			"runoob" -> "http://www.runoob.com",
			"baidu" -> "http://www.badu.com",
			"taobao" -> "http://www.taobao.com");

		sites.keys.foreach{
			i =>
			println("Key = " + i);
			println("Value = " + sites(i));
		}
	}
}



object ScalaMapDemo4_contains{
	def main(args : Array[String]){
		val sites = Map(
			"runoob" -> "http://www.runoob.com",
			"baidu" -> "http://www.baidu.com",
			"taobao" -> "http://www.taobao.com");

		if( sites.contains("runoob")){
			println("runoob 键存在, 对应的值为 : " + sites("runoob"));
		}else{
			println("runoob 键不存在");
		}

		if( sites.contains("baidu")){
			println("baidu 键存在, 对应的值为 : " + sites("baidu"));
		}else{
			println("baidu 键不存在");
		}

		if( sites.contains("google")){
			println("google 键存在, 对应的值为 : " + sites("google"));
		}else{
			println("google 键不存在");
		}
	}
}

