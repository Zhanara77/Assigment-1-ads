public class tasc6 {
        static void reverseStrings(int n, Scanner sc) {
        if (n == 0) return;
        String s = sc.nextLine();
        reverseStrings(n - 1, sc);
        System.out.println(s);
    }
}
