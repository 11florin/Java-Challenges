public class AreaCalculator {
    private static final int INVALID_VALUE = -1;
    public static void main(String[] args) {
        System.out.println(area(5));
        System.out.println(area(5, 5));
    }
    /*
     * The method needs to return a double value that represents the area of a circle.
     */
    public static double area(double radius) {
        if (radius < 0) {
            return INVALID_VALUE;
        }
        return radius * radius * Math.PI; 
    }
    /*
     * The method needs to return an area of a rectangle.
     */
    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return INVALID_VALUE;
        }
        return x * y;
    }
}
