/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualcamera;

import java.util.ArrayList;

/**
 *
 * @author Adam
 */
public class Widok {
    private ArrayList<Wektor> wektory;
    private double ogniskowa = 300;
    private final static int szerokoscObrazu = 500;
    private final static int wysokoscObrazu = 500;
    
    public Widok( ArrayList<Wektor> wektory ){
        this.wektory = wektory;
    }
    
    public void zmienOgniskowa( double wartosc){
        ogniskowa = wartosc;
    }
    
    public double getOgniskowa(){
        return ogniskowa;
    }
    
    public boolean widocznyPunkt(Punkt punkt){
        if (punkt.getY() >= ogniskowa) //dodac zaleznosc od odleglosci od srodka ukl wsp
            return true;
        else return false;
    }
         
    public ArrayList<Wektor2D> rzutujObraz () {
        ArrayList<Wektor2D> obraz = new ArrayList<Wektor2D>();
   
        //System.out.println("Wypisuje wektory z funkcji rzutujObraz():\n");
        for (Wektor wektor : wektory) {
            //System.out.println("Pisze "+ wektor);
            
            Punkt punktA, punktB;
            
            punktA = wektor.getA();
            punktB = wektor.getB();

            if (widocznyPunkt(punktA) && widocznyPunkt(punktB)) {
                //System.out.println("ygjyrfjh");
                Wektor2D wektor2D = new Wektor2D(rzutujPunkt(punktA), rzutujPunkt(punktB));
                obraz.add(wektor2D);
            }
        }

    return obraz;
    }
     

    private Punkt2D rzutujPunkt (Punkt punkt) {
        double k = ogniskowa / punkt.getY() ;
         //System.out.println("k= " + k +"ogniskowa = "+ ogniskowa +"\n");
        int x = (int) (k*punkt.getX()+(szerokoscObrazu/2));
        int y = (int) ((wysokoscObrazu /2) - k*punkt.getZ());
        return new Punkt2D (x,y);
        
              /*  
        int x = (int) ( punkt.getX()/ punkt.getZ());
        int y = (int) ( punkt.getY()/ punkt.getZ());
        return new Punkt2D (x,y);
          */
         
    }
    
}
