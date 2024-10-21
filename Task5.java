package week7;

public class Task5 {
    public static void main(String[] args) {
        nPrintln("Welcome to Java",5);
        nPrintln(15,"Computer Science");
    }
    public static void nPrintln(String str, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }
}
