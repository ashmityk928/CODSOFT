import java.util.*;

class Student {
    String name;
    int roll;
    String grade;

    Student(String name, int roll, String grade) {
        this.name = name;
        this.roll = roll;
        this.grade = grade;
    }
}

public class StudentManagementSystem {
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void addStudent() {
        System.out.print("Enter name: ");
        String name = sc.next();

        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();

        System.out.print("Enter grade: ");
        String grade = sc.next();

        students.add(new Student(name, roll, grade));
        System.out.println("✅ Student Added!");
    }

    public static void displayStudents() {
        for (Student s : students) {
            System.out.println("Name: " + s.name + ", Roll: " + s.roll + ", Grade: " + s.grade);
        }
    }

    public static void searchStudent() {
        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();

        for (Student s : students) {
            if (s.roll == roll) {
                System.out.println("Found: " + s.name);
                return;
            }
        }
        System.out.println("❌ Not found!");
    }

    public static void removeStudent() {
        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();

        students.removeIf(s -> s.roll == roll);
        System.out.println("Removed if existed.");
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n📚 Student Management");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1: addStudent(); break;
                case 2: displayStudents(); break;
                case 3: searchStudent(); break;
                case 4: removeStudent(); break;
                case 5: System.exit(0);
                default: System.out.println("Invalid choice!");
            }
        }
    }
}
