/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualcamera;

/**
 *
 * @author Sidek
 */
public class Punkt2D {
    private Double[] dane; 
    
    public Punkt2D( double x, double y ) {
        dane = new Double[2];
        dane[0] = x;
        dane[1] = y;
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
    
    @Override
    public String toString() {
        return "(" + dane[0] + ", " + dane[1] + ", " + ")";
    }    
}
