package hackerrank.java_basic;


import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;

public class Java1DArray_Part2 {

    public static boolean canWin(int leap, int[] game, int i) {
//        System.out.println(i);
//        System.out.println(Arrays.toString(game).replace("[", "").replace("]", "").replace(",", ""));
        if (i >= game.length) return true;
        if (i < 0 || game[i] == 1) return false;
        game[i] = 1;
        return canWin(leap, game, i + 1) || canWin(leap, game, i - 1) || canWin(leap, game, i + leap);
    }

    public static void main(String[] args) throws IOException {
        Scanner questions = new Scanner(Paths.get("/Users/maprajap/Downloads/array2questions.txt"));
        Scanner answers = new Scanner(Paths.get("/Users/maprajap/Downloads/array2answers.txt"));
        int q = questions.nextInt();
        while (q-- > 0) {
            int n = questions.nextInt();
            int leap = questions.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = questions.nextInt();
            }

            String original = answers.nextLine();
            if (!original.equals((canWin(leap, game, 0)) ? "YES" : "NO")) {
                System.out.println(game.length + " " + leap);
                System.out.println(Arrays.toString(game).replace("[", "").replace("]", "").replace(",", ""));
                System.err.println("Original -> " + original);
                System.exit(1);
            }
        }
        questions.close();
    }

//    public static void main(String[] args) {
//        Scanner questions = new Scanner(System.in);
//        int q = questions.nextInt();
//        while (q-- > 0) {
//            int n = questions.nextInt();
//            int leap = questions.nextInt();
//
//            int[] game = new int[n];
//            for (int i = 0; i < n; i++) {
//                game[i] = questions.nextInt();
//            }
//
//            System.out.println(Arrays.toString(game));
//            System.out.println(canWin(leap, game, 0) ? "YES" : "NO");
//        }
//        questions.close();
//    }
}