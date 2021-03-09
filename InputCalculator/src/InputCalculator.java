import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();

    }
    public static void inputThenPrintSumAndAverage() {
            Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while(true) {
            boolean isInt = scanner.hasNextInt();
            if (!isInt) {
                if (count == 0) {
                    count = 1;
                }

                long avg = Math.round((double)sum / (double)count);
                System.out.println("SUM = " + sum + " AVG = " + avg);
                scanner.close();
                return;
            }

            int number = scanner.nextInt();
            sum += number;
            count++;
            scanner.nextLine();
        }
    }
}
