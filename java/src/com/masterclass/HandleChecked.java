package com.masterclass;

public class HandleChecked {
    public static void main(String[] args) {
        try {
            System.out.println(divide(10, 0));
        } catch (CustomCheckedException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double divide(int a, int b) throws CustomCheckedException {
        if (b == 0) {
            throw new CustomCheckedException("Cannot be divide by zero");
        }
        return a / b;
    }
}
