public class b1 {
    public static void main(String[] args) {

        int[] data = {10, 22, 31, 4, 15, 28, 17};
        int m = 7;

        int[] t = new int[m];

        for (int i = 0; i < m; i++) {
            t[i] = -1;
        }

        for (int k : data) {

            int i = k % m;

            while (t[i] != -1) {
                i = (i + 1) % m;
            }

            t[i] = k;
        }

        for (int x : t) {
            System.out.print(x + " ");
        }
    }
}