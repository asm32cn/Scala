// BubbleSortDemo1.scala

object BubbleSortDemo1{
	def main(args:Array[String]):Unit = {
		// val data = Array(41, 67, 34, 0, 69, 24, 78, 58, 62, 64, 5, 45, 81, 27, 61, 91, 95, 42, 27, 36);
		val data = Array(76, 11, 11, 43, 78, 35, 39, 27, 16, 55, 1, 41, 24, 19, 54, 7, 78, 69, 65, 82);

		displayData(data);
		BubbleSort(data);
		displayData(data);
	}

	def displayData(data:Array[Int]){
		var n = data.length;
		for(i <- 0 until n){
			if(i > 0) print(", ");
			print(data(i));
		}
		println();
	}

	def swap(data:Array[Int], i:Int, j:Int){
		val temp = data(i);
		data(i) = data(j);
		data(j) = temp;
	}

	def BubbleSort(data:Array[Int]){
		var n = data.length;
		for(j <- 0 until n - 1){
			for(i <- 0 until n - 1 - j){
				if(data(i) > data(i + 1)){
					swap(data, i, i + 1);
				}
			}
		}
	}
}