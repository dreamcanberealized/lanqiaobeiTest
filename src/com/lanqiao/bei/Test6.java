package com.lanqiao.bei;

import java.util.Scanner;

/**
 * @author mikey
 * @create 2022-06-06 15:57
 */
public class Test6 {
    /**
     * 罗马数字包含以下七种字符： I， V， X， L，C，D 和 M。
     *
     * 字符          数值
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n = scan.nextInt();
        String luoMa = getLuoMa(n);
        System.out.println(luoMa);
    }
    /**
     * 给你一个整数，将其转为罗马数字。
     * 输入: num = 3
     * 输出: "III"
     *
     * 输入: num = 4
     * 输出: "IV"
     *
     * 输入: num = 1994
     * 输出: "MCMXCIV"
     * 解释: M = 1000, CM = 900, XC = 90, IV = 4.
     */
    public static String getLuoMa(int num){
        // 个位
        int ge = num%10;
        // 十位
        int shi = num/10%10;
        // 百位
        int bai = num/100%10;
        // 千位
        int qian = num/1000;
        String gewei="";
        String shiwei="";
        String baiwei="";
        String qianwei="";
        // 个位 判断
        if(ge>=1&&ge<=3){
            for(int i=1;i<=ge;i++){
                gewei+="I";
            }
        }
        else if(ge>=6&&ge<=8){
            gewei="V";
            for(int i=6;i<=ge;i++){
                gewei+="I";
            }
        }
        else{
            if(ge==4){
                gewei="IV";
            }
            else if(ge==5){
                gewei="V";
            }
            else if(ge==9){
                gewei="IX";
            }
        }
//        防止1000 100 这些情况
        if(qian==0&&bai==0&&shi==0){
            return gewei;
        }
        // 十位判断
        if(shi==1&&ge==0){
            shiwei="X";
        }
       else if(shi>=1&&shi<=3){
            for(int i=1;i<=shi;i++){
                shiwei+="X";
            }
        }
        else if(shi>=6&&shi<=8){
            shiwei="L";
            for(int i=6;i<=shi;i++){
                shiwei+="X";
            }
        }
        else{
            if(shi==5){
                shiwei="L";
            }
            else if(shi==4){
                shiwei="XL";
            }
            else if(shi==9){
                shiwei="XC";
            }
        }
        if(qian==0&&bai==0){
            return shiwei+gewei;
        }
        // 百位
        if(bai==1&&shi==0&&ge==0){
            baiwei="C";
        }
        else if(bai>=1&&bai<=3){
            for(int i=1;i<=bai;i++){
                baiwei+="C";
            }
        }
        else if(bai>=6&&bai<=8){
            baiwei="D";
            for(int i=6;i<=bai;i++){
                baiwei+="C";
            }
        }
        else{
            if(bai==5){
                baiwei="D";
            }
            else if(bai==4){
                baiwei="CD";
            }
            else if(bai==9){
                baiwei="CM";
            }
        }
        if(qian==0){
            return  baiwei+shiwei+gewei;
        }
        if(num==1000){
            return "M";
        }
        // 千位
        if(qian>=1&&qian<=3){
            for(int i=1;i<=qian;i++){
                qianwei+="M";
            }
        }
        return qianwei+baiwei+shiwei+gewei;
    }

}
