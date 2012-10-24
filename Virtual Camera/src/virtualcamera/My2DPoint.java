package virtualcamera;

public class My2DPoint {
    private Double[] data; 
    
    public My2DPoint( double x, double y ) {
        data = new Double[2];
        data[0] = x;
        data[1] = y;
    }
    
    public double getX() {
        return data[0];
    }
    
    public void setX( double value ) {
        data[0] = value;
    }
    
    public double getY() {
        return data[1];
    }
    
    public void setY( double value ) {
        data[1] = value;
    }
    
    @Override
    public String toString() {
        return "(" + data[0] + ", " + data[1] + ", " + ")";
    }    
}
