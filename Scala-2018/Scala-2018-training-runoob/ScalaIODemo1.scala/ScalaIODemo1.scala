// ScalaIODemo1.scala

import java.io._;

object ScalaUIDemo1{
	def main(args: Array[String]){
		val writer = new PrinterWriter(new File("test.txt"));

		writer.write("菜鸟教程");
		writer.close();
	}
}