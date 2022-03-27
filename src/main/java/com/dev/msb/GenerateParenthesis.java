package com.dev.msb;

import java.util.*;

public class GenerateParenthesis {
    public static void main(String ags[]) {
//        System.out.println("Hai");
        generateParenthesis(2);
    }

    private static List<String> generateParenthesis(int n) {
        StringBuffer sb = new StringBuffer();
        sb.append("(.".repeat(n)).append(").".repeat(n));
        System.out.println(sb.toString());
        String[] temp = sb.subSequence(0, sb.length() - 1).toString().split("\\.");
        System.out.println("Input : " + Arrays.toString(temp));
        helper(temp, 0);
        return null;
    }

    private static void helper(String[] array, int pos) {
//        System.out.println(Arrays.toString(array));
        if (pos >= array.length - 1) {
            System.out.println(Arrays.toString(array));
//            System.out.print(".. [");
//            for (int i = 0; i < array.length - 1; i++) {
//                System.out.print(array[i] + ", ");
//            }
//            if (array.length > 0)
//                System.out.print(array[array.length - 1]);
//            System.out.println("]");
            return;
        }

        for (int i = pos; i < array.length; i++) {
            String t = array[pos];
            array[pos] = array[i];
            array[i] = t;

            helper(array, pos + 1);

            t = array[pos];
            array[pos] = array[i];
            array[i] = t;
        }
    }

    private static Map<Integer, List<String>> asd = Map.ofEntries(
            Map.entry(1, List.of("()")),
            Map.entry(2, Arrays.asList("(())", "()()")),
            Map.entry(3, Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()")),
            Map.entry(4, Arrays.asList("(((())))", "((()()))", "((())())", "((()))()", "(()(()))", "(()()())", "(()())()", "(())(())", "(())()()", "()((()))", "()(()())", "()(())()", "()()(())", "()()()()"))
    );
}

class GetAllPermutations123 {
    public static void getPermutations(int[] array) {
        helper(array, 0);
    }

    private static void helper(int[] array, int pos) {
        if (pos >= array.length - 1) {
            System.out.print("[");
            for (int i = 0; i < array.length - 1; i++) {
                System.out.print(array[i] + ", ");
            }
            if (array.length > 0)
                System.out.print(array[array.length - 1]);
            System.out.println("]");
            return;
        }

        for (int i = pos; i < array.length; i++) {

            int t = array[pos];
            array[pos] = array[i];
            array[i] = t;

            helper(array, pos + 1);

            t = array[pos];
            array[pos] = array[i];
            array[i] = t;
        }
    }

    public static void main(String args[]) {
        int[] numbers = {1, 9, 4, 3};
        getPermutations(numbers);
    }
}