public class BarkingDog {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 7));
    }
    public static boolean shouldWakeUp(boolean barking, int houOfDay) {
         if (houOfDay < 0 || houOfDay > 23) {
             return false;
         }
         return barking && (houOfDay < 8 || houOfDay > 22);
     }
}
