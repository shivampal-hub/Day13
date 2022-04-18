public class MaxStringTC1 {

    public static void main(String[] args) {

        String a = "Orange";
        String b = "Green";
        String c = "Grey";

        maximum(a, b, c);

    }

    public static <E extends Comparable> void maximum (E x, E y, E z) {
        E max = x;

        if (y.compareTo(max )> 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        System.out.println("Max value is : " + max);
    }
}
