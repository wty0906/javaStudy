package generic_class;

/**
 * @author ty.wang
 * @since 2022/7/26 15:11
 * GenericTest 就是普通类
 * GenericTest<E> 就是泛型类
 * <>里面就是一个参数类型，但是这个类型是什么呢？这个类型现在是不确定的，相当于一个占位
 * 但是现在确定的是这个类型一定是一个引用数据类型，而不是基本数据类型
 */
public class GenericTest<E> {
    int age;
    String name;
    E sex;

    public void a(E n) {

    }

    public void a(E[] n) {

    }
}

class Test {
    public static void main(String[] args) {
        //GenericTest进行实例化
        GenericTest genericTest = new GenericTest();
        genericTest.a("abc");
        genericTest.a(17);
        genericTest.a(9.8);
        genericTest.a(new String[]{"a", "b"});
        //实例化的时候指定泛型
        GenericTest<String> test = new GenericTest<>();
        test.sex = "男";
        test.a("aaa");
        test.a(new String[]{"a", "b"});


    }
}

class SubGenericTest extends GenericTest<Integer> {


}

class Test1 {
    public static void main(String[] args) {
        //指定父类泛型，那么子类就不需要再指定泛型了，可以直接使用
        SubGenericTest subGenericTest = new SubGenericTest();
        subGenericTest.a(19);
    }
}

class SubGenericTest2<E> extends GenericTest<E> {


}
class Test2{
    public static void main(String[] args) {
        SubGenericTest2<String> stringSubGenericTest2 = new SubGenericTest2<>();
        stringSubGenericTest2.a("111");
    }
}