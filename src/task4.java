public class task4 {

    private int[] a;
    private int h, c, s;

    public task4(int k) {
        a = new int[k];
        s = k;
    }

    public boolean en(int v) {
        if (full()) return false;
        int t = (h + c) % s;
        a[t] = v;
        c++;
        return true;
    }

    public boolean de() {
        if (empty()) return false;
        h = (h + 1) % s;
        c--;
        return true;
    }

    public boolean full() {
        return c == s;
    }

    public boolean empty() {
        return c == 0;
    }

    public static void main(String[] args) {
        task4 q = new task4(3);

        q.en(1);
        q.en(2);
        q.en(3);

        System.out.println(q.full()); // true

        q.de();
        q.en(4);

        System.out.println(q.empty()); // false
    }
}