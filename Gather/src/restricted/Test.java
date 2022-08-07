package restricted;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingDeque;

/**
 * @author ty.wang
 * @since 2022/7/26 15:56
 */
public class Test {
    public static void main(String[] args) {
        //abc三个集合是并列关系
        List<Object> a = new ArrayList<>();
        List<Person> b = new ArrayList<>();
        List<Student> c = new ArrayList<>();
        /*
        * 开始泛型受限: 泛型的上限
        * List<? extends Person> 是List<Person> 的父类，是List<Person的子类>的父类
        * */
        List<? extends Person> list1 = null;
        //list1 = a;
        //list1 = b;
        //list1 = c;

        /*
         * 开始泛型受限: 泛型的下限
         * List<? super Person> 是List<Person> 的父类，是List<Person的父类>的父类
         * */
        List<? super Person> list2 = null;
        //list2 = a;
        //list2 = b;
        //list2 = c;

    }
}
