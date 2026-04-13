class L {
    int v;
    L n;

    L(int v) {
        this.v = v;
    }
}

public class task2 {

    public static L f(L h, int k) {
        L d = new L(0);
        d.n = h;

        L a = d, b = d;

        for (int i = 0; i < k; i++) a = a.n;

        while (a.n != null) {
            a = a.n;
            b = b.n;
        }

        b.n = b.n.n;
        return d.n;
    }

    public static void main(String[] args) {
        L h = new L(1);
        h.n = new L(2);
        h.n.n = new L(3);
        h.n.n.n = new L(4);

        h = f(h, 2);

        while (h != null) {
            System.out.print(h.v + " ");
            h = h.n;
        }
    }
}