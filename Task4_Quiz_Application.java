import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.println("Simple Quiz Application\n");

        System.out.println("1. Which language is used for Android development?");
        System.out.println("A. Java  B. Python  C. C++  D. Swift");
        String ans1 = sc.nextLine();

        if (ans1.equalsIgnoreCase("A"))
            score++;

        System.out.println("\n2. Which company developed Java?");
        System.out.println("A. Apple  B. Sun Microsystems  C. Google  D. IBM");
        String ans2 = sc.nextLine();

        if (ans2.equalsIgnoreCase("B"))
            score++;

        System.out.println("\n3. Which keyword is used to create a class in Java?");
        System.out.println("A. define  B. new  C. class  D. create");
        String ans3 = sc.nextLine();

        if (ans3.equalsIgnoreCase("C"))
            score++;

        System.out.println("\nYour Score: " + score + "/3");

        sc.close();
    }
}
