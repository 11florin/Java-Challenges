public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
    }
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        for (int i = number; i > 0; i /= 10) {
            int lastDigit = i % 10;
            //System.out.println("i = " + i + ", lastDigit = " + lastDigit);
            if (lastDigit % 2 == 0) {
                sum += lastDigit;
            }
            // System.out.println();
            // System.out.println("i = " + i + " sum = " + sum);
        }

        // -- Alternative using while loop --
        // while (number > 0) {
        //     int lastDigit = number % 10;
        //     if (lastDigit % 2 == 0) {
        //         sum += lastDigit;
        //     }
        //     number /= 10;
        // }
        return sum;
    }
}
