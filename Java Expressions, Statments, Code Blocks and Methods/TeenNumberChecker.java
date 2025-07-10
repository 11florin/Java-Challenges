public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(13, 16, 15));
    }
    /*
     * The method should return boolean and it needs to return true if one of the 
     * parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return false.
     */
    public static boolean hasTeen(int a, int b, int c) {
        return isTeen(a) || isTeen(b) || isTeen(c);
    }
    public static boolean isTeen(int number) {
        return number > 12 && number < 20;
         
    }
}
