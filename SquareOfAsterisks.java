public class SquareOfAsterisks {
    public static void main(String[] args) {
        squareOfAsterisks(4);
    }

    public static void squareOfAsterisks(int side) {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
