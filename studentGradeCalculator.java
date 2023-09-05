import java.util.*;

public class studentGradeCalculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subject: ");

        int numSubjects = sc.nextInt();
        int totalMarks = 0;

        for (int i = 1; i < numSubjects; i++) {
            System.out.println("Enter marks obtained in subject " + i + ":");
            int marks = sc.nextInt();
            totalMarks += marks;
        }
        double averagePercentage = (double) totalMarks / (numSubjects * 100) * 100;
        System.out.println("Total marks obtained:" + totalMarks);
        System.out.println("Average percentage:" + averagePercentage);
        System.out.println("Grade:");

        if (averagePercentage >= 90) {
            System.out.println("A+");
        } else if (averagePercentage >= 80) {
            System.out.println("B");
        } else if (averagePercentage >= 70) {
            System.out.println("C");
        } else if (averagePercentage >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}