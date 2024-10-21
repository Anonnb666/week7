package week7;

public class Task6 {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Before the call, x is " + x);
        increment(x);
        System.out.println("after the call, x is " + x);
    }

    public static void increment(int i) {
        i++;
        System.out.println("n inside the method is " + i);
    }
}
