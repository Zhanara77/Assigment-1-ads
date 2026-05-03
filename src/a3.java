public class a3 {
    public static void main(String[] args) {

        int[] a = {5, 2, 9, 1, 6};

        ms(a, 0, a.length - 1);

        System.out.println();
        p(a);
    }

    static void ms(int[] a, int l, int r) {
        if (l < r) {

            int m = (l + r) / 2;
            ms(a, l, m);
            ms(a, m + 1, r);
            mg(a, l, m, r);
        }
    }

    static void mg(int[] a, int l, int m, int r) {

        int n1 = m - l + 1;
        int n2 = r - m;
        int[] x = new int[n1];
        int[] y = new int[n2];

        for (int i = 0; i < n1; i++)
            x[i] = a[l + i];

        for (int j = 0; j < n2; j++)
            y[j] = a[m + 1 + j];

        int i = 0, j = 0, k = l;

        System.out.println("merge...");

        while (i < n1 && j < n2) {
            if (x[i] <= y[j]) {
                a[k] = x[i];
                i++;
            } else {
                a[k] = y[j];
                j++;
            }
            k++;
            p(a);
        }

        while (i < n1) {
            a[k] = x[i];
            i++;
            k++;
        }

        while (j < n2) {
            a[k] = y[j];
            j++;
            k++;
        }
    }

    static void p(int[] a) {
        for (int z : a) {
            System.out.print(z + " ");
        }
        System.out.println();
    }
}