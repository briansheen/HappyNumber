package com.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }

    public static boolean isHappy(int n) {
        if (n < 0) {
            return false;
        }   
        Set<Integer> nSet = new HashSet<>();
        List<Integer> nList = new ArrayList<>();
        while(nSet.add(n)){
            while (n != 0) {
                nList.add(n % 10);
                n /= 10;
            }
            for (Integer i : nList) {
                n += Math.pow(i, 2);
            }
            if(n==1){
                return true;
            }
            nList.clear();
        }
        return false;
    }
}
