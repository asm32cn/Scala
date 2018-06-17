// QuickSortDemo1.scala

object QuickSortDemo1{
	def main(args:Array[String]){
		// val data = Array(41, 67, 34, 0, 69, 24, 78, 58, 62, 64, 5, 45, 81, 27, 61, 91, 95, 42, 27, 36);
		val data = Array(76, 11, 11, 43, 78, 35, 39, 27, 16, 55, 1, 41, 24, 19, 54, 7, 78, 69, 65, 82);

		displayData(data);
		QuickSort(data, 0, data.length - 1);
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

	def QuickSort(data:Array[Int], left:Int, right:Int){
		if(left < right){
			var key = data(left);
			var low = left;
			var high = right;
			while(low < high){
				while(low < high && data(high) >= key){
					high -= 1;
				}
				data(low) = data(high);
				while(low < high && data(low) <= key){
					low += 1;
				}
				data(high) = data(low);
			}
			data(low) = key;

			QuickSort(data, left, low - 1);
			QuickSort(data, low + 1, right);
		}
	}
}