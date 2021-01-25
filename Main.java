import java.util.Scanner;
// (hello.class) Byte Code --> Java Virtual MAchine --> Native Code

// void means function will not return anything
// javac hello.java -- to complile java file
// java hello -- to run

/**
 * hello
 */

public class Main {
    public static void main(String[] args) {
        // Point point1 = new Point(x:1,y:1);
        // Point point2 = point1;
        // point1.x = 2;
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        // FIZZBUZZ
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Number: ");
        // int number = scanner.nextInt();

        // if (number % 3 == 0 && number % 5 == 0) {
        // System.out.println("Fizzbuzz");
        // } else if (number % 5 == 0) {
        // System.out.println("Buzz");
        // } else if (number % 3 == 0) {
        // System.out.println("Fizz");
        // } else
        // System.out.println(number);
        // }

        // FOR LOOP
        // use for loops if you know how many times you need to do something
        // for (int i = 0; i< 5;i++) {
        // System.out.println("Hello World");
        // }

        // WHILE LOOP
        // use if you do not know how many times
        Scanner scanner = new Scanner(System.in);
        String input = "";
        // while (!input.equals("quit")) {
        // System.out.print("Input: ");
        // input = scanner.next().toLowerCase();
        // System.out.println(input);
        // }

        // DO
        do {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        } while (!input.equals("quit"));
    }
}

// primitive types vs reference types (stores reference to object)
//