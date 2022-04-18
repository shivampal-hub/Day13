public class MaxFloatTC3 {

    public static void main(String[] args) {

        Float a = 4.4f;
        Float b = 3.6f;
        Float c = 6.2f;

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
