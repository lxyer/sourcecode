package com.lxyer.sourcecode;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList初始化的时候指定的默认的长度,如果直接调用add(E)是会通过新创建一个新的
 * 数组(长度+1),来保存新的元素,但是如果通过add(index,E)的方式直接按下标去添加,会出现IndexOutOfBoundsException
 *
 */
public class ArrayListTest {
    public static void main(String[] args) {
        List list = new ArrayList(2);
        list.add(1);
        list.add(2);
        System.out.println("hahahah");
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(5,3);

    }
}
