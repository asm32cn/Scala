// InsertionSortDemo1.scala

object InsertionSortDemo1{
	def main(args:Array[String]){
		// val data = Array(41, 67, 34, 0, 69, 24, 78, 58, 62, 64, 5, 45, 81, 27, 61, 91, 95, 42, 27, 36);
		val data = Array(76, 11, 11, 43, 78, 35, 39, 27, 16, 55, 1, 41, 24, 19, 54, 7, 78, 69, 65, 82);

		displayData(data);
		InsertionSort(data);
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

	def InsertionSort(data:Array[Int]){
		val n = data.length;
		for(i <- 1 until n){
			var get = data(i);
			var j = i - 1;
			while(j >= 0 && data(j) > get){
				data(j + 1) = data(j);
				j -= 1;
			}
			data(j + 1) = get;
		}
	}
}