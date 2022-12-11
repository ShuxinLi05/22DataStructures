package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] str = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(str));
	// write your code here
    }

    public static ArrayList<ArrayList<String>> groupAnagrams(String[] str){
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for (String s: str ) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String words = String.valueOf(ch);
            ArrayList<String> list = new ArrayList<>();
            if (!map.containsKey(words)){
                list.add(s);
                map.put(words,list);
            } else {
                ArrayList<String> val = map.get(words);
                val.add(s);
                map.put(words, val);
            }
        }
        for (ArrayList arr: map.values()) {
            result.add(arr);
        }
        return result;

    }
}
