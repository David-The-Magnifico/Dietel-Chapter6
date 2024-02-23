public class FloorCeil {
    public static void main(String[] args) {
        double num = 7.8;

        System.out.println("Original number: " + num);
        System.out.println("Floor: " + myFloor(num));
        System.out.println("Ceil: " + myCeil(num));
    }

    public static int myFloor(double num) {
        int floor = (int) num; 
        return floor;
    }

    public static int myCeil(double num) {
        int ceil = (int) num; 
        if (num > ceil) {
            return ceil + 1; 
        } else {
            return ceil;
        }
    }
}
