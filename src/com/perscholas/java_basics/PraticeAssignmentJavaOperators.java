package com.perscholas.java_basics;

public class PraticeAssignmentJavaOperators {
    public static void main(String[] args) {

        System.out.println("=======================question1==================================");
        question1();
        System.out.println("====================question2=====================================");
        question2();
        System.out.println("==================question3=======================================");
        question3();
        System.out.println("==================question4=======================================");
        question4();
        System.out.println("==================question5=======================================");
        question5();
        System.out.println("==================question6=======================================");
        question6();
        System.out.println("==================question7=======================================");
        question7();

    }

    /*
   Write a program that declares an integer a variable x, assigns the value 2 to it, and prints out the binary
   string version of the number ( Integer.toBinaryString(x) ). Now, use the left shift operator (<<)
   to shift by 1 and assign the result to x. Before printing the results, write a comment with the predicted
   decimal value and binary string. Now, print out x in decimal form and in binary notation.
   Perform the preceding exercise with the following values:
   9
   17
   88
    */
    public static void question1() {
        int x = 2;
        System.out.println(Integer.toBinaryString(x));
        x <<= 1;
        //predicted decimal  : 100
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        System.out.println();

        int y = 9;
        System.out.println(Integer.toBinaryString(y));
        y <<= 1;
        //predicted decimal  : 10010
        System.out.println(y);
        System.out.println(Integer.toBinaryString(y));
        System.out.println();

        int z = 17;
        System.out.println(Integer.toBinaryString(z));
        z <<= 1;
        //predicted decimal  : 100010
        System.out.println(z);
        System.out.println(Integer.toBinaryString(z));
        System.out.println();

        int v = 88;
        System.out.println(Integer.toBinaryString(v));
        v <<= 1;
        //predicted decimal  : 10110000
        System.out.println(v);
        System.out.println(Integer.toBinaryString(v));
        System.out.println();

    }

    /**
     * Write a program that declares a variable x, and assigns 150 to it, and prints out the
     * binary string version of the number. Now use the right shift operator (>>)
     * to shift by 2 and assign the result to x. Write a comment indicating what you
     * anticipate the decimal and binary values to be. Now print the value of x and the binary string.
     * Perform the preceding exercise with the following values:
     * 225
     * 1555
     * 32456
     */
    public static void question2() {
        int x = 150;
        System.out.println(Integer.toBinaryString(x));
        x >>= 2;
        //predicted decimal  : 100101
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        System.out.println();

        int a = 225;
        System.out.println(Integer.toBinaryString(a));
        a >>= 2;
        //predicted decimal  : 111000
        System.out.println(a);
        System.out.println(Integer.toBinaryString(a));
        System.out.println();

        int b = 1555;
        System.out.println(Integer.toBinaryString(b));
        b >>= 2;
        //predicted decimal  : 110000100
        System.out.println(b);
        System.out.println(Integer.toBinaryString(b));
        System.out.println();

        int c = 32456;
        System.out.println(Integer.toBinaryString(c));
        c >>= 2;
        //predicted decimal  : 1111110110010
        System.out.println(c);
        System.out.println(Integer.toBinaryString(c));
        System.out.println();
    }

    /**
     * Write a program that declares three int variables: x, y, and z. Assign 7 to x and 17 to y.
     * Write a comment that indicates what you predict will be the result of the bitwise and operation
     * on x and y. Now use the bitwise AND (&) operator to derive the decimal and binary values, and assign
     * the result to z.
     */
    public static void question3() {
        int x = 7; // Binary: 0000011
        int y = 17; // Binary: 00010001
        // Predicted result of x & y: 1 (Binary: 00000001)
        int z = x & y;
        // Convert z to binary string
        String binaryString = Integer.toBinaryString(z);
        System.out.println("Binary representation of z: " + binaryString);
    }

    /**
     * Now, with the preceding values, use the bitwise and operator to calculate the “or”
     * value between x and y. As before, write a comment that indicates what you predict the values
     * to be before printing them out.
     */
    public static void question4() {
        int x = 7; // Binary: 0000011
        int y = 17; // Binary: 00010001
        // Predicted result of x | y: 1 (Binary: 10111)
        int z = x | y;
        String binaryString = Integer.toBinaryString(z);
        System.out.println("Binary representation of z: " + binaryString);

    }

    /**
     * Write a program that declares an integer variable, assigns a number,
     * and uses a postfix increment operator
     * to increase the value. Print the value before and after the increment operator.
     */
    public static void question5() {
        int number = 10;
        System.out.println("Value before increment: " + number);
        // Postfix increment
        number++;
        System.out.println("Value after increment: " + number);
    }

    /**
     * Write a program that demonstrates at least three ways to increment a variable by
     * 1 and does this multiple times. Assign a value to an integer variable, print it,
     * increment by 1, print it again, increment by 1, and then print it again.
     */
    public static void question6() {
        int num = 6;
        // Method 1: Postfix increment
        System.out.println("Postfix increment:");
        System.out.println("Initial value: " + num);
        num++;
        System.out.println("Value after postfix increment: " + num);
        num++;
        System.out.println("Value after another postfix increment: " + num);
        System.out.println("Value after another postfix increment on same line  like  num++: " +  num++);
        System.out.println("Value after postfix increment in next line : " + num);

        // Method 2: Prefix increment
        System.out.println("\nPrefix increment:");
        num = 6; // Reset the value
        System.out.println("Initial value: " + num);
        ++num;
        System.out.println("Value after prefix increment: " + num);
        ++num;
        System.out.println("Value after another prefix increment: " + num);
        System.out.println("Value after another Prefix increment on same line like  ++num : " +  ++num);
        System.out.println("Value after postfix increment in next line : " + num);

        // Method 3: Addition assignment
        System.out.println("\nAddition assignment:");
        num = 6; // Reset the value
        System.out.println("Initial value: " + num);
        num += 1;
        System.out.println("Value after addition assignment: " + num);
        num += 1;
        System.out.println("Value after another addition assignment: " + num);

    }

    /**
     * Write a program that declares two integer variables: x, and y, and then assigns 5 to x and 8 to y.
     * Create another variable sum and assign the value of ++x added to y, and print the result.
     * Notice the value of the sum (should be 14). Now change the increment operator to postfix (x++)
     * and re-run the program. Notice what the value of the sum is. The first configuration incremented x,
     * and then calculated the sum, while the second configuration calculated the sum, and then incremented x.
     */
    public static void question7() {
        int x = 5;
        int y = 8;

        // Prefix increment: x is incremented before addition
        int sum1 = ++x + y;
        System.out.println("Sum with prefix increment: " + sum1); // Output: 14

        // Reset x
        x = 5;

        // Postfix increment: x is incremented after addition
        int sum2 = x++ + y;
        System.out.println("Sum with postfix increment: " + sum2); // Output: 13
    }
}
