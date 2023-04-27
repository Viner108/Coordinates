package Task;

import java.util.Random;

public class VectorN {
    public static void main(String[] args) {
        int N = 5;
        int[][] vectors = getVectors(N);
        printLines(vectors);
    }
    private static int[][] getVectors(int N) {
        Random random = new Random();
        int[][] vectors = new int[N][];
        for (int i = 0; i < vectors.length; i++) {
            int lenghtvector = random.nextInt(10);
            vectors[i] = new int[lenghtvector];
            for (int j = 0; j < lenghtvector; j++) {
                vectors[i][j] = random.nextInt(10);
            }
        }

        return vectors;
    }
    private static void printLines(int[][] lines) {
        System.out.println();
        for (int[] line : lines) {
            for (int i : line) {
                System.out.printf(" %3d", i);
            }
            System.out.println();
        }
        System.out.println();
    }
}
