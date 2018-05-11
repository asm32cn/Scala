// ArrayDemo1.scala

object ArrayDemo1 {
	val _matrix = Array(
		Array(0, 0, 56, 108, 198, 198, 214, 214, 198, 198, 108, 56, 0, 0, 0, 0),   // 0
		Array(0, 0, 24, 56, 120, 24, 24, 24, 24, 24, 24, 126, 0, 0, 0, 0),         // 1
		Array(0, 0, 124, 198, 6, 12, 24, 48, 96, 192, 198, 254, 0, 0, 0, 0),       // 2
		Array(0, 0, 124, 198, 6, 6, 60, 6, 6, 6, 198, 124, 0, 0, 0, 0),            // 3
		Array(0, 0, 12, 28, 60, 108, 204, 254, 12, 12, 12, 30, 0, 0, 0, 0),        // 4
		Array(0, 0, 254, 192, 192, 192, 252, 6, 6, 6, 198, 124, 0, 0, 0, 0),       // 5
		Array(0, 0, 56, 96, 192, 192, 252, 198, 198, 198, 198, 124, 0, 0, 0, 0),   // 6
		Array(0, 0, 254, 198, 6, 6, 12, 24, 48, 48, 48, 48, 0, 0, 0, 0),           // 7
		Array(0, 0, 124, 198, 198, 198, 124, 198, 198, 198, 198, 124, 0, 0, 0, 0), // 8
		Array(0, 0, 124, 198, 198, 198, 126, 6, 6, 6, 12, 120, 0, 0, 0, 0)         // 9
	);
	var nCount = _matrix.length;
	val _mask = Array(128, 64, 32, 16, 8, 4, 2, 1);
	val _point = Array("  ", "()");

	def main(args : Array[String]) : Unit = {
		var lines = new Array[String](16);

		for( y <- 0 until 16) lines(y) = "";

		for(n <- 0 until nCount) {
			for( y <- 0 until 16) {
				for(x <- 0 until 8){
					lines(y) += ( if ( (_matrix(n)(y) & _mask(x) ) > 0 ) _point(1)  else _point(0) );
				}
			}
		}

		for( y <- 0 until 16 ){
			println( lines(y) );
		}
	}
}