package com.lanqiao.bei;

import org.junit.Test;

import java.util.Arrays;
import java.util.PrimitiveIterator;

/**
 * @author shkstart
 * @create 2022-05-02 20:37
 */
public class Test1 {
    @Test
    public void test1(){

        String str1[]=new String[]{"a","b","c","d","e"};
        String str2[]=new String[]{"e","c","a","b","d"};
//        返回两个下标 0，2 然后长度是2
//        两个数组的起始下标和相同长度
//        int max=Integer.MIN_VALUE;
        int word=1;
        int word_1=0;
//        存放结果
        int res[]=new int[3];

        System.out.println(Arrays.toString(res));

    }
}
