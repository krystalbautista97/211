import java.util.Scanner;

public class NameLengthCalculator {
    public static void main(String[] args) {
        // create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // prompt the user for their name
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        
        // calculate the length of the name using the length() method of the String class
        int nameLength = name.length();
        
        // print out the length of the name
        System.out.println("Your name has " + nameLength + " characters.");
    }
}

