// BucketSortDemo1.scala

object BucketSortDemo1{
	val MAX = 100;
	val bn = 5;
	val C = new Array[Int](bn);
	var nFactor = { if(MAX % bn == 0)  (MAX / bn) else (MAX / bn + 1) };

	// def iif(exp:Boolean, a:Int, b:Int) : Int = { if(exp) a else b; }

	def main(args:Array[String]){
		// val data = Array(41, 67, 34, 0, 69, 24, 78, 58, 62, 64, 5, 45, 81, 27, 61, 91, 95, 42, 27, 36);
		val data = Array(76, 11, 11, 43, 78, 35, 39, 27, 16, 55, 1, 41, 24, 19, 54, 7, 78, 69, 65, 82);

		displayData(data);
		BucketSort(data);
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

	def insertionSort(data:Array[Int], left:Int, right:Int){
		for(i <- left + 1 to right){
			var get = data(i);
			var j = i - 1;
			while(j >= left && data(j) > get){
				data(j + 1) = data(j);
				j -= 1;
			}
			data(j + 1) = get;
		}
	}

	def countingSort(data:Array[Int]){
		val n = data.length;

		def mapToBucket(x:Int) : Int = {
			x / nFactor;
		}

		for(i <- 0 until bn){
			C(i) = 0;
		}
		for(i <- 0 until n){
			C(mapToBucket(data(i))) += 1;
		}
		for(i <- 1 until bn){
			C(i) += C(i - 1);
		}
		val B = new Array[Int](n);
		for(i <- n - 1 to 0 by -1){
			val b = mapToBucket(data(i));
			B({C(b) -= 1;C(b)}) = data(i);
		}
		for(i <- 0 until n){
			data(i) = B(i);
		}
	}

	def BucketSort(data:Array[Int]){
		val n = data.length;

		countingSort(data);
		for(i <- 0 until bn){
			val left = C(i);
			val right = { if(i == bn - 1) n - 1 else C(i + 1) - 1 };
			if(left < right){
				insertionSort(data, left, right);
			}
		}
	}
}