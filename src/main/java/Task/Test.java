package Task;

public class Test {
    public static void main(String[] args) {
        createTest();
    }
    public static void createTest(){
        Methods coordinates= new Methods(5,10,15);
        coordinates.printState(coordinates.x);
        coordinates.printState(coordinates.y);
        coordinates.printState(coordinates.z);
        int lenght=coordinates.lenght(coordinates.x, coordinates.y, coordinates.z);
        coordinates.printState(lenght);
        Methods coordinates2=new Methods(15,23,13);
        int lenght2=coordinates2.lenght(coordinates2.x,coordinates2.y,coordinates2.z);
        coordinates2.printState(lenght2);
        int product=coordinates.scalarproduct(coordinates.x,coordinates.y,coordinates.z,coordinates2.x,coordinates2.y,coordinates2.z);
        coordinates.printState(product);
        int cos=coordinates.cos(coordinates.x,coordinates.y,coordinates.z,coordinates2.x,coordinates2.y,coordinates2.z);
        coordinates.printState(cos);
    }
}