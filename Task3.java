package week7;

public class Task3 {
    public static void main(String[] args) {
        System.out.print("The grade is:");
        printGrade(78.5);
        System.out.print("The grade is:");
        printGrade(58.5);
    }

    public static void printGrade(double grade) {
        if (grade >= 90) {
            System.out.print("A");
        }
        else if (grade >= 80) {
            System.out.print("B");
        }
        else if (grade >= 70) {
            System.out.print("C");
        }
        else if (grade >= 60) {
            System.out.print("D");
        }
        else{
            System.out.print("F");
        }
    }
}
