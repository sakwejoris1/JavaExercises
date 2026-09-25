public class OverloadResolution {

    public static void show(int x, double y) {
        System.out.println("int, double version: " + x + ", " + y);
    }

    public static void show(double x, int y) {
        System.out.println("double, int version: " + x + ", " + y);
    }

    public static void main(String[] args) {
        show(1, 2.0); // matches show(int, double)
        show(1.0, 2); // matches show(double, int)

    
    }
}
