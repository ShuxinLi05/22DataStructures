package com.company;


import java.util.ArrayList;
import java.util.List;

public class LetterCombination {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits.length() == 0) return result;
        String[] digitLetter = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        result.add("");

        for(int i=0; i<digits.length();i++){
            result = combination(digitLetter[digits.charAt(i)-'0'], result);
        }
        return result;

    }

    public List<String> combination(String digits, List<String> list){
        List<String> result = new ArrayList<String>();

        for(int i=0; i<digits.length(); i++){
            for(String x:list){
                result.add(x+digits.charAt(i));
            }
        }
        return result;

    }
}
