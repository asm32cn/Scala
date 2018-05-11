// ScalaListDemo1.scala

val site: List[String] = List("Runoob", "Google", "Baidu");

val nums: List[Int] = List(1, 2, 3, 4);

val empty: List[Nothing] = List();

val dim: List[List[Int]] =
    List(
        List(1, 0, 0),
        List(0, 1, 0),
        List(0, 0, 1)
    );

val site2 = "Runoob" :: ("Google" :: ("Baidu" :: Nil));

val nums2 = 1 :: (2 :: (3 :: (4 :: Nil)));

val empty2 = Nil;

val dim2 =
    (1 :: (0 :: (0 :: Nil))) ::
    (0 :: (1 :: (0 :: Nil))) ::
    (0 :: (0 :: (1 :: Nil))) :: Nil;


object ScalaListDemo2 {
    def main(args: Array[String]){
        val site = "Runoob" :: ("Google" :: ("Baidu" :: Nil));
        val nums = Nil;

        println("第一网站是 : " + site.head);
        println("最后一个网站是 : " + site.tail);
        println("查看列表 site 是否为空 : " + site.isEmmpty);
        println("查看 nums 是否为空 : " + nums.isEmpty);
    }
}


object ScalaListDemo2 {
    def main(args: Array[String]){
        val site1 = "Runoob" :: ("Google" :: ("Baidu" :: Nil));
        val site2 = "Facebook" :: ("Taobao" :: Nil);

        // 使用 ::: 运算符
        var fruit = site1 ::: site2;
        println("site1 ::: site2 : " + fruit);

        // 使用 Set.:::() 方法
        fruit = site1.:::(site2);
        println("site1.:::(site2) : " + fruit);

        // 使用 concat 方法
        fruit = List.concat(site1, site2);
        println("List.concat(site1, site2) : " + fruit);
    }
}


object ScalaListDemo3fill{
    def main(args : Array[String]){
        val site = List.fill(3)("Runoob");
        println("site : " + site);

        val num = List.fill(10)(2);
        println("num : " + num);
    }
}


object ScalaListDemo4tabulate{
    def main(args : Array[String]){
        val squares = List.tabulate(6)(n => n * n);
        println("一维 : " + squares);

        val mul = List.tabulate(4, 5) ( _ * _);
        println("多维 : " + mul);
    }
}


object ScalaListDemo5reverse{
    def main(args : Array[String]){
        val site = "Runoob" :: ("Google" :: ("Baidu" :: Nil));
        println("site反转前 : " + site);

        println("site反转后 : " + site.reverse);
    }
}