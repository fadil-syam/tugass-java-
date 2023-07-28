import java.util.Scanner;

public class ForgetfulMachine {
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner (System.in);

        System.out.println("What city is the capital of France?");
        Keyboard.next();

        System.out.println("What is 6 multiplied by 7?");
        Keyboard.next();

        System.out.println("Enter a number between 0.0 and 0.17");
        Keyboard.next();

        System.out.println("is there anything else you like to say ?");
        Keyboard.next();
    }
}
