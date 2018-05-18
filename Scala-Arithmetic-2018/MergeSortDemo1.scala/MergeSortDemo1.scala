// MergeSortDemo1.scala

object MergeSortDemo1{
	def main(args:Array[String]){
		// val data = Array(41, 67, 34, 0, 69, 24, 78, 58, 62, 64, 5, 45, 81, 27, 61, 91, 95, 42, 27, 36);
		val data1 = Array(76, 11, 11, 43, 78, 35, 39, 27, 16, 55, 1, 41, 24, 19, 54, 7, 78, 69, 65, 82);
		val data2 = Array(76, 11, 11, 43, 78, 35, 39, 27, 16, 55, 1, 41, 24, 19, 54, 7, 78, 69, 65, 82);

		displayData(data1);
		MergeSortRecursion(data1, 0, data1.length - 1);
		displayData(data1);

		println();
		displayData(data2);
		MergeSortIteration(data2);
		displayData(data2);
	}

	def displayData(data:Array[Int]){
		val n = data.length;
		for(i <- 0 until n){
			if(i > 0) print(", ");
			print(data(i));
		}
		println();
	}

	def merge(data:Array[Int], left:Int, mid:Int, right:Int){
		val len = right - left + 1;
		var temp = new Array[Int](len);
		var index = 0;
		var i = left;
		var j = mid + 1;
		while(i <= mid && j <= right){
			if(data(i) <= data(j)){
				temp(index) = data(i);
				i += 1;
			}else{
				temp(index) = data(j);
				j += 1;
			}
			index += 1;
		}
		while(i <= mid){
			temp(index) = data(i);
			index += 1;
			i += 1;
		}
		while(j <= right){
			temp(index) = data(j);
			index += 1;
			j += 1;
		}
		var n = left;
		for(k <- 0 until len){
			data(n) = temp(k);
			n += 1;
		}
	}

	// 递归实现的归并排序(自顶向下)
	def MergeSortRecursion(data:Array[Int], left:Int, right:Int){
		// 当待排序的序列长度为1时，递归开始回溯，进行merge操作
		if(left == right) return;

		val mid = (left + right) / 2;
		MergeSortRecursion(data, left, mid);
		MergeSortRecursion(data, mid + 1, right);
		merge(data, left, mid, right);
	}

	// 非递归(迭代)实现的归并排序(自底向上)
	def MergeSortIteration(data:Array[Int]){
		val len = data.length;

		def iif(exp:Boolean, a:Int, b:Int) : Int = { if(exp) a else b; }

		// 子数组索引，前一个为A[left ... mid]，后一个为A[mid + 1 ... right]
		var left = 0;
		var mid = 0;
		var right = 0;
		var i = 1;
		// 子数组的大小i初始为1，每轮翻倍
		while(i < len){
			left = 0;
			// 后一个子数组存在(需要归并)
			while(left + i < len){
				mid = left + i - 1;
				// 后一个子数组大小可能不够
                right = iif(mid + i < len, mid + i, len - 1);
				merge(data, left, mid, right);
				// 前一个子数组索引向后移动
				left = right + 1;
			}
			i *= 2;
		}
	}
}