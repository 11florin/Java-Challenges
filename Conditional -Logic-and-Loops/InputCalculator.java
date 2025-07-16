import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner (System.in);
        int sum = 0;
        int count = 0;
        long avg = 0;
        
        System.out.println("Please enter numbers");
        System.out.println("To stop it please press a letter");
        while (true) {
            boolean hasNextInt = scanner.hasNextInt();
            if (!hasNextInt) {
                break;
            }
            sum += scanner.nextInt();
            count++;
            scanner.nextLine();
        }
        if (count > 0) {
            avg = Math.round((double) sum / count); 
        }
        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }
}
