import java.util.Scanner;

public class percentage_student {
    public static void main(String[] args) {
        System.out.println("Enter marks from user");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter maths marks:");
        float maths = sc.nextInt();
        System.out.print("Enter science marks:");
        float science = sc.nextInt();
        System.out.print("Enter english marks:");
        float english = sc.nextInt();
        System.out.print("Enter social science marks:");
        float social_science = sc.nextInt();
        System.out.print("Enter hindi marks:");
        float hindi = sc.nextInt();
        float total_marks = maths + science + english + social_science + hindi;
        float percentage = (total_marks / 500.0f) * 100;
        System.out.print("Total marks:");
        System.out.println(total_marks);
        System.out.print("percentage of student:");
        System.out.println(percentage + "%");
        sc.close();
    }
}
