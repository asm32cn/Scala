// ScalaCarsarDemo1.scala

object ScalaCarsarDemo1{
	final val strCharset = "utf-8";

	def main(args:Array[String]):Unit = {
		val strSource = "ScalaCarsarDemo1.scala (Scala实现caesar凯撒加密算法)";
		val strEncrypt = CarsarEncode(strSource);
		val strDecrypt = CarsarDecode(strEncrypt);

		println("strSource:\n\t" + strSource);
		println("strEncrypt:\n\t" + strEncrypt);
		println("strDecrypt:\n\t" + strDecrypt);
	}

	def CarsarEncode(s:String):String = {
		val nCount = s.length();
		var sb = new StringBuilder;

		for(i <- 0 until nCount){
			var ch = s.charAt(i).toInt;
			if(ch >= 'A' && ch <= 'Z'){
				ch = 'A' + (ch - 'A' + 3) % 26;
			}else if(ch >= 'a' && ch <= 'z'){
				ch = 'a' + (ch - 'a' + 3) % 26;
			}
			sb.append(ch.toChar);
		}
		sb.toString;
	}

	def CarsarDecode(s:String):String = {
		val nCount = s.length();
		var sb = new StringBuilder;

		for(i <- 0 until nCount){
			var ch = s.charAt(i).toInt;
			if(ch >= 'A' && ch <= 'Z'){
				ch = 'A' + (ch - 'A' + 23) % 26;
			}else if(ch >= 'a' && ch <= 'z'){
				ch = 'a' + (ch - 'a' + 23) % 26;
			}
			sb.append(ch.toChar);
		}
		sb.toString;
	}
}

/*
strSource:
	ScalaCarsarDemo1.scala (Scala实现caesar凯撒加密算法)
strEncrypt:
	VfdodFduvduGhpr1.vfdod (Vfdod实现fdhvdu凯撒加密算法)
strDecrypt:
	ScalaCarsarDemo1.scala (Scala实现caesar凯撒加密算法)
*/