// ShellSortDemo1.scala

object ShellSortDemo1{
	def main(args:Array[String]){
		// val data = Array(41, 67, 34, 0, 69, 24, 78, 58, 62, 64, 5, 45, 81, 27, 61, 91, 95, 42, 27, 36);
		val data = Array(76, 11, 11, 43, 78, 35, 39, 27, 16, 55, 1, 41, 24, 19, 54, 7, 78, 69, 65, 82);

		displayData(data);
		ShellSort(data);
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

	def ShellSort(data:Array[Int]){
		val n = data.length;
		var h = 0;
		while(h <= n){
			h = 3 * h + 1;
		}
		while(h >= 1){
			for(i <- h until n){
				var j = i - h;
				var get = data(i);
				while(j >= 0 && data(j) > get){
					data(j + h) = data(j);
					j -= h;
				}
				data(j + h) = get;
			}
			h = (h - 1) / 3;
		}
	}
}