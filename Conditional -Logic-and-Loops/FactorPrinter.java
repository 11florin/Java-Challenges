public class FactorPrinter {
    public static void main(String[] args) {
        //printFactors(6);
        printFactors(32);
        // printFactors(10);
        // printFactors(-1);
    }
    //The method should print all factors of the number.
    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Inavlid Value");
        }

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
