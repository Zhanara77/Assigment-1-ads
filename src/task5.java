import java.util.*;

public class task5 {

    public static int f(String s) {
        Set<Character> st = new HashSet<>();
        int l = 0, m = 0;

        for (int r = 0; r < s.length(); r++) {
            while (st.contains(s.charAt(r))) {
                st.remove(s.charAt(l++));
            }
            st.add(s.charAt(r));
            m = Math.max(m, r - l + 1);
        }
        return m;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(f(s)); // 3
    }
}