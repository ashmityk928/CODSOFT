import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks for Subject 1: ");
        int s1 = sc.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        int s2 = sc.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        int s3 = sc.nextInt();

        System.out.print("Enter marks for Subject 4: ");
        int s4 = sc.nextInt();

        System.out.print("Enter marks for Subject 5: ");
        int s5 = sc.nextInt();

        int total = s1 + s2 + s3 + s4 + s5;
        double average = total / 5.0;

        char grade;

        if (average >= 90)
            grade = 'A';
        else if (average >= 80)
            grade = 'B';
        else if (average >= 70)
            grade = 'C';
        else if (average >= 60)
            grade = 'D';
        else
            grade = 'F';

        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
