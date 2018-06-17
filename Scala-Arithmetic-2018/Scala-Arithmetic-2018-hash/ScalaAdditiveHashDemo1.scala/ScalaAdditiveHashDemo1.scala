// ScalaAdditiveHashDemo1.scala

object ScalaAdditiveHashDemo1{
	def main(args:Array[String]):Unit = {
		val A_strKeys = Array("C", "C++", "Java", "C#", "Python", "Go", "Scala", "vb.net", "JavaScript", "PHP", "Perl", "Ruby");

		for(i <- 0 until A_strKeys.length){
			val strKey = A_strKeys(i);
			val nHash = additiveHash(strKey, 31);
			println(f"$i%-10d $strKey%-15s $nHash%3d");
		}
	}

	def additiveHash(s:String, nPrime:Int):Int = {
		val n = s.length();
		var nHash = n;
		for(i <- 0 until n){
			nHash += s.charAt(i);
		}
		nHash % nPrime;
	}
}

/*
0          C                 6
1          C++               1
2          Java             18
3          C#               11
4          Python           28
5          Go               29
6          Scala            24
7          vb.net            6
8          JavaScript        2
9          PHP              18
10         Perl              4
11         Ruby             19
*/