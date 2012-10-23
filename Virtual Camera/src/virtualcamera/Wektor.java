/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualcamera;

/**
 *
 * @author Sidek
 */
public class Wektor {
    private Punkt a,b;
    
    public Wektor( Punkt a, Punkt b ){
        this.a = a;
        this.b = b;
    }
    
    public Punkt getA() {
        return a;
    }

    public Punkt getB() {
        return b;
    }
    
    @Override
    public String toString() {
        return "Wektor o punktach: " + a + " i " + b;
    }
}
