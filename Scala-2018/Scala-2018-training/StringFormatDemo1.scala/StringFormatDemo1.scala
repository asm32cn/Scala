// StringFormatDemo1.scala

object StringFormatDemo1 {
	def main(args : Array[String]) : Unit = {
		var f = 12.456f;
		var i = 2000;
		var str = "StringFormatDemo1.scala";
		var fs = printf("浮点型变量为 %f\n" +
			"整形变量为 %d\n" +
			"字符串为 %s\n" +
			"Done", f, i, str);
		println(fs);
	}
}