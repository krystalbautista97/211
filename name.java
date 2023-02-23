import java.util.Scanner;

public class name {
    public static void main(String[] args) {
        String name;

        System.out.println("Hello! Please enter your name:");

        Scanner inputScanner = new java.util.Scanner(System.in);

        name = inputScanner.nextLine();

        inputScanner.close();

            System.out.println("Your names' length is " + name.length ());


        
    }
}
