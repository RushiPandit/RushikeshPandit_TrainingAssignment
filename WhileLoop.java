class WhileLoopPrograms {
    public static void main(String[] args) {
        // Program 1: Print 1 to 25 numbers
        int i = 1;
        while (i <= 25) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        // Program 2: Print 25 to 1 numbers
        i = 25;
        while (i >= 1) {
            System.out.print(i + " ");
            i--;
        }
        System.out.println();

        // Program 3: Print 1 to 100 odd numbers
        i = 1;
        while (i <= 100) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();

        // Program 4: Print 1 to 100 even numbers
        i = 2;
        while (i <= 100) {
            System.out.print(i + " ");
            i += 2;
        }
        System.out.println();

        // Program 5: Sum of 1 to 50 odd numbers
        i = 1;
        int oddSum = 0;
        while (i <= 50) {
            if (i % 2 != 0) {
                oddSum += i;
            }
            i++;
        }
        System.out.println("Sum of odd numbers from 1 to 50: " + oddSum);

        // Program 6: Sum of 1 to 50 even numbers
        i = 2;
        int evenSum = 0;
        while (i <= 50) {
            evenSum += i;
            i += 2;
        }
        System.out.println("Sum of even numbers from 1 to 50: " + evenSum);

        // Program 7: Print -45 to +45 numbers
        i = -45;
        while (i <= 45) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        // Program 8: Print 50 to 100 numbers
        i = 50;
        while (i <= 100) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        // Program 9: Sum of odd and even numbers
        i = 1;
        oddSum = 0;
        evenSum = 0;
        while (i <= 100) {
            if (i % 2 != 0) {
                oddSum += i;
            } else {
                evenSum += i;
            }
            i++;
        }
        System.out.println("Sum of odd numbers: " + oddSum);
        System.out.println("Sum of even numbers: " + evenSum);

        // Program 10: Print even and odd numbers
        i = 1;
        while (i <= 100) {
            System.out.print("Even: " + i + " ");
            if (i < 100) {
                i++;
                System.out.print("Odd: " + i + " ");
            }
            i++;
        }
        System.out.println();

        // Rest of the programs follow a similar pattern...
    }
}
