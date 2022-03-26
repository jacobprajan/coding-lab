package com.dev.jac;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        String leftPar = "(";
        String rightPar = ")";

        int count = 0;

        String res = "";
        while(count < n) {
            res += leftPar+rightPar;
            result.add(count, res);
            count++;
        }
        return result;
    }

}
