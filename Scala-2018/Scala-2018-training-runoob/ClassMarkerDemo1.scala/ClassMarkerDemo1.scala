// ClassMarkerDemo1.scala

// 私有构造方法
class Marker private(val color : String){
	println("创建" + this);
	override def toString() : String = "颜色标记: " + color;
}

// 伴生对象，与类共享名字，可以访问类的私有属性和方法
object Maker{
	private val makers : Map[String, Marker] = Map(
		"red" -> new Maker("red"),
		"blue" -> new Maker("blue"),
		"green" -> new Maker("green"));

	def apply(color: String) = {
		if(makers.contains(color)) makers(color) else null;
	}

	def getMaker(color: String) = {
		if(makers.contains(color)) makers(color) else null;
	}

	def main(args : Array[String]){
		println(Maker("red"));
		// 单例函数调用，省略了.(点)符号
		println(Maker getMaker "blue");
	}
}
// 创建颜色标记：red
// 创建颜色标记：blue
// 创建颜色标记：green
// 颜色标记：red
// 颜色标记：blue
