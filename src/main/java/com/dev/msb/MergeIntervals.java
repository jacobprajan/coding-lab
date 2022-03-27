package com.dev.msb;

import java.util.ArrayList;

public class MergeIntervals {

    public static void main(String[] args) {
        ArrayList<Pair> v = new ArrayList<Pair>();

        v.add(new Pair(1, 5));
        v.add(new Pair(3, 7));
        v.add(new Pair(4, 6));
        v.add(new Pair(6, 8));
        v.add(new Pair(10, 12));
        v.add(new Pair(11, 15));

        ArrayList<Pair> result = mergeIntervals(v);

        for (int i = 0; i < result.size(); i++) {
            System.out.print(String.format("[%d, %d] ", result.get(i).first, result.get(i).second));
        }
    }

    static ArrayList<Pair> mergeIntervals(ArrayList<Pair> v) {
        ArrayList<Pair> result = new ArrayList<Pair>();



        return result;
    }
}

class Pair {
    public int first;
    public int second;

    public Pair(int x, int y) {
        this.first = x;
        this.second = y;
    }
}