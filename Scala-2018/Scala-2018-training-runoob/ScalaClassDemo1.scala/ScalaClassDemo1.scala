// ScalaClassDemo1.scala

import java.io._;

class Point(xc: Int, yc: Int){
	var x : Int = xc;
	var y : Int = yc;

	def move(dx: Int, dy: Int){
		x = x + dx;
		y = y + dy;
		println("x 的坐标点: " + x);
		println("y 的坐标点: " + y);
	}
}

class Location(override val xc: Int, override val yc: Int,
	val zc: Int) extends Point{
	var z: Int = zc;

	def move(dx: Int, dy: Int, dz: Int){
		x = x + dx;
		y = y + dy;
		z = z + dz;
		println("loc: x 的坐标点: " + x);
		println("loc: y 的坐标点: " + y);
		println("loc: z 的坐标点: " + z);
	}

}

object ScalaClassDemo1{
	def main(args: Array[String]){
		val pt = new Point(10, 20);
		val loc = new Location(10, 20, 15);

		// move to new position
		pt.move(10, 10);

		loc.move(10, 10, 5);
	}
}
// x 的坐标点: 20
// y 的坐标点: 30
// loc: x 的坐标点: 20
// loc: y 的坐标点: 30
// loc: z 的坐标点: 20

