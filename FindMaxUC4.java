public class FindMaxUC4 <E extends Comparable>{

    E x, y, z, w;

    public FindMaxUC4(E x, E y, E z, E w) {

        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;

    }

    public static void main(String[] args) {

        Integer a = 4;
        Integer b = 8;
        Integer c = 1;
        Integer j = 6;

        Float d = 4.4f;
        Float e = 3.6f;
        Float f = 1.2f;
        Float k = 8.6f;

        String g = "Grey";
        String h = "Green";
        String i = "Orange";
        String l = "Blue";

        new FindMaxUC4<Integer>(a, b, c, j).maximum();
        new FindMaxUC4<Float>(d, e, f, k).maximum();
        new FindMaxUC4<String>(g, h, i, l).maximum();

    }

    public static <E extends Comparable<E>> void maximum(E x, E y, E z, E w) {
        E max = x;

        if (y.compareTo(max )> 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        if(w.compareTo(max) > 0) {
            max = w;
        }
        System.out.println("Max value is : " + max);
    }

    private void maximum() {

        FindMaxUC4.maximum(x, y, z, w);
    }
}
