import java.util.Scanner;

public class BeautifyString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userString = input.nextLine();
        String beautifiedString = beautifyString(userString);
        System.out.println("Beautified String: " + beautifiedString);
    }

    public static String beautifyString(String str) {
        str = addFullStop(str);
        str = capitalizeFirstLetter(str);
        return str;
    }

    public static String addFullStop(String str) {
        if (!str.endsWith(".")) {
            str += ".";
        }
        return str;
    }

    public static String capitalizeFirstLetter(String str) {
        if (str.length() > 0 && !Character.isUpperCase(str.charAt(0))) {
            str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
        }
        return str;
    }
}
