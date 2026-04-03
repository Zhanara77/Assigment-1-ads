public class task4 {
    static int powerSum(int b, int n) {
        if (n == 0) return 1;
        return (int)Math.pow(b, n) + powerSum(b, n - 1);
    }
}
