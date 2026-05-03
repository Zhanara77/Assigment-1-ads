public class b3 {
    public static void main(String[] args) {

        int[] a = {1, 2, 5, 6, 9};
        int t = 6;

        int low = 0;
        int high = a.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            System.out.println("low=" + low + " high=" + high + " mid=" + mid);

            if (a[mid] == t) {
                System.out.println("Found at index: " + mid);
                break;
            } else if (a[mid] < t) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    }
}