package week7;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("The grade is:" + GetGrade(78.5));

        System.out.print("The grade is:" + GetGrade(58.5));

    }

    public static char GetGrade(double grade) {
        if (grade >= 90) {
            return 'A';
        }
        else if (grade >= 80) {
            return 'B';
        }
        else if (grade >= 70) {
            return 'C';
        }
        else if (grade >= 60) {
            return 'D';
        }
        else{
            return 'F';
        }
    }
}
