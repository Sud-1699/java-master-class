package com.masterclass;

public class Methods {

    /*
    Step to build method
    - Access Modifier
    - Optional Static
    - Return type
    - Name
    - Optional Parameter
    - Method Body
    - Optional Return value
    */
    public static void main(String[] args) {
        int result1 = add(10, 10);
        int result2 = add(10, 50);
        System.out.println(result1);
        System.out.println(result2);
        displayName();
        isAdult(16);
        isAdult(15);
    }

    private static int add(int n1, int n2) {
        int result = n1 + n2;
        return  result;
    }

    private static void displayName() {
        System.out.println("Xyz");
    }

    private static void isAdult(int age) {
        if(age >= 16) {
            System.out.println("Adult");
        } else {
            System.out.println("Not Adult");
        }
    }

}
