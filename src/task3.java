import java.util.*;

public class task3 {

    public static int[] f(int[] a) {
        int n = a.length;
        int[] r = new int[n];
        Arrays.fill(r, -1);

        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && a[i] > a[s.peek()]) {
                r[s.pop()] = a[i];
            }
            s.push(i);
        }
        return r;
    }

    public static void main(String[] args) {
        int[] a = {2,1,2,4,3};
        int[] r = f(a);

        System.out.println(Arrays.toString(r));
    }
}