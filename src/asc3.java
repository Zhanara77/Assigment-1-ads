public class asc3 {
    public static void main(String[] args) {

        int[] arr = {5, 2, 9, 1, 6};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean a = false;
            System.out.println( (i + 1));

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    a = true;
                }


                for (int k = 0; k < n; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }

            if (!a) {
                System.out.println("Early exit");
                break;
            }

            System.out.println();
        }
    }
}