// ScalaFNVHashDemo1.scala

object ScalaFNVHashDemo1{
	final val M_MASK = 31;
	final val M_SHIFT = 0;

	def main(args:Array[String]):Unit = {
		val A_strKeys = Array("C", "C++", "Java", "C#", "Python", "Go", "Scala", "vb.net", "JavaScript", "PHP", "Perl", "Ruby");

		for(i <- 0 until A_strKeys.length){
			val strKey = A_strKeys(i);
			val nHash = FNVHash(strKey);
			val nHashB = nHash % 33;
			println(f"$i%-10d $strKey%-15s $nHash%15d $nHashB%3d");
		}
	}

	def FNVHash(s:String):Int = {
		val nCount = s.length();
		var nHash:Long = 2166136261L;
		for(i <- 0 until nCount){
			nHash = (nHash * 16777619) & 0xffffffff ^ s.charAt(i).toInt;
		}
		if(M_SHIFT != 0){
			nHash = (nHash ^ (nHash >> M_SHIFT)) & M_MASK;
		}
		return (nHash & 0xffffffff).toInt;
	}
}

/*
0          C                      84696412  31
1          C++                 -2075630010  -3
2          Java                 1542292725   6
3          C#                   1316419575   9
4          Python               -193191885 -18
5          Go                   1249309159  10
6          Scala                -250560223  -1
7          vb.net              -1198697754 -12
8          JavaScript           -790376216 -14
9          PHP                   589789791  30
10         Perl                 -897830718 -15
11         Ruby                 -651897675   0
*/