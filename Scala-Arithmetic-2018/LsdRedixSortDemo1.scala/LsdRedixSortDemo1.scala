// LsdRedixSortDemo1.scala

object LsdRedixSortDemo1{
	def main(args:Array[String]){
		// val data = Array(41, 67, 34, 0, 69, 24, 78, 58, 62, 64, 5, 45, 81, 27, 61, 91, 95, 42, 27, 36);
		val data = Array(76, 11, 11, 43, 78, 35, 39, 27, 16, 55, 1, 41, 24, 19, 54, 7, 78, 69, 65, 82);

		displayData(data);
		LsdRedixSort(data);
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

	def LsdRedixSort(data:Array[Int]){
		val dn = 3;
		val k = 10;
		val C = new Array[Int](k);
		val radix = Array(1, 1, 10, 100);

		def GetDigit(x:Int, d:Int):Int = {
			(x / radix(d)) % 10; // return last exp
		}

		val n = data.length;
		val B = new Array[Int](n);
		// LsdRedixSort
		for(d <- 1 until dn){
			// CountingSort

			for(i <- 0 until k){
				C(i) = 0;
			}
			for(i <- 0 until n){
				C(GetDigit(data(i), d)) += 1;
			}
			for(i <- 1 until k){
				C(i) += C(i - 1);
			}

			for(i <- n - 1 to 0 by -1){
				val dight = GetDigit(data(i), d);
				C(dight) -= 1;
				B(C(dight)) = data(i);
			}

			for(i <- 0 until n){
				data(i) = B(i);
			}
		}
	}
}