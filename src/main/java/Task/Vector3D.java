package Task;

import java.util.Random;

public class Vector3D {
    public static void main(String[] args) {
        int N = 5;
        int[][] vectors = getVectors(N);
        printLines(vectors);
    }
    int x;

    int y;

    int z;

    public Vector3D() {

    }

    public Vector3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    void printState(int i) {
        System.out.println(i);
    }

    public int lenght() {
        int lenght;
        lenght = (int) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
        return lenght;
    }

    public int scalarproduct(Vector3D coordinate1, Vector3D coordinate2) {
        int product;
        product = coordinate1.x * coordinate2.x + coordinate1.y * coordinate2.y + coordinate1.z * coordinate2.z;
        return product;
    }

    public int[] vectorproduct(Vector3D coordinate1, Vector3D coordinate2) {
        int[] product;
        product = new int[]{coordinate1.y * coordinate2.z - coordinate1.z * coordinate2.y, coordinate1.z * coordinate2.x - coordinate1.x * coordinate2.z, coordinate1.x * coordinate2.y - coordinate1.y * coordinate2.x};
        return product;
    }

    public int cos(Vector3D coordinate1, Vector3D coordinate2) {
        int cos;
        cos =scalarproduct(coordinate1,coordinate2)/Math.abs(coordinate1.lenght() * coordinate2.lenght());
        return cos;
    }

    public int[] sum(Vector3D coordinate1, Vector3D coordinate2) {
        int[] sum = {coordinate1.x + coordinate2.x, coordinate1.y +coordinate2.y, coordinate1.z + coordinate2.z};
        return sum;
    }

    public int[] difference(Vector3D coordinate1, Vector3D coordinate2) {
        int[] difference = {coordinate1.x - coordinate2.x, coordinate1.y - coordinate2.y, coordinate1.z - coordinate2.z};
        return difference;
    }
    public void printLines(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(String.format(" %2d", array[i]));
        }
        System.out.println("]");
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


