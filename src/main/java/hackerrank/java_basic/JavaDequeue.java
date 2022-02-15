package hackerrank.java_basic;

import java.util.*;

public class JavaDequeue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt(), max = 0;
        Deque<Integer> deque = new ArrayDeque<>();
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int value = in.nextInt();
            set.add(value);
            deque.add(value);

            if (deque.size() == m) {
                if (set.size() == m) {
                    max = m;
                    break;
                }
                max = Math.max(max, set.size());
                int first = deque.remove();
                if (!deque.contains(first)) set.remove(first);
            }
        }
        System.out.println(max);
    }
}



