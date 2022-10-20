package com.company;
import java.util.*;
public class GenerateParenthese {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList();
        solve(n, n, n, result, "");
        return result;
    }

    void solve(int n, int open, int close, List<String> result, String str) {
        if(open == 0 && close == 0) {
            result.add(str);
            return;
        }

        if(open > close) {
            return;
        }

        if(open > 0) {
            solve(n, open - 1, close, result, str + "(");
        }
        solve(n, open, close - 1, result, str + ")");
    }
}
