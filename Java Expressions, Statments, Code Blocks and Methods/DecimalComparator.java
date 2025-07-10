public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(1.1235, 1.1237));
    }
    /*
     * The method should return boolean and it needs to return true if two double numbers are the same up to 
     * three decimal places. Otherwise, return false.
     */
    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {
        long firstRouded = (long) (first * 1000);
        long secondRounded = (long) (second * 1000);
        
        return firstRouded == secondRounded;
    }
}
