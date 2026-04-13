class T {
        int v;
        T l, r;

        T(int v) {
                this.v = v;
        }
}

public class tasc6 {

        public static T f(T x, int k) {
                if (x == null) return null;

                if (k < x.v) x.l = f(x.l, k);
                else if (k > x.v) x.r = f(x.r, k);
                else {
                        if (x.l == null) return x.r;
                        if (x.r == null) return x.l;

                        T m = x.r;
                        while (m.l != null) m = m.l;

                        x.v = m.v;
                        x.r = f(x.r, m.v);
                }
                return x;
        }

        public static void in(T x) {
                if (x == null) return;
                in(x.l);
                System.out.print(x.v + " ");
                in(x.r);
        }

        public static void main(String[] args) {
                T x = new T(5);
                x.l = new T(3);
                x.r = new T(6);

                f(x, 3);
                in(x);
        }
}