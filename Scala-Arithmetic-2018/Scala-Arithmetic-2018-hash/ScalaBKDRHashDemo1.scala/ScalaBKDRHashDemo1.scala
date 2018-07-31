// ScalaBKDRHashDemo1.scala

object ScalaBKDRHashDemo1{
	def main(args:Array[String]):Unit = {
		val A_strKeys = Array("C", "C++", "Java", "C#", "Python", "Go", "Scala", "vb.net", "JavaScript", "PHP", "Perl", "Ruby");

		for(i <- 0 until A_strKeys.length){
			val strKey = A_strKeys(i);
			val nHash = BKDRHash(strKey);
			val nHashT = nHash % 31;
			println(f"$i%-10d $strKey%-15s $nHash%11d $nHashT%3d");
		}
	}

	def BKDRHash(s:String):Int = {
		val nSeed = 131; // 31 131 1313 13131 131313 etc
		var nHash = 0;
		for(i <- 0 until s.length()){
			nHash = nHash * nSeed + s.charAt(i);
		}
		nHash & 0x7fffffff;
	}
}

/*
0          C                        67   5
1          C++                 1155463   0
2          Java              168038906  27
3          C#                     8812   8
4          Python           1962499928   9
5          Go                     9412  19
6          Scala            1045413186   0
7          vb.net            763463135   2
8          JavaScript        557701633   8
9          PHP                 1382392   9
10         Perl              181595583   1
11         Ruby              186364258   8
*/