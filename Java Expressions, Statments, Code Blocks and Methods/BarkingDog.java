public class BarkingDog {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 7));
    }
    /*
    hourOfDay and has a valid range of 0-23.
    We have to wake up if the dog is barking before 8 or after 22 hours so in that case return true.
    In all other cases return false.
     */ 
    public static boolean shouldWakeUp(boolean barking, int houOfDay) {
         if (houOfDay < 0 || houOfDay > 23) {
             return false;
         }
         return barking && (houOfDay < 8 || houOfDay > 22);
     }
}
