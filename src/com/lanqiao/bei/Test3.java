package com.lanqiao.bei;

import org.junit.Test;

import java.util.Map;
import java.util.Scanner;

/**
 * @author mikey
 * @create 2022-06-05 19:14
 */
public class Test3 {
    /**
     * 2. x 的平方根
     *
     * 给你一个非负整数 x ，计算并返回 x 的 算术平方根 。
     * 由于返回类型是整数，结果只保留 整数部分 ，小数部分将被 舍去 。
     * 注意：不允许使用任何内置指数函数和算符，例如 pow(x, 0.5) 或者 x ** 0.5 。
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int target=0;
        while(target>=0){
         target=scan.nextInt();
        int res=getInt(target);
        System.out.println(res);
        }
    }

    public static int getInt(int target){
//         46340*46340 边界值。时间复杂度O(n)
        if(target==0){
            return 0;
        }
        if(46340*46340<target){
            return 46340;
        }
        int res=1;
        for (int i = 1; i <= target/2; i++) {
            if(i*i==target){
                return i;
            }
//            当目标值是10
            else if(i*i>target && (i-1)*(i-1)<target){
                return (i-1);
            }
//            5
            else if(i==target/2 && i*i<target){
                return i;
            }
        }
        return res;
    }
    @Test
    public void test1(){
        System.out.println(46340*46340);
    }
}
