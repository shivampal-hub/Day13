public class FindMaxString <E extends Comparable> {

    E x, y, z;

    public FindMaxString(E x, E y, E z) {

        this.x = x;
        this.y = y;
        this.z = z;

    }

    public static void main(String[] args) {

        String a = "Grey";
        String b = "Green";
        String c = "Orange";

        new FindMaxString<String>(a, b, c).maximum();

    }

    public static <E extends Comparable<E>> void maximum(E x, E y, E z) {
        E max = x;

        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        System.out.println("Max value is : " + max);
    }

    private void maximum() {
        FindMaxString.maximum(x, y, z);
    }
}
