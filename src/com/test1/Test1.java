package com.test1;

import org.junit.Test;

/**
 * @author mikey
 * @create 2022-08-11 23:07
 */
public class Test1 {
    @Test
    public void test1(){
        System.out.println(repeatedSubstringPattern("aba"));
    }
    public boolean repeatedSubstringPattern(String s) {
        int i=1;
        while(i<s.length()){
            String res  = s.substring(0,i);
            String res1 = "";
            if(s.length() % i == 0){
                int word = s.length() / i;
                while(word>0){
                    res1 +=res;
                    word--;
                }
            }
            if(res1.equals(s)){
                return true;
            }
            i++;
        }
        return false;
    }
}
