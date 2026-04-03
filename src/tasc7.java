public class tasc7 {
    static void spiral(int[][] a, int top, int bottom, int left, int right, int num) {
        if (top > bottom || left > right) return;

        for (int i = left; i <= right; i++) a[top][i] = num++;
        for (int i = top + 1; i <= bottom; i++) a[i][right] = num++;
        if (top < bottom)
            for (int i = right - 1; i >= left; i--) a[bottom][i] = num++;
        if (left < right)
            for (int i = bottom - 1; i > top; i--) a[i][left] = num++;

        spiral(a, top + 1, bottom - 1, left + 1, right - 1, num);
    }
}
