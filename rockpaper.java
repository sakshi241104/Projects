import java.util.Scanner;
import java.util.Random;

public class rockpaper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value (0-Rock 1-Scissor 2-Paper):");
        int value = sc.nextInt();
        System.out.println("Human Number:" + value);
        Random random = new Random();
        int number = random.nextInt(0, 3);
        // if(number == 0 && value == 0){
        //       System.out.println("Rock");
        // }
        // else if(number == 1 && value == 1){
        //       System.out.println("Scissor");
        // }
        // else if(number == 2 && value == 2){
        //       System.out.println("Paper");
        // }
        
        System.out.println("Computer Number:" + number);
        if (value > 2) {
            System.out.println("Enter values between (0-2)");
        } 
        else if(number==value){
            System.out.println("Match is draw");
        }
        else if (number == 1 && value == 0 || number == 2 && value == 1 || number == 0 && value == 2) {
            System.out.println("Congratulations!You Won");
        } 
        else {
            System.out.println("Sorry!Computer Won");
        }
    
        sc.close();
     }
}
