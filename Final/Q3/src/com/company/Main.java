package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String s = "lee(t(c)o)de)";
        System.out.println(validString(s));
	// write your code here
    }

    public static String validString(String s){
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> index = new ArrayList<>();
        int length = s.length();
        for (int i=0; i<length; i++){
            if (s.charAt(i) == '('){
                stack.push(i);
            } else if (s.charAt(i) == ')'){
                stack.pop();
            }
        }
        while (!stack.isEmpty()){
            index.add(stack.pop());
        }
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<s.length();i++){
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }

}
