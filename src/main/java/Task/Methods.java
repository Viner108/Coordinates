package Task;

public class Methods {
    int x;

    int y;

    int z;
    public Methods(){

    }

    public Methods(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    void printState(int i){
        System.out.println(i);
    }
    public int lenght(int x, int y, int z){
        int lenght;
        lenght= (int) Math.sqrt(Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2));
        return lenght;
    }
    public int scalarproduct(int x,int y,int z, int x2, int y2, int z2){
        int product;
        product=(y*z2-z*y2)+(z*x2-x*z2)+(x*y2-y*x2);
        return product;
    }
    public int cos(int x,int y,int z, int x2, int y2, int z2){
        int cos;
        cos= scalarproduct(x,y,z,x2,y2,z2)/Math.abs(lenght(x,y,z)*lenght(x2,y2,z2));
        return cos;
    }
}


