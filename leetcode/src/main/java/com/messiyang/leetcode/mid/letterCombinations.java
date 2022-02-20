package com.messiyang.leetcode.mid;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 电话号码的字母组合
 *
 * @author
 * @since 2022/1/21 1:43 下午
 */
public class letterCombinations {
    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<String>();
        if (digits.length() == 0) {
            return combinations;
        }
        Map<Character, String> phoneMap = new HashMap<Character, String>() {{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};
        process(combinations,phoneMap,digits,0,new StringBuffer());
        return combinations;
    }

    /**
     * 具体处理业务
     * @param phoneMap
     * @param digits
     * @return
     */
    public void process(List<String> combinations,Map<Character, String> phoneMap,String digits,int index,StringBuffer combination){
        if (index == digits.length()) {
            combinations.add(combination.toString());
        }else{
            char digit = digits.charAt(index);
            String letters = phoneMap.get(digit);
            int lettersCount = letters.length();
            for (int i = 0; i < lettersCount; i++) {
               combination.append(letters.charAt(i));
               process(combinations, phoneMap, digits, index + 1, combination);
               combination.deleteCharAt(index);
           }

       }
    }
}
