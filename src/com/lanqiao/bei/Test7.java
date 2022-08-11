package com.lanqiao.bei;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author mikey
 * @create 2022-06-23 15:15
 */
public class Test7 {
    @Test
    public void test1(){
//        int i = totalFruit(new int[]{1, 2, 1, 2, 2, 1, 3, 3, 3});
        String s = minWindow("ABAACBAB", "ABC");
        System.out.println(s);

    }
    public String minWindow(String s, String t) {
        if(s.length()<t.length()){
            return "";
        }
        // 记录移动窗口中的字符个数
        int[] window = new int[128];
        //记录t字符串中的字符个数
        int[] tStr = new int[128];
        for(int i=0;i<t.length();i++){
            tStr[t.charAt(i)]++;
        }
        //count 记录当前窗口中子字符串中字符的个数
        int left=0,right=0,count=0;
        //不可达到的窗口大小
        int minL=s.length()+1;
        int start=0;
        while(right<s.length()){
            char r=s.charAt(right);
            // 如果不是需要的字符，直接右移，
            if(tStr[r]==0){
                right++;
                continue;
            }
            //窗口内有效字符++，
            if(window[r]<tStr[r]){
                count++;
            }
            right++;
            //移动窗口字符++
            window[r]++;
            //小于最小窗口
            while(count>=t.length()){
                if(right-left<minL){
                    minL=right-left;
                    start=left;
                }
//                判断左边指针移动 ,如果左边不是子字符串的字符，则直接右移。
                char l =s.charAt(left);
                if(tStr[l]==0){
                    left++;
                    continue;
                }
                if(window[l]==tStr[l]){
                    count--;
                }
                window[l]--;
                left++;
            }
        }
        if(minL==s.length()+1){
            return "";
        }
        return s.substring(start,start+minL);
    }
    public int totalFruit(int[] tree) {
        // We'll make a list of indexes for which a block starts.
        List<Integer> blockLefts = new ArrayList();

        // Add the left boundary of each block
        for (int i = 0; i < tree.length; ++i)
            if (i == 0 || tree[i-1] != tree[i])
                blockLefts.add(i);

        // Add tree.length as a sentinel for convenience
        blockLefts.add(tree.length);

        int ans = 0, i = 0;
        search: while (true) {
            // We'll start our scan at block[i].
            // types : the different values of tree[i] seen
            // weight : the total number of trees represented
            //          by blocks under consideration
            Set<Integer> types = new HashSet();
            int weight = 0;

            // For each block from the i-th and going forward,
            for (int j = i; j < blockLefts.size() - 1; ++j) {
                // Add each block to consideration
                types.add(tree[blockLefts.get(j)]);
                weight += blockLefts.get(j+1) - blockLefts.get(j);

                // If we have 3+ types, this is an illegal subarray
                if (types.size() >= 3) {
                    i = j - 1;
                    continue search;
                }

                // If it is a legal subarray, record the answer
                ans = Math.max(ans, weight);
            }

            break;
        }

        return ans;
    }

}
