package org.launchcode;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Enter the values for x : ");
        int xValue = input.nextInt();
        System.out.println("Enter the values for y : ");
        int yValue = input.nextInt();
        input.close();

        Divide(xValue,yValue);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!

        System.out.println(CheckFileExtension(""));
    }

    public static void Divide(int x, int y)
    {
        // Write code here!
        int result;
        try {

            if (y == 0) {
                throw new ArithmeticException("Value of y can not be zero!");
            } else {
                result = x / y;
                System.out.println("Result is : " + result);
            }
        }
        catch (ArithmeticException e) {
            e.printStackTrace();
        }



    }

    public static int CheckFileExtension(String fileName) {
        // Write code here!
        int numberOfPointRecieved = 0;

            try {

                if (fileName.contains(".java")) {
                    numberOfPointRecieved = 1;
                } else if (fileName != ".java") {
                    numberOfPointRecieved = 0;
                } else if (fileName.contains("")) {
                    numberOfPointRecieved = -1;
                    throw new NullPointerException("File should be in .java format");
                }
            }
                catch (NullPointerException e) {
                e.printStackTrace();
            }
        return numberOfPointRecieved;
    }
}