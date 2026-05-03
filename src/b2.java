public class b2 {
    public static void main(String[] args) {

        int[] a = {5, 2, 9, 1, 6};
        int t = 1;

        int count = 0;

        for (int i = 0; i < a.length; i++) {
            count++;

            if (a[i] == t) {
                System.out.println("Found at index: " + i);
                break;
            }
        }

        System.out.println("Comparisons: " + count);
    }
}