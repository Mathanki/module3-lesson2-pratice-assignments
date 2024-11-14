package com.perscholas.java_basics;
import java.text.DecimalFormat;

public class PraticeAssignmentCoreJavaVariables {
    public static void main(String[] args) {
        /*
        Write a program that declares two integer variables, assigns an integer to each,
         and adds them together. Assign the sum to a variable. Print out the result.
         */
        System.out.println("=========================================================");
        int number1 = 5;
        int number2 = 10;
        System.out.println("Sum of numbers " + number1 + " + " + number2 + " = " + (number1 + number2));

        /*
        Write a program that declares two double variables, assigns a number to each,
        and adds them together. Assign the sum to a variable. Print out the result.
         */
        System.out.println("=========================================================");
        double number3 = 5.5;
        double number4 = 10.2;
        System.out.println("Sum of numbers " + number3 + " + " + number4 + " = " + (number3 + number4));

        /*
        Write a program that declares an integer variable and a double variable,
        assigns numbers to each, and adds them together. Assign the sum to a variable.
         Print out the result. What variable type must the sum be?
         */
        System.out.println("=========================================================");
        System.out.println("Sum int and double values:");
        double sum = number1 + number3;
        System.out.println("Sum of numbers " + number1 + " + " + number3 + " = " + sum);

        int num1 = 10;
        int num2 = 3;
        // Determine the larger and smaller number
        int larger = Math.max(num1, num2);
        int smaller = Math.min(num1, num2);
        // Perform the division and store the result
        int result = larger / smaller;
        // Print the result
        System.out.println("Integer division result: " + result);

        /*
        Write a program that declares two integer variables, assigns an integer to each,
        and divides the larger number by the smaller number. Assign the result to a variable.
        Print out the result. Now change the larger number to a decimal. What happens? What corrections are needed?
         */
        System.out.println("=========================================================");
        double largerNum = 10.0;  // Changed to a decimal (double)
        double resultOfDouble = largerNum / smaller;
        System.out.println("Floating-point division result: " + resultOfDouble);
        double resultCorrect = (double) largerNum / smaller;
        System.out.println("Correct result: " + resultCorrect);

        /*
        Write a program that declares two double variables, assigns a number to each,
        and divides the larger by the smaller number. Assign the result to a variable. Print out the result.
        Now, cast the result to an integer. Print out the result again.
         */
        System.out.println("=========================================================");
        System.out.println("devide 2 double numbers");
        double largeDoubleNum = Math.max(number3, number4);
        double smallerDoubleNum = Math.min(number3, number4);
        int resultOfdouble = (int) (largeDoubleNum / smallerDoubleNum);
        System.out.println("Division 2 double num and cast it to int: " + resultOfdouble);

        /*
        Write a program that declares two integer variables, x and y, and assigns the number 5
         to x and the number 6 to y. Declare a variable q and assign y/x to it and print q. Now,
         cast y to a double and assign it to q. Print q again.
         */
        System.out.println("=========================================================");
        // Declare integer variables x and y, and assign values
        int x = 5;
        int y = 6;
        // Declare variable q and perform integer division y / x
        int q = y / x;
        // Print the result of integer division
        System.out.println("Integer division result (y / x): " + q);
        // Cast y to a double and perform division, then assign to q as a double
        double qDouble = (double) y / x;
        // Print the result of division with y cast to double
        System.out.println("Division result with y cast to double: " + qDouble);

        /*
        Write a program that declares a named constant and uses it in a calculation. Print the result.
         */
        System.out.println("=========================================================");
        final double TAX_RATE = 0.07;
        double itemPrice = 50.00;
        System.out.println("Tax Amount: $" +  (itemPrice * TAX_RATE));

        /*
        Write a program where you create three variables that represent products at a cafe.
        The products could be beverages like coffee, cappuccino, espresso, green tea, etc.
        Assign prices to each product. Create two more variables called subtotal and totalSale and
        complete an “order” for three items of the first product, four items of the second product,
        and two items of the third product. Add them all together to calculate the subtotal.
        Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount.
         Be sure to format the results to two decimal places
         */
        System.out.println("=========================================================");
        // Declare product prices
        double coffeePrice = 3.50;
        double cappuccinoPrice = 4.25;
        double espressoPrice = 2.75;
        double greenTeaPrice = 1.75;
        // Constants
        final double SALES_TAX = 0.07; // 7% sales tax
        // Order quantities
        int coffeeQuantity = 3;
        int cappuccinoQuantity = 4;
        int espressoQuantity = 2;
        int greenTeaQuantity = 3;

        // Calculate subtotal
        double subtotal = (coffeePrice * coffeeQuantity) + (cappuccinoPrice * cappuccinoQuantity) +
                          (espressoPrice * espressoQuantity) + (greenTeaPrice * greenTeaQuantity);
        // Calculate total sale by adding sales tax
        double totalSale = subtotal + (subtotal * SALES_TAX);
        // Format the results to two decimal places
        DecimalFormat df = new DecimalFormat("#.00");
        // Output results
        System.out.println("Subtotal: $" + df.format(subtotal));
        System.out.println("Total Sale (including sales tax): $" + df.format(totalSale));


    }
}