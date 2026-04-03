public class task5 {
    import java.util.Scanner;
    static void reverseNumbers(int n, Scanner sc) {
        if (n == 0) return;
        int x = sc.nextInt();
        reverseNumbers(n - 1, sc);
        System.out.print(x + " ");
    }
}
