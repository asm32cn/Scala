// ScalaSourceDemo1.scala

import scala.io.Source;

object ScalaSourceDemo1{
	def main(args: Array[String]){
		println("文件内容为:");

		Source.fromFile("test.txt").foreach{
			print
		}
	}
}