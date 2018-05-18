// CountingSortDemo1.scala

object CountingSortDemo1{
	def main(args:Array[String]){
		// val data = Array(41, 67, 34, 0, 69, 24, 78, 58, 62, 64, 5, 45, 81, 27, 61, 91, 95, 42, 27, 36);
		val data = Array(76, 11, 11, 43, 78, 35, 39, 27, 16, 55, 1, 41, 24, 19, 54, 7, 78, 69, 65, 82);

		displayData(data);
		CountingSort(data);
		displayData(data);
	}

	def displayData(data:Array[Int]){
		val n = data.length;
		for(i <- 0 until n){
			if(i > 0) print(", ");
			print(data(i));
		}
		println();
	}

	val k = 100;
	val C = new Array[Int](k);
	def CountingSort(data:Array[Int]){
		val n = data.length;
		for(i <- 0 until k){
			C(i) = 0;
		}
		for(i <- 0 until n){
			C(data(i)) += 1;
		}
		for(i <- 1 until k){
			C(i) += C(i - 1);
		}
		val B = new Array[Int](n);
		for(i <- n - 1 to 0 by -1){
			C(data(i)) -= 1;
			B(C(data(i))) = data(i);
		}
		for(i <- 0 until n){
			data(i) = B(i);
		}
	}
}