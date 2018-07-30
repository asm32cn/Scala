// ScalaBase64Demo1.scala

object ScalaBase64Demo1{
	final val strCharset = "utf-8";
	final val strKey = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=";

	def main(args:Array[String]):Unit = {
		val strSource = "c-base64-demo-1.c\n程序中书写着所见所闻所感，编译着心中的万水千山。";
		val strEncrypt = Base64Encode(strSource);
		val strDecrypt = Base64Decode(strEncrypt);

		println(strSource);
		println(strEncrypt);
		println(strDecrypt);
	}

	def Base64Encode(s:String):String = {
		val data = s.getBytes(strCharset);
		val nCount = data.length;

		var chr1, chr2, chr3 = 0;
		var enc1, enc2, enc3, enc4 = 0;
		var i = 0;
		var sb = new StringBuilder;
		while(i < nCount){
			chr1 = data(i) & 255; i += 1;
			enc1 = chr1 >> 2;
			if(i < nCount){
				chr2 = data(i) & 255; i += 1;
				enc2 = ((chr1 & 3) << 4) | ((chr2 & 0xf0) >> 4);
				if(i < nCount){
					chr3 = data(i) & 255; i += 1;
					enc3 = ((chr2 & 15) << 2) | ((chr3 & 0xc0) >> 6);
					enc4 = chr3 & 63;
				}else{
					enc3 = (chr2 & 15) << 2;
					enc4 = 64;
				}
			}else{
				enc2 = (chr1 & 3) << 4;
				enc3 = 64; enc4 = 64;
			}
			sb.append(strKey(enc1)).append(strKey(enc2));
			sb.append(strKey(enc3)).append(strKey(enc4));
		}
		return sb.toString;
	}

	def Base64Decode(s:String):String = {
		val nCount = s.length;
		var i, n = 0;
		var chr1, chr2, chr3 = 0;
		var enc1, enc2, enc3, enc4 = 0;
		var _map : Map[Char, Int] = Map();
		for(i <- 0 until strKey.length){ _map += (strKey.charAt(i) -> i); };

		var cache = new Array[Byte](nCount * 3 / 4);
		i = 0; n = 0;
		while(i < nCount){
			enc1 = _map(s.charAt(i)); i += 1;
			enc2 = _map(s.charAt(i)); i += 1;
			enc3 = _map(s.charAt(i)); i += 1;
			enc4 = _map(s.charAt(i)); i += 1;

			chr1 = (enc1 << 2) | (enc2 >> 4);
			chr2 = ((enc2 & 15) << 4) | (enc3 >> 2);
			chr3 = ((enc3 & 3) << 6) | enc4;

			cache(n) = chr1.toByte; n += 1;
			if(enc3 != 64){ cache(n) = chr2.toByte; n += 1; }
			if(enc4 != 64){ cache(n) = chr3.toByte; n += 1; }
		}
		return new String(cache, strCharset);
	}
}


/*
c-base64-demo-1.c
程序中书写着所见所闻所感，编译着心中的万水千山。
Yy1iYXNlNjQtZGVtby0xLmMK56iL5bqP5Lit5Lmm5YaZ552A5omA6KeB5omA6Ze75omA5oSf77yM57yW6K+R552A5b+D5Lit55qE5LiH5rC05Y2D5bGx44CC
c-base64-demo-1.c
程序中书写着所见所闻所感，编译着心中的万水千山。
*/