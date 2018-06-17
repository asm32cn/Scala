// ScalaRotatingHashDemo1.scala

object ScalaRotatingHashDemo1{
	def main(args:Array[String]):Unit = {
		val A_strKeys = Array("C", "C++", "Java", "C#", "Python", "Go", "Scala", "vb.net", "JavaScript", "PHP", "Perl", "Ruby");

		for(i <- 0 until A_strKeys.length){
			val strKey = A_strKeys(i);
			val nHash = rotatingHash(strKey, 31);;
			println(f"$i%-10d $strKey%-15s $nHash%3d");
		}
	}

	def rotatingHash(s:String, nPrime:Int):Int = {
		val n = s.length();
		var nHash  = n;
		for(i <- 0 until n){
			nHash = (nHash << 4 >> 28) ^ s.charAt(i);
		}
		nHash % nPrime;
	}
}

/*
0          C                 5
1          C++              12
2          Java              4
3          C#                4
4          Python           17
5          Go               18
6          Scala             4
7          vb.net           23
8          JavaScript       23
9          PHP              18
10         Perl             15
11         Ruby             28
*/