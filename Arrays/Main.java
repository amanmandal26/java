package Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        
        int totalToffees = 0;
        String longestString = "";
        
        for (String word : words) {
            totalToffees += word.length();
            if (word.length() > longestString.length()) {
                longestString = word;
            }
        }
        
        System.out.println("Total number of toffees is: " + totalToffees);
        System.out.println("The longest string is: " + longestString);
    }
}
