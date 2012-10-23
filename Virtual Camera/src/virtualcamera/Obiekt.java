package virtualcamera;

import java.util.ArrayList;

public class Obiekt {
    private ArrayList<Wektor> wektory;
    private Rysownik rysownik;
    private Widok widok;
    
    public double KROK_PRZESUNIECIA = 100.0;
    public double KROK_OGNISKOWEJ = 10.0;
    public double KROK_OBROTU = 0.1;
    
    public Obiekt(Rysownik rysownik) {
    	this.wektory = new ArrayList<Wektor>();
        this.rysownik = rysownik;
        this.widok = new Widok(wektory);
    }
    
    public void ladujDane( double[][] dane ) {
        for( int i=0; i<dane.length; i++  ) {
            Punkt a = new Punkt(dane[i][0], dane[i][1], dane[i][2]);
            Punkt b = new Punkt(dane[i][3], dane[i][4], dane[i][5]);
            wektory.add(new Wektor(a,b));
        }
    }
    
    public void przybliz() {      
        widok.zmienOgniskowa(widok.getOgniskowa() + this.KROK_OGNISKOWEJ);
        rysuj();
    }
    
    public void oddal() {      
        widok.zmienOgniskowa(widok.getOgniskowa() - this.KROK_OGNISKOWEJ);
        rysuj();
    }
    
    public void przesunWLewo() {
        for( Wektor wektor : wektory ) {
            wektor.getA().setX(wektor.getA().getX() + KROK_PRZESUNIECIA);
            //System.out.print( "wspolrzednaX = " +wektor.getA().getX() +"wspołrzednaY = "+wektor.getA().getY()+"wspołrzednaZ = "+wektor.getA().getZ());
            wektor.getB().setX(wektor.getB().getX() + KROK_PRZESUNIECIA);
            //System.out.println( "wspolrzednaX = " +wektor.getB().getX() +"wspołrzednaY = "+wektor.getB().getY()+"wspołrzednaZ = "+wektor.getB().getZ());
        }
        rysuj();
    }
    
    public void przesunWPrawo() {
        for( Wektor wektor : wektory ) {
            wektor.getA().setX(wektor.getA().getX() - KROK_PRZESUNIECIA);
            wektor.getB().setX(wektor.getB().getX() - KROK_PRZESUNIECIA);
        }
        rysuj();
    }
    
    public void przesunWTyl() {      
        for( Wektor wektor : wektory ) {
            wektor.getA().setY(wektor.getA().getY() + KROK_PRZESUNIECIA);
            wektor.getB().setY(wektor.getB().getY() + KROK_PRZESUNIECIA);
        }
        rysuj();
    }
    
    public void przesunWPrzod() {
        for( Wektor wektor : wektory ) {
            wektor.getA().setY(wektor.getA().getY() - KROK_PRZESUNIECIA);
            wektor.getB().setY(wektor.getB().getY() - KROK_PRZESUNIECIA);
        }
        rysuj();
    }
    
    public void przesunWDol() {
        for( Wektor wektor : wektory ) {
            wektor.getA().setZ(wektor.getA().getZ() + KROK_PRZESUNIECIA);
            wektor.getB().setZ(wektor.getB().getZ() + KROK_PRZESUNIECIA);
        }
        rysuj();
    }    
    
    public void przesunWGore() {
        for( Wektor wektor : wektory ) {
            wektor.getA().setZ(wektor.getA().getZ() - KROK_PRZESUNIECIA);
            wektor.getB().setZ(wektor.getB().getZ() - KROK_PRZESUNIECIA);
        }
        rysuj();
    }
    
    public void obrocWDol(){
        for(Wektor wektor : wektory){
            double ay = wektor.getA().getY();
            double az = wektor.getA().getZ();
            double by = wektor.getB().getY();
            double bz = wektor.getB().getZ();
            
            wektor.getA().setY(( ay * java.lang.Math.cos(KROK_OBROTU) ) - ( az * java.lang.Math.sin(KROK_OBROTU) ));
            wektor.getA().setZ(( ay * java.lang.Math.sin(KROK_OBROTU) ) + ( az * java.lang.Math.cos(KROK_OBROTU) ));

            wektor.getB().setY(( by * java.lang.Math.cos(KROK_OBROTU) ) - ( bz * java.lang.Math.sin(KROK_OBROTU) ));
            wektor.getB().setZ(( by * java.lang.Math.sin(KROK_OBROTU) ) + ( bz * java.lang.Math.cos(KROK_OBROTU) ));            
        }
        
        rysuj();
    }
    
    public void obrocWGore(){
        for(Wektor wektor : wektory){
            double ay = wektor.getA().getY();
            double az = wektor.getA().getZ();
            double by = wektor.getB().getY();
            double bz = wektor.getB().getZ();
            
            wektor.getA().setY(( ay * java.lang.Math.cos((-1)*KROK_OBROTU) ) - ( az * java.lang.Math.sin((-1)*KROK_OBROTU) ));
            wektor.getA().setZ(( ay * java.lang.Math.sin((-1)*KROK_OBROTU) ) + ( az * java.lang.Math.cos((-1)*KROK_OBROTU) ));

            wektor.getB().setY(( by * java.lang.Math.cos((-1)*KROK_OBROTU) ) - ( bz * java.lang.Math.sin((-1)*KROK_OBROTU) ));
            wektor.getB().setZ(( by * java.lang.Math.sin((-1)*KROK_OBROTU) ) + ( bz * java.lang.Math.cos((-1)*KROK_OBROTU) ));            
        }
        
        rysuj();
    }
    
    public void przechylWPrawo(){
        for(Wektor wektor : wektory){
            double ax = wektor.getA().getX();
            double az = wektor.getA().getZ();
            double bx = wektor.getB().getX();
            double bz = wektor.getB().getZ();
            
            wektor.getA().setX(( ax * java.lang.Math.cos(KROK_OBROTU) ) + ( az * java.lang.Math.sin(KROK_OBROTU) ));
            wektor.getA().setZ(( (-1) * ax * java.lang.Math.sin(KROK_OBROTU) ) + ( az * java.lang.Math.cos(KROK_OBROTU) ));

            wektor.getB().setX(( bx * java.lang.Math.cos(KROK_OBROTU) ) + ( bz * java.lang.Math.sin(KROK_OBROTU) ));
            wektor.getB().setZ(( (-1) * bx * java.lang.Math.sin(KROK_OBROTU) ) + ( bz * java.lang.Math.cos(KROK_OBROTU) ));            
        }
        
        rysuj();
    }  
    
    public void przechylWLewo(){
        for(Wektor wektor : wektory){
            double ax = wektor.getA().getX();
            double az = wektor.getA().getZ();
            double bx = wektor.getB().getX();
            double bz = wektor.getB().getZ();
            
            wektor.getA().setX(( ax * java.lang.Math.cos((-1)*KROK_OBROTU) ) + ( az * java.lang.Math.sin((-1)*KROK_OBROTU) ));
            wektor.getA().setZ(( (-1) * ax * java.lang.Math.sin((-1)*KROK_OBROTU) ) + ( az * java.lang.Math.cos((-1)*KROK_OBROTU) ));

            wektor.getB().setX(( bx * java.lang.Math.cos((-1)*KROK_OBROTU) ) + ( bz * java.lang.Math.sin((-1)*KROK_OBROTU) ));
            wektor.getB().setZ(( (-1) * bx * java.lang.Math.sin((-1)*KROK_OBROTU) ) + ( bz * java.lang.Math.cos((-1)*KROK_OBROTU) ));            
        }
        
        rysuj();
    }
    
    public void obrocWPrawo(){
        for(Wektor wektor : wektory){
            double ax = wektor.getA().getX();
            double ay = wektor.getA().getY();
            double bx = wektor.getB().getX();
            double by = wektor.getB().getY();
            
            wektor.getA().setX(( ax * java.lang.Math.cos(KROK_OBROTU) ) - ( ay * java.lang.Math.sin(KROK_OBROTU) ));
            wektor.getA().setY(( ax * java.lang.Math.sin(KROK_OBROTU) ) + ( ay * java.lang.Math.cos(KROK_OBROTU) ));

            wektor.getB().setX(( bx * java.lang.Math.cos(KROK_OBROTU) ) - ( by * java.lang.Math.sin(KROK_OBROTU) ));
            wektor.getB().setY(( bx * java.lang.Math.sin(KROK_OBROTU) ) + ( by * java.lang.Math.cos(KROK_OBROTU) ));        
        }
        
        rysuj();
    }
    
    public void obrocWLewo(){
        for(Wektor wektor : wektory){
            double ax = wektor.getA().getX();
            double ay = wektor.getA().getY();
            double bx = wektor.getB().getX();
            double by = wektor.getB().getY();
            
            wektor.getA().setX(( ax * java.lang.Math.cos((-1)*KROK_OBROTU) ) - ( ay * java.lang.Math.sin((-1)*KROK_OBROTU) ));
            wektor.getA().setY(( ax * java.lang.Math.sin((-1)*KROK_OBROTU) ) + ( ay * java.lang.Math.cos((-1)*KROK_OBROTU) ));

            wektor.getB().setX(( bx * java.lang.Math.cos((-1)*KROK_OBROTU) ) - ( by * java.lang.Math.sin((-1)*KROK_OBROTU) ));
            wektor.getB().setY(( bx * java.lang.Math.sin((-1)*KROK_OBROTU) ) + ( by * java.lang.Math.cos((-1)*KROK_OBROTU) ));        
        }
        
        rysuj();
    }    
    
    public void rysuj() {
        rysownik.setWektory(widok.rzutujObraz());
        rysownik.repaint();
    }
    
    //do testowania
    public void wypiszDane() {
        System.out.println("Wypisuję dane:");
        for( int i=0; i<wektory.size(); i++ ) {
            System.out.println(wektory.get(i));
        }
    }
}
