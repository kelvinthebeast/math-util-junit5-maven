package com.nhanthanhle.matutil.core;

public class MathUtil {
    public static void main(String[] args) {
        
    }
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) throw new IllegalArgumentException("N must be between 0 and 20...");
        if (n <= 1) return 1;
        return n * getFactorial(n - 1); // de quy: ham goi lai chinh no voi 1 quy mo nho hon
    }
}