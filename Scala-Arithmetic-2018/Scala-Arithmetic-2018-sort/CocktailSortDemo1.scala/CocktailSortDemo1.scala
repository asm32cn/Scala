// CocktailSortDemo1.scala

object CocktailSortDemo1{
	def main(args:Array[String])/*:Unit = */{
		// val data = Array(41, 67, 34, 0, 69, 24, 78, 58, 62, 64, 5, 45, 81, 27, 61, 91, 95, 42, 27, 36);
		val data = Array(76, 11, 11, 43, 78, 35, 39, 27, 16, 55, 1, 41, 24, 19, 54, 7, 78, 69, 65, 82);

		displayData(data);
		CocktailSort(data);
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

	def swap(data:Array[Int], i:Int, j:Int){
		val temp = data(i);
		data(i) = data(j);
		data(j) = temp;
	}

	def CocktailSort(data:Array[Int]){
		var left = 0;
		var right = data.length - 1;
		while(left < right){
			for(i <- left until right){
				if(data(i) > data(i + 1)){
					swap(data, i, i + 1);
				}
			}
			right -= 1;
			for(i <- right until left by -1){
				if(data(i - 1) > data(i)){
					swap(data, i - 1, i);
				}
			}
			left += 1;
		}
	}
}