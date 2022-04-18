public class MaxIntegerTC1 {

    public static void main(String[] args) {

        Integer a = 10;
        Integer b = 8;
        Integer c = 1;

        maximum(a, b, c);

    }

    public static <E extends Comparable> void maximum(E x, E y, E z) {
        E max = x;

        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        System.out.println("Max value is : " + max);
    }
}
