package com.lanqiao.bei;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author mikey
 * @create 2022-07-26 23:56
 */
public class Test9 {
    @Test
    public void test1(){
        int[]  res=intersection(new int[]{2,3,4},new int[]{2,3,5});
        System.out.println(Arrays.toString(res));
        int index1=0,index2=0;
    }
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> res =new HashSet<>();
        Set<Integer> res1 =new HashSet<>();
        for(int n1:nums1){
            res.add(n1);
        }
        for(int n2:nums2){
            if(res.contains(n2)){
                res1.add(n2);
            }
        }
        int[] r=new int[res1.size()];
        int i =0;
        for(int s:res1){
            r[i++]=s;
        }
        return r;
    }
}
