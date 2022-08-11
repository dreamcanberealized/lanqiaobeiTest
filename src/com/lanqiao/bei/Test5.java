package com.lanqiao.bei;

import java.util.Scanner;

/**
 * @author mikey
 * @create 2022-06-05 21:13
 */
public class Test5 {
    /**
     * 4. 爬楼梯
     * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
     * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
     *
     * 示例 1：
     * 输入：n = 2
     * 输出：2
     * 解释：有两种方法可以爬到楼顶。
     * 1. 1 阶 + 1 阶
     * 2. 2 阶
     * 示例 2：
     * 输入：n = 3
     * 输出：3
     * 解释：有三种方法可以爬到楼顶。
     * 1. 1 阶 + 1 阶 + 1 阶
     * 2. 1 阶 + 2 阶
     * 3. 2 阶 + 1 阶
     *
     * 提示：
     * •	1 <= n <= 45
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(stairs(n));
        System.out.println(stairs1(n));
    }
/*    动态规划
    n = 1
    n = 2
    n = 3
    n = 5
    n = 8
    n = 13
    前两个之和
*/
    public  static int stairs(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        int a= 1;
        int b = 2;
        int res = a+b;
        for (int i = 2; i < n ; i++) {
            res = a+b;
            a = b;
            b = res;
        }
        return res;
    }
//    递归法
    public  static int stairs1(int n){
        // 递归法
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        return stairs(n-1)+stairs(n-2);
    }
}
