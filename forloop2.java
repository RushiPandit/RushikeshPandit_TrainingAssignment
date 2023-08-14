public class forloop2 {
    // Print 1 to 25 numbers

    class Print1To25 {

        {
            int i;
            for (i = 1; i <= 25; i++) {
                System.out.println(i);
            }
        }
    }

    // Print 25 to 1 numbers

    class Print25To1 {

        {
            int i;
            for (i = 25; i >= 1; i--) {
                System.out.println(i);
            }
        }
    }

    // Print 1 to 100 odd numbers

    class Print1To100OddNumbers {

        {
            int i;
            for (i = 1; i <= 100; i += 2) {
                System.out.println(i);
            }
        }
    }

    // Print 1 to 100 even numbers

    class Print1To100EvenNumbers {

        {
            int i;
            for (i = 2; i <= 100; i += 2) {
                System.out.println(i);
            }
        }
    }

    // Print sum of 1 to 50 odd numbers

    class SumOf1To50OddNumbers {

        {
            int i, sum = 0;
            for (i = 1; i <= 50; i += 2) {
                sum += i;
            }
            System.out.println("Sum of 1 to 50 odd numbers is: " + sum);
        }
    }

    // Print sum of 1 to 50 even numbers

    class SumOf1To50EvenNumbers {

        {
            int i, sum = 0;
            for (i = 2; i <= 50; i += 2) {
                sum += i;
            }
            System.out.println("Sum of 1 to 50 even numbers is: " + sum);
        }
    }

    // Print -45 to +45 numbers

    class PrintNegativeAndPositiveNumbers {

        {
            int i;
            for (i = -45; i <= 45; i++) {
                System.out.println(i);
            }
        }
    }

    // Print 50 to 100 numbers

    class Print50To100Numbers {

        {
            int i;
            for (i = 50; i <= 100; i++) {
                System.out.println(i);
            }
        }
    }

    // Print sum of odd and even numbers

    class SumOfOddAndEvenNumbers {

        {
            int i, oddSum = 0, evenSum = 0;
            for (i = 1; i <= 100; i++) {
                if (i % 2 == 0) {
                    evenSum += i;
                } else {
                    oddSum += i;
                }
            }
            System.out.println("Sum of odd numbers is: " + oddSum);
            System.out.println("Sum of even numbers is: " + evenSum);
        }
    }

    // Print even and odd numbers

    class PrintEvenAndOddNumbers {

        {
            int i;
            for (i = 1; i <= 100; i++) {
                if (i % 2 == 0) {
                    System.out.println("Even number: " + i);
                } else {
                    System.out.println("Odd number: " + i);
                }
            }
        }
    }

    // Print 1 to 100 numbers

    class Print1To100 {

        {
            int i;
            for (i = 1; i <= 100; i++) {
                System.out.println(i);
            }
        }
    }

    // Print 100 to 1 numbers

    class Print100To1 {

        {
            int i;
            for (i = 100; i >= 1; i--) {
                System.out.println(i);
            }
        }
    }

    // Print 30 to 50 numbers

    class Print30To50 {

        {
            int i;
            for (i = 30; i <= 50; i++) {
                System.out.println(i);
            }
        }
    }
    // Use code with caution. Learn more
    // Print count of even No 1 to 25 no.

    class CountOfEvenNumbers1To25 {

        {
            int i, count = 0;
            for (i = 1; i <= 25; i++) {
                if (i % 2 == 0) {
                    count++;
                }
            }
            System.out.println("Count of even numbers from 1 to 25 is: " + count);
        }
    }

    // Print count of odd No 1 to 25 no

    class CountOfOddNumbers1To25 {

        {
            int i, count = 0;
            for (i = 1; i <= 25; i++) {
                if (i % 2 != 0) {
                    count++;
                }
            }
            System.out.println("Count of odd numbers from 1 to 25 is: " + count);
        }
    }
}
