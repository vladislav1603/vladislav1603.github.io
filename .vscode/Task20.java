
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

    public Task20 scalarProduct(Task20 vector) {
        return new Task20(x * vector.y - y * vector.x, y * vector.z - z * vector.y, z * vector.x - x * vector.z);
    }
}


