package com.masterclass;

public class Exceptions {
    public static void main(String[] args) {
        //Working with Exceptions
        try {
            int number = Integer.parseInt("1x");
            System.out.println(number);

            for(int i = 10; i >= 0; i--) {
                System.out.println(10 / i); //Will throw exception bcoz number cannot be divided by 0
            }
            System.out.println("Program End");
        } catch (NumberFormatException | ArithmeticException e) { //Combine multiple exception within one catch block
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) { //Handle all kind exception if we don't know which exception will throw
            System.out.println("ALl Exception Error: " + e.getMessage());
        } finally {
            System.out.println("Finally always run either on error or non error");
        }

        /*catch (NumberFormatException | ArithmeticException e) { //Combine multiple exception within one catch block
            System.out.println("Error: " + e.getMessage());
        }*/

        /* // Multiple Catch Block
        catch (NumberFormatException e) {
            System.out.println("Failed to parse number: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }*/
    }
}
