public class tasc8 {
    static void generate(int n, int k, int[] arr, int index) {
        if (index == n) {
            for (int x : arr) System.out.print(x + " ");
            System.out.println();
            return;
        }

        for (int i = 1; i <= k; i++) {
            arr[index] = i;
            generate(n, k, arr, index + 1);
        }
    }
}
