public class task9 {
    static void permute(char[] arr, int l) {
        if (l == arr.length) {
            System.out.println(new String(arr));
            return;
        }

        for (int i = l; i < arr.length; i++) {
            char temp = arr[l];
            arr[l] = arr[i];
            arr[i] = temp;

            permute(arr, l + 1);

            temp = arr[l];
            arr[l] = arr[i];
            arr[i] = temp;
        }
    }
}
