package Task;

import java.util.Random;

public class Vector3D {
    public static int N=5;
    int x;
    public static int count=0;
    int y;

    int z;

    public Vector3D() {

    }

    public Vector3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        count++;
    }

    void printState(int i) {
        System.out.println(i);
    }

    public int lenght() {
        return (int) Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2) + Math.pow(this.z, 2));
    }

    public int scalarproduct(Vector3D coordinate2) {
        int product = this.x * coordinate2.x + this.y * coordinate2.y + this.z * coordinate2.z;
        return product;
    }

    public int[] vectorproduct( Vector3D coordinate2) {
        return new int[]{this.y * coordinate2.z -this.z * coordinate2.y, this.z * coordinate2.x - this.x * coordinate2.z, this.x * coordinate2.y - this.y * coordinate2.x};
    }

    public int cos( Vector3D coordinate2) {
        int cos;
        cos = scalarproduct(coordinate2) / Math.abs(this.lenght() * coordinate2.lenght());
        return cos;
    }

    public int[] sum( Vector3D coordinate2) {
        int[] sum = {this.x + coordinate2.x, this.y + coordinate2.y, this.z + coordinate2.z};
        return sum;
    }

    public int[] difference( Vector3D coordinate2) {
        int[] difference = {this.x - coordinate2.x, this.y - coordinate2.y, this.z - coordinate2.z};
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
}


