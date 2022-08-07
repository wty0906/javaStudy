package generic_exteneds;

import sun.applet.Main;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ty.wang
 * @since 2022/7/26 15:41
 */
public class Test {
    public static void main(String[] args) {
        Object o = new Object();
        String s = new String();
        o = s;//多态的一种形式
        Object[] objects = new Object[10];
        String[] strings = new String[10];
        objects = strings;
        List<Object> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        //list1=list2;//总结：AB是子类父类的关系，但是G<A>和G<B>不存在继承关系的。是并列关系。所以list1 = list2会报错

    }
}
