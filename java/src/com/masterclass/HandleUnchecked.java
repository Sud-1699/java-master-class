package com.masterclass;

public class HandleUnchecked {
    public static void main(String[] args) {
        System.out.println(divide(10, 0));
    }

    public static double divide(int a, int b) {
        if(b == 0) {
            throw new CustomUncheckedException("Cannot be divide by zero");
        }
        return a / b;
    }
}
