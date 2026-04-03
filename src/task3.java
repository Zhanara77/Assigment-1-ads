public class task3 {
    static int sumN(int n) {
        if (n == 1) return 1;
        return n + sumN(n - 1);
    }
}
