package com.lanqiao.bei;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author mikey
 * @create 2022-06-05 16:33
 */
public class Test2 {
    /**
     * 1. 两数之和
     * 难度简单
     * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target的那两个整数，并返回它们的数组下标。
     * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
     * 你可以按任意顺序返回答案。
     */
    @Test
    public void test1(){
        int nums[]=new int[]{1,5,4,15,8,10,7};
        int target=20;
        int[] res1 = getIndex(nums, target);
        int [] res2 =getIndex2(nums,target);
        System.out.println(Arrays.toString(res1));//2  5
        System.out.println(Arrays.toString(res2));//2  5
    }
    public int[] getIndex3(int [] nums, int target){
        for (int i = 0; i < nums.length; i++) {

        }


        return new int []{-1,-1};
    }
    //暴力法时间复杂度O（n^2）
    public int[] getIndex(int [] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
// 利用hashMap来求解，时间复杂度O（n）
    public int[] getIndex2(int [] nums, int target){
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }

        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            Integer key = e.getKey();
            Integer value = e.getValue();
            int res  = target-key;
            if(map.containsKey(res)){
                return new int[]{value,map.get(res)};
            }
        }
        return new int[]{-1,-1};
    }
}
