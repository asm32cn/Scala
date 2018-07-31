// ScalaHexStringDemo1.scala

object ScalaHexStringDemo1{
	final val strEncode = "utf-8";
	final val strHexDigit = "0123456789ABCDEF";

	def main(args:Array[String]){
		val strSource = "ScalaHexStringDemo1.scala\n程序中书写着所见所闻所感，编译着心中的万水千山。";
		val strEncrypt = HexStringEncode(strSource);

		println(strSource);
		println(strEncrypt);
	}

	def HexStringEncode(s:String):String = {
		val data = s.getBytes(strEncode);
		val nCount = data.length;
		var _map : Map[Int, Char] = Map();
		for(i <- 0 until strHexDigit.length()){ _map += (i -> strHexDigit.charAt(i)); }
		var sb = new StringBuilder;
		for(i <- 0 until nCount){
			var ch = data(i).toInt;
			sb.append(_map((ch & 0xf0) >> 4)).append(_map(ch & 15));
		}
		sb.toString;
	}
}

/*
ScalaHexStringDemo1.scala
程序中书写着所见所闻所感，编译着心中的万水千山。
5363616C61486578537472696E6744656D6F312E7363616C610AE7A88BE5BA8FE4B8ADE4B9A6E58699E79D80E68980E8A781E68980E997BBE68980E6849FEFBC8CE7BC96E8AF91E79D80E5BF83E4B8ADE79A84E4B887E6B0B4E58D83E5B1B1E38082
*/