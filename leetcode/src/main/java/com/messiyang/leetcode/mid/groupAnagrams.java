package com.messiyang.leetcode.mid;

import java.lang.reflect.Array;
import java.util.*;

/**
 * 字母异位词分组
 *
 * 输入: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
 * 输出: [["bat"],["nat","tan"],["ate","eat","tea"]]
 *
 * @author 【水彧】（【崔杨】  shuiyu.cui@tuya.com）
 * @since 2022/3/9 9:29 下午
 */
public class groupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String str:strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key=String.valueOf(chars);
            if(!map.containsKey(key)){
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(key,list);
            }else{
                map.get(key).add(str);
            }
        }

        return new ArrayList<>(map.values());
    }
}
