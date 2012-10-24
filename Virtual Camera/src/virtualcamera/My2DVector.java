package virtualcamera;

public class My2DVector {
    private My2DPoint a,b;
    
    public My2DVector( My2DPoint a, My2DPoint b ){
        this.a = a;
        this.b = b;
    }
    
    public My2DPoint getA() {
        return a;
    }

    public My2DPoint getB() {
        return b;
    }
    
    @Override
    public String toString() {
        return "Vector with points: " + a + ", " + b;
    }
}
