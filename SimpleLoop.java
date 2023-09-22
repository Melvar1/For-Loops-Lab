import  java.util.Scanner;

public class SimpleLoop {
    public static void main(String[] args) {
        int n = 99;

        System.out.println("Number 1: A loop that will display a string 99 times: ");
        // A loop that will display a string 99 times
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
            System.out.println("Java is fun");
        }
            System.out.println(" ");


        System.out.println("Number 2: A loop that will display every odd number from 0 to 99: ");
         // A loop that will display every odd number from 0 to 99
           for (int i = 1; i <= 99; i += 2) {
            System.out.println(i);
        }
            System.out.println(" ");


        System.out.println("Number 3: A loop that will display every even number from 0 to 99: ");
          // A loop that will display every even number from 0 to 99
           for (int i = 0; i <= 99; i+= 2) {
            System.out.println(i);
        }
            System.out.println(" ");

        
        System.out.println("Number 4: the same loop as 3, but in a different ways: ");
         // the same loop as 3, but in a different ways
          for (int i = 0; i != 100; i+= 2) {
            System.out.println(i);
        }
            System.out.println(" ");


        System.out.println("Number 5: A loop that will sum up the odd numbers from 0 to 99 and print it at the end: ");
        // A loop that will sum up the odd numbers from 0 to 99 and print it at the end.
          int sum = 0;
          for (int i = 1; i <= 99; i+= 2) {
            sum += i;
        }
            System.out.println("The sum of the odd numbers from 0 to 99 is: " + sum);
            System.out.println(" ");


        System.out.println("Number 6: A loop that will sum up the even numbers from 0 to 99 and print it at the end: ");
        // A loop that will sum up the even numbers from 0 to 99 and print it at the end
          for (int i = 0; i <= 99; i+= 2) {
            sum += i;
        }
            System.out.println("The sum of the evens numbers from 0 to 99 is: " + sum);
            System.out.println(" ");


        System.out.println("Number 7: A loop that finds a sum of the numbers between two numbers that are given by the user, inclusive: ");
        // A loop that finds a sum of the numbers between two numbers that are given by the user, inclusive
          Scanner scanner = new Scanner(System.in);

          System.out.println("Input a whole number: ");
          int num1 = scanner.nextInt();

          System.out.println("Input another whole number: ");
          int num2 = scanner.nextInt();
        
          //if loops that checks if num1 is bigger than num2- if so, we switch the values to make sure the smaller number goes first in for loop
          if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
          }

          sum = 0;

          for (int i = num1; i <= num2; i++) {
            sum += i;
        }
            System.out.println("The sum of the numbers between and including " + num1 + " and " + num2 + " = " + sum);
        

        scanner.close();

       
    }
}


