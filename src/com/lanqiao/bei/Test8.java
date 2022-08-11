package com.lanqiao.bei;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mikey
 * @create 2022-07-03 22:27
 */
public class Test8 {
        @Test
    public void test1(){
        String s = "a", t = "ab";
            System.out.println(isAnagram(s,t));
        }
    public boolean isAnagram(String s, String t) {
        Map<Character , Integer> strMap = new HashMap<>();
        for(int i =0;i<s.length();i++){
            char s1 =s.charAt(i);
            if(strMap.containsKey(s1)){
                strMap.put(s1,strMap.get(s1)+1);
            }else{
                strMap.put(s1,1);
            }
        }
        for(int i=0;i<t.length();i++){
            char t1=t.charAt(i);
            if(strMap.containsKey(t1)){
                strMap.put(t1,strMap.get(t1)-1);

                if(strMap.get(t1)<0){
                    return false;
                }
            }
            else{
                return false;
            }
        }
        for(Map.Entry<Character,Integer> map :strMap.entrySet()){
            if(map.getValue()>0){
                return false;
            }
        }
        return true;
    }
}
