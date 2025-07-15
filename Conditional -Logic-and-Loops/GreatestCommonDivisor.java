public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatesCommonDivisor(25, 15));
        System.out.println(getGreatesCommonDivisor(12, 30));
        System.out.println(getGreatesCommonDivisor(9, 18));
        System.out.println(getGreatesCommonDivisor(81, 153));
    }
    //The method should return the greatest common divisor of the two numbers (int).

    public static int getGreatesCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int min = first < second ? first : second;
        int gcd = 1;
        for (int i = 1; i <= min; i++) {
            if (first % i == 0 && second % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
