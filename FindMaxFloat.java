public class FindMaxFloat <E extends Comparable>{

    E x, y, z;

    public FindMaxFloat(E x, E y, E z) {

        this.x = x;
        this.y = y;
        this.z = z;

    }

    public static void main(String[] args) {

        Float a = 4.4f;
        Float b = 3.6f;
        Float c = 1.2f;

        new FindMaxFloat<Float>(a, b, c).maximum();

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
        FindMaxFloat.maximum(x, y, z);
    }
}
