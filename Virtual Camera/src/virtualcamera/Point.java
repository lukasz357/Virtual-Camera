package virtualcamera;

public class Point {
    private Double[] data; 
    
    public Point( double x, double y, double z ) {
        data = new Double[4];
        data[0] = x;
        data[1] = y;
        data[2] = z;
        data[3] = 1.0;
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
    
    public double getZ() {
        return data[2];
    }
    
    public void setZ( double value ) {
        data[2] = value;
    }
    
    @Override
    public String toString() {
        return "(" + data[0] + ", " + data[1] + ", " + data[2] + ", " + data[3] + ")";
    }
}
