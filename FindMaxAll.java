public class FindMaxAll <E extends Comparable>{

    E x, y, z;

    public FindMaxAll(E x, E y, E z) {

        this.x = x;
        this.y = y;
        this.z = z;

    }

    public static void main(String[] args) {

        Integer a = 4;
        Integer b = 8;
        Integer c = 1;

        Float d = 4.4f;
        Float e = 3.6f;
        Float f = 1.2f;

        String g = "Grey";
        String h = "Green";
        String i = "Orange";

        new FindMaxAll<Integer>(a, b, c).maximum();
        new FindMaxAll<Float>(d, e, f).maximum();
        new FindMaxAll<String>(g, h, i).maximum();

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

        FindMaxAll.maximum(x, y, z);
    }
}
