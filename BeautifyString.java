import java.util.Scanner;

public class BeautifyString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userString = input.nextLine();
        String beautifiedString = beautifyString(userString);
        System.out.println("Beautified String: " + beautifiedString);
    }
