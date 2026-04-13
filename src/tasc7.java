import java.util.*;

public class tasc7 {
    private PriorityQueue<Integer> small = new PriorityQueue<>(Collections.reverseOrder());
    private PriorityQueue<Integer> large = new PriorityQueue<>();

    public void addNum(int num) {
        small.add(num);

        if (!large.isEmpty() && small.peek() > large.peek()) {
            large.add(small.poll());
        }

        if (small.size() > large.size() + 1) {
            large.add(small.poll());
        }

        if (large.size() > small.size()) {
            small.add(large.poll());
        }
    }

    public double findMedian() {
        if (small.size() > large.size()) return small.peek();
        return (small.peek() + large.peek()) / 2.0;
    }

    public static void main(String[] args) {
        task7 mf = new task7();

        mf.a(1);
        mf.a(2);
        System.out.println(mf.f()); // 1.5

        mf.a(3);
        System.out.println(mf.f()); // 2
    }
}