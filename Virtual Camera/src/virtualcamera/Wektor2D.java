/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualcamera;

/**
 *
 * @author Sidek
 */
public class Wektor2D {
    private Punkt2D a,b;
    
    public Wektor2D( Punkt2D a, Punkt2D b ){
        this.a = a;
        this.b = b;
    }
    
    public Punkt2D getA() {
        return a;
    }

    public Punkt2D getB() {
        return b;
    }
    
    @Override
    public String toString() {
        return "Wektor o punktach: " + a + " i " + b;
    }
}
