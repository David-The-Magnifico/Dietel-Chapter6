import java.util.Scanner;

public class SquareOfAnyCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side length of the square: ");
        int side = input.nextInt();
        System.out.print("Enter the character to fill the square: ");
        char fillCharacter = input.next().charAt(0);
        squareOfAnyCharacter(side, fillCharacter);
    }

