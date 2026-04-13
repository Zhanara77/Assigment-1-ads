public class task1 {

    public static void r(int[] a, int k) {
        int n = a.length;
        k %= n;

        rev(a, 0, n - 1);
        rev(a, 0, k - 1);
        rev(a, k, n - 1);
    }

    private static void rev(int[] a, int l, int r) {
        while (l < r) {
            int t = a[l];
            a[l] = a[r];
            a[r] = t;
            l++;
            r--;
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};

        r(a, 3);

        for (int x : a) System.out.print(x + " ");
    }
}