public class a2 {
    public static void main(String[] args) {

        int[] a = {5, 2, 9, 1, 6};
        int n = a.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            f(a, n, i);
        }

        for (int i = n - 1; i > 0; i--) {

            int t = a[0];
            a[0] = a[i];
            a[i] = t;

            f(a, i, 0);
        }

        for (int x : a) {
            System.out.print(x + " ");
        }
    }

    static void f(int[] a, int n, int i) {

        int max = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && a[l] > a[max]) {
            max = l;
        }

        if (r < n && a[r] > a[max]) {
            max = r;
        }

        if (max != i) {
            int t = a[i];
            a[i] = a[max];
            a[max] = t;

            f(a, n, max);
        }
    }
}