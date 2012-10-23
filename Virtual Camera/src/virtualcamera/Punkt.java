/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualcamera;

/**
 *
 * @author Sidek
 */
public class Punkt {
    private Double[] dane; 
    
    public Punkt( double x, double y, double z ) {
        dane = new Double[4];
        dane[0] = x;
        dane[1] = y;
        dane[2] = z;
        dane[3] = 1.0;
    }
    
    public double getX() {
        return dane[0];
    }
    
    public void setX( double wartosc ) {
        dane[0] = wartosc;
    }
    
    public double getY() {
        return dane[1];
    }
    
    public void setY( double wartosc ) {
        dane[1] = wartosc;
    }
    
    public double getZ() {
        return dane[2];
    }
    
    public void setZ( double wartosc ) {
        dane[2] = wartosc;
    }
    
    @Override
    public String toString() {
        return "(" + dane[0] + ", " + dane[1] + ", " + dane[2] + ", " + dane[3] + ")";
    }
}
