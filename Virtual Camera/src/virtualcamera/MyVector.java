package virtualcamera;

public class MyVector {
    private Point a,b;
    
    public MyVector( Point a, Point b ){
        this.a = a;
        this.b = b;
    }
    
    public MyVector( MyVector v ){
        this.a = v.a;
        this.b = v.b;
    }
    
    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }
    
    @Override
    public String toString() {
        return "Vector with points: " + a + ", " + b;
    }
}
