public class asic1 {
    static int asic1(int n) {
        if (n == 1) return 1;
        return n * n + asic1(n - 1);
    }
}
