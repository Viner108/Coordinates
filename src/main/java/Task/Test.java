package Task;

public class Test {
    public static void main(String[] args) {
        createTest();
    }


    public static void createTest() {
        Vector3D coordinates = new Vector3D(5, 10, 15);
        coordinates.printState(coordinates.x);
        coordinates.printState(coordinates.y);
        coordinates.printState(coordinates.z);
        int lenght = coordinates.lenght();
        coordinates.printState(lenght);
        Vector3D coordinates2 = new Vector3D(15, 23, 13);
        int lenght2 = coordinates2.lenght();
        coordinates2.printState(lenght2);
        int product1=coordinates.scalarproduct(coordinates2);
        coordinates.printState(product1);
        int []product2 = coordinates.vectorproduct(coordinates2);
        coordinates.printLines(product2);
        int cos = coordinates.cos(coordinates2);
        coordinates.printState(cos);
        int[] sum = coordinates.sum(coordinates2);
        coordinates.printLines(sum);
        int[] difference = coordinates.difference(coordinates2);
        coordinates.printLines(difference);
        int count = coordinates.count;
        int count2 = coordinates2.count;
        int count3 = Vector3D.count;
    }
}
