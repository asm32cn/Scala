// HeapSortDemo1.scala

object HeapSortDemo1{
    def main(args:Array[String]){
        // val data = Array(41, 67, 34, 0, 69, 24, 78, 58, 62, 64, 5, 45, 81, 27, 61, 91, 95, 42, 27, 36);
        val data = Array(76, 11, 11, 43, 78, 35, 39, 27, 16, 55, 1, 41, 24, 19, 54, 7, 78, 69, 65, 82);

        displayData(data);
        HeapSort(data);
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

    def HeapSort(data:Array[Int]){
    	def swap(i:Int, j:Int){
    		val temp = data(i);
    		data(i) = data(j);
    		data(j) = temp;
    	}

    	def heapify(i:Int, size:Int){
    		var leftChild = 2 * i + 1;
    		var rightChild = 2 * i + 2;
    		var max = i;
    		if(leftChild < size && data(leftChild) > data(max)){
    			max = leftChild;
    		}
    		if(rightChild < size && data(rightChild) > data(max)){
    			max = rightChild;
    		}
    		if(max != i){
    			swap(i, max);
    			heapify(max, size);
    		}
    	}

    	// BuildHeap
    	val n = data.length;
    	var heapSize = n;
    	for(i <- heapSize / 2 - 1 to 0 by -1){
    		heapify(i, heapSize);
    	}

    	// HeapSort
    	while(heapSize > 1){
    		heapSize -= 1;
    		swap(0, heapSize);
    		heapify(0, heapSize);
    	}
    }
}