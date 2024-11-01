import java.util.Vector;

public class Task20 {

    private double x;
    private double y;
    private double z;


    public Task20(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double length() {
        return Math.sqrt(x*x + y*y + z*z);
    }

    public double scalarProduct(Task20 vector) {
        return new Task20(x * vector.y - y * vector.x, y * vector.z - z * vector.y, z * vector.x - x * vector.z).length();
    }

    public Task20 crossProduct(Task20 vector) {
        return new Task20(y * vector.z - z * vector.y, z * vector.x - x * vector.z, x * vector.y - y * vector.z);
    }

    public double cos(Task20 vector) {
        return scalarProduct(vector) / (length()* vector.length());
    }

    public Task20 subtract(Task20 vector) {
        return new Task20(
                x - vector.x,
                y - vector.y,
                z - vector.z
        );
    }

    public static Task20[] generate(int n) {
        Task20[] vector = new  Task20[n];
        for (int i = 0; i < n; i++){
            vector[i] = new Task20(Math.random(),Math.random(), Math.random());
        }
        return  vector;
    }

    @Override
    public String toString() {
        return "Vector{" + "x=" + x + ", y=" + y + ", z=" + z + '}';
    }

    public static void main(String[] args) {
        Task20[] vector = Task20.generate(10);
        System.out.println(vector[0]);
        System.out.println(vector[1]);
        System.out.println(vector[0].length());
        System.out.println(vector[0].scalarProduct(vector[1]));
        System.out.println(vector[0].crossProduct(vector[1]));
        System.out.println(vector[0].cos(vector[1]));
        System.out.println(vector[0].subtract(vector[1]));
    }
}


