package com.willburke;


import java.text.NumberFormat;
import java.text.NumberFormatl
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        int principal = 0;
        float monthlyInterest = 0;
        int numberOfPayments = 0;

        Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.print("Principal: ");
                principal = scanner.nextInt();
                if (principal >= 1000 && principal <= 1_000_000 );
                    break;
                System.out.println("Enter a value between 1000 and 1000000");
            }
            while (true) {
                System.out.print("Annual Interest Rate: ");
                float annualInterest = scanner.nextFloat();
                if (annualInterest >= 1 && annualInterest <= 30) {
                    monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
                    break;
                }
                System.out.println("Enter a value  between 1 and 30");


            }

            while (true) {
                System.out.println("Period (Years): ");
                byte years = scanner.nextByte();
                if (years >= 1 && years <= 30) {
                    numberOfPayments = years * MONTHS_IN_YEAR;
                    break;
                }
                System.out.println("Enter a value between 1 and 30");

            }
           
                double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments ))
                / (Math.pow(1 + monthlyInterest, numberOfPayments));

                String mortgageFormatted = NumberFormat.getCurrencyInstance();
                System.out.println("Mortgage: " + mortgageFormatted);

    }
}

//For Each
// if you need index, use for loop
//ohterwise, use for loop
//for vs foreach example
//String[] fruits = {"Apple", "Mango", "Orange"};
//
//       for(int i = fruits.length; i > 0; i--)
//               System.out.println(fruits[i]);
//
//               for (String fruit : fruits)
//               System.out.println(fruit);



//while loops

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String input = "";
//        while (!input.equals("quit")) {
//            System.out.println("Input: ");
//            input = scanner.next().toLowerCase();
//            if (!input.equals("quit"))
//                System.out.println(input);
//        }
//    }

//      Scanner scanner = new Scanner(System.in);
//        String input = "";
//        while (!input.equals("quit")) {
//            System.out.println("Input: ");
//            input = scanner.next().toLowerCase();
//            System.out.println(input);
//        }

//For Loop
//similar to JS
// for(int i = 0; i < 5; i++)
//        System.out.println("Hello World");
// for(int i = 0; i < 5; i++)
//            System.out.println("Hello World " + i);

//Fizzbuzz
//Scanner scanner = new Scanner(System.in);
//        System.out.print("Number: ");
//                int number = scanner.nextInt();
//
//                if (number % 5 == 0 && number % 3 == 0)
//                System.out.println("FizzBuzz");
//                else if (number % 3 == 0)
//                System.out.println("Buzz");
//                else if(number % 5 == 0)
//                System.out.println("Fizz");
//                else
//                System.out.println(number);
//                }

//    String role = "admindfdfdfd";
//
//        switch (role) {
//                case "admin":
//                System.out.println("ADMIN");
//                break;
//
//                case "moderator":
//                System.out.println("MODDDDD");
//                break;
//
//default:
//        System.out.println("you are guest");


//        if (role == "admin")
//            System.out.println("You're an admin");
//        else if (role == "moderator")
//            System.out.println("You are the moderator");
//        else
//            System.out.println("you are the guest");



//ternary example
//int income = 120_000;
//    String className = income > 100_000 ? "First" : "Economy";


//conditionals
//int temp = 7;
//        if(temp > 30) {
//                System.out.println("it's hot outside!");
//                System.out.println("drink water!");
//                }
//                else if( temp > 20)
//                System.out.println("Beautiful day");
//                else
//                System.out.println("cold day");
//
//                }


// Boolean
//int x = 2;
//    int y = 2;
//        System.out.println(x == y);


//Mortgage calculator
//final byte MONTHS_IN_YEAR = 12;
//    final byte PERCENT = 100;
//
//    Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Let's figure out the mortgage rate!");
//                System.out.println("Principal: ");;
//                int principal = scanner.nextInt();
//
//                System.out.print("Annual Interest Rate: ");
//                float annualInterest = scanner.nextFloat();
//                float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
//
//                System.out.println("Period (Years): ");
//                byte years = scanner.nextByte();
//                int numberOfPayments = years * MONTHS_IN_YEAR;
//
//                double mortgage = principal
//                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments ))
//                / (Math.pow(1 + monthlyInterest, numberOfPayments));

//  Scanner scanner = new Scanner(System.in);
//        System.out.println("Name: ");
//        String name = scanner.nextLine().trim();
//        System.out.println("You are " + name);
// NumberFormat percent = NumberFormat.getPercentInstance();
//        String result = percent.format(0.1);
//        System.out.println(result); prints 10%

//Math Class//
//.max()
//.min()
//.random() random number 0 - 1, can call Math.round(Math.random() * 100) to get random 1-100;



//explicit casting
//double x = 1.1;
//    int y = (int)x + 2; // 2.0
//        System.out.println(y); //prints 3

//integer less pecise than double
// Implicit casting
// byte > short > int > long > float > double



//arithmatic expressions
//follow order of operations
// (), /*. +-

// x = x + 2; is that same thing as x += 2;

//    double result = (double)10 / (double)3;
//        System.out.println(result);

// final makes it a final varialble or constant

//Arrays

//    int[][] numbers = {{1, 2, 3}, {4, 5, 6}};
//
//        System.out.println((Arrays.deepToString(numbers)));

// prints [[1, 2, 3], [4, 5, 6]]

//deepToString multidimentional
// have a fixed length
//    int[] numbers = {2, 3, 5, 6, 4};
//        Arrays.sort(numbers);
//
//
//        System.out.println(Arrays.toString(numbers));

//Escape Sequences
// \ to escape
// String message = "c:\\Windows\\..."; prints c:\Windows\...
// String message = "c:\nWindows\\..."; prints c:  (line break)
//                                              Windows\

// \n line break and \t for tab

//Strings
//.length()
//.endsWith()
//.replace()
//.startsWith()
//.trim()
//any methods that modify a string will not mutate original string

//Points
//Point point1 = new Point(1,1);
//    Point point2 = point1;
//        point1.x = 2;
//                System.out.println(point2);


// Reference Type example
//    byte age = 30;
//
//    Date now = new Date();
//        System.out.println(now);


//primitive Type example
//        long viewsCount = 3_123_456_789L; //can use _ to make int more readable
//                                            //use L to declare a long variable
//        float price = 10.99F; //F suffix to make it a float
//        char letter = 'A'; //single characters with '', strings with ""
//        boolean isEligible = false;
//	    System.out.println(age);
