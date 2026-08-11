// Last updated: 8/11/2026, 4:04:27 PM
import java.util.*;

class Solution {

    public int maxPoints(int[][] points) {

        int n = points.length;
        if (n <= 2) return n;

        int ans = 0;

        for (int i = 0; i < n; i++) {

            HashMap<String, Integer> map = new HashMap<>();

            int max = 0;

            for (int j = i + 1; j < n; j++) {

                int dx = points[j][0] - points[i][0];
                int dy = points[j][1] - points[i][1];

                int g = gcd(dx, dy);
                dx /= g;
                dy /= g;

                // Normalize the sign
                if (dx < 0) {
                    dx = -dx;
                    dy = -dy;
                }

                // Vertical line
                if (dx == 0) {
                    dy = 1;
                }

                // Horizontal line
                if (dy == 0) {
                    dx = 1;
                }

                String key = dy + "/" + dx;

                map.put(key, map.getOrDefault(key, 0) + 1);

                max = Math.max(max, map.get(key));
            }

            ans = Math.max(ans, max + 1);
        }

        return ans;
    }

    private int gcd(int a, int b) {
        if (b == 0) return Math.abs(a);
        return gcd(b, a % b);
    }
}