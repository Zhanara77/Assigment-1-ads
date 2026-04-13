import java.util.*;

public class task7 {

    private PriorityQueue<Integer> s = new PriorityQueue<>(Collections.reverseOrder());
    private PriorityQueue<Integer> l = new PriorityQueue<>();

    public void a(int x) {
        s.add(x);

        if (!l.isEmpty() && s.peek() > l.peek()) {
            l.add(s.poll());
        }

        if (s.size() > l.size() + 1) {
            l.add(s.poll());
        }

        if (l.size() > s.size()) {
            s.add(l.poll());
        }
    }

    public double f() {
        if (s.size() > l.size()) return s.peek();
        return (s.peek() + l.peek()) / 2.0;
    }

    public static void main(String[] args) {
        task7 m = new task7();

        m.a(1);
        m.a(2);
        System.out.println(m.f()); // 1.5

        m.a(3);
        System.out.println(m.f()); // 2
    }
}