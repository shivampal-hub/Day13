public class FindMax <E extends Comparable>  {

    E x, y, z;

    public FindMax(E x, E y, E z) {

        this.x = x;
        this.y = y;
        this.z = z;

    }

    public static void main(String[] args) {

        Integer a = 4;
        Integer b = 8;
        Integer c = 1;

        new FindMax<Integer>(a, b, c).maximum();

    }

    public static <E extends Comparable<E>> void maximum(E x, E y, E z) {
        E max = x;

        if (y.compareTo(max )> 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        System.out.println("Max value is : " + max);
    }

    private void maximum() {
        FindMax.maximum(x, y, z);
    }
}
