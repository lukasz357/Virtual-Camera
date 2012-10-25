package virtualcamera;

import java.util.ArrayList;

public class Scene {
    private ArrayList<MyVector> vectors;
    private SceneCreator creator;
    private View view;
    
    public Scene() {
    	this.vectors = new ArrayList<MyVector>();
        this.view = new View(vectors);
    }
    
    public void zoomIN() {      
        view.changeFocal(view.getFocal() + VirtualCamera.FOCAL_STEP);
        paint();
    }
    
    public void zoomOUT() {      
        view.changeFocal(view.getFocal() - VirtualCamera.FOCAL_STEP);
        paint();
    }
    
    public void translateLeft() {
        for( MyVector vec : vectors ) {
            vec.getA().setX(vec.getA().getX() + VirtualCamera.TRANSLATION_STEP);
            vec.getB().setX(vec.getB().getX() + VirtualCamera.TRANSLATION_STEP);
        }
        paint();
    }
    
    public void translateRight() {
        for( MyVector vec : vectors ) {
            vec.getA().setX(vec.getA().getX() - VirtualCamera.TRANSLATION_STEP);
            vec.getB().setX(vec.getB().getX() - VirtualCamera.TRANSLATION_STEP);
        }
        paint();
    }
    
    public void translateBack() {      
        for( MyVector vec : vectors ) {
            vec.getA().setY(vec.getA().getY() + VirtualCamera.TRANSLATION_STEP);
            vec.getB().setY(vec.getB().getY() + VirtualCamera.TRANSLATION_STEP);
        }
        paint();
    }
    
    public void translateForward() {
        for( MyVector vec : vectors ) {
            vec.getA().setY(vec.getA().getY() - VirtualCamera.TRANSLATION_STEP);
            vec.getB().setY(vec.getB().getY() - VirtualCamera.TRANSLATION_STEP);
        }
        paint();
    }
    
    public void translateBottom() {
        for( MyVector vec : vectors ) {
            vec.getA().setZ(vec.getA().getZ() + VirtualCamera.TRANSLATION_STEP);
            vec.getB().setZ(vec.getB().getZ() + VirtualCamera.TRANSLATION_STEP);
        }
        paint();
    }    
    
    public void translateUp() {
        for( MyVector vec : vectors ) {
            vec.getA().setZ(vec.getA().getZ() - VirtualCamera.TRANSLATION_STEP);
            vec.getB().setZ(vec.getB().getZ() - VirtualCamera.TRANSLATION_STEP);
        }
        paint();
    }
    
    public void turnUp(){
        for(MyVector vec : vectors){
            double ay = vec.getA().getY();
            double az = vec.getA().getZ();
            double by = vec.getB().getY();
            double bz = vec.getB().getZ();
            
            vec.getA().setY(( ay * java.lang.Math.cos((-1)*VirtualCamera.ROTATION_STEP) ) 
            		- ( az * java.lang.Math.sin((-1)*VirtualCamera.ROTATION_STEP) ));
            vec.getA().setZ(( ay * java.lang.Math.sin((-1)*VirtualCamera.ROTATION_STEP) ) 
            		+ ( az * java.lang.Math.cos((-1)*VirtualCamera.ROTATION_STEP) ));

            vec.getB().setY(( by * java.lang.Math.cos((-1)*VirtualCamera.ROTATION_STEP) ) 
            		- ( bz * java.lang.Math.sin((-1)*VirtualCamera.ROTATION_STEP) ));
            vec.getB().setZ(( by * java.lang.Math.sin((-1)*VirtualCamera.ROTATION_STEP) ) 
            		+ ( bz * java.lang.Math.cos((-1)*VirtualCamera.ROTATION_STEP) ));            
        }
        
        paint();
    }
    
    public void turnDown(){
        for(MyVector vec : vectors){
            double ay = vec.getA().getY();
            double az = vec.getA().getZ();
            double by = vec.getB().getY();
            double bz = vec.getB().getZ();
            
            vec.getA().setY(( ay * java.lang.Math.cos(VirtualCamera.ROTATION_STEP) ) 
            		- ( az * java.lang.Math.sin(VirtualCamera.ROTATION_STEP) ));
            vec.getA().setZ(( ay * java.lang.Math.sin(VirtualCamera.ROTATION_STEP) ) 
            		+ ( az * java.lang.Math.cos(VirtualCamera.ROTATION_STEP) ));

            vec.getB().setY(( by * java.lang.Math.cos(VirtualCamera.ROTATION_STEP) ) 
            		- ( bz * java.lang.Math.sin(VirtualCamera.ROTATION_STEP) ));
            vec.getB().setZ(( by * java.lang.Math.sin(VirtualCamera.ROTATION_STEP) ) 
            		+ ( bz * java.lang.Math.cos(VirtualCamera.ROTATION_STEP) ));            
        }
        
        paint();
    }
     
   
    public void turnLeft(){
        for(MyVector vec : vectors){
            double ax = vec.getA().getX();
            double ay = vec.getA().getY();
            double bx = vec.getB().getX();
            double by = vec.getB().getY();
            
            vec.getA().setX((ax * java.lang.Math.cos((-1)*VirtualCamera.ROTATION_STEP) ) 
            		- ( ay * java.lang.Math.sin((-1)*VirtualCamera.ROTATION_STEP) ));
            vec.getA().setY((ax * java.lang.Math.sin((-1)*VirtualCamera.ROTATION_STEP) ) 
            		+ ( ay * java.lang.Math.cos((-1)*VirtualCamera.ROTATION_STEP) ));

            vec.getB().setX((bx * java.lang.Math.cos((-1)*VirtualCamera.ROTATION_STEP) ) 
            		- ( by * java.lang.Math.sin((-1)*VirtualCamera.ROTATION_STEP) ));
            vec.getB().setY((bx * java.lang.Math.sin((-1)*VirtualCamera.ROTATION_STEP) ) 
            		+ ( by * java.lang.Math.cos((-1)*VirtualCamera.ROTATION_STEP) ));        
        }
        
        paint();
    }  
    public void turnRight(){
        for(MyVector vec : vectors){
            double ax = vec.getA().getX();
            double ay = vec.getA().getY();
            double bx = vec.getB().getX();
            double by = vec.getB().getY();
            
            vec.getA().setX((ax * java.lang.Math.cos(VirtualCamera.ROTATION_STEP) ) 
            		- ( ay * java.lang.Math.sin(VirtualCamera.ROTATION_STEP) ));
            vec.getA().setY((ax * java.lang.Math.sin(VirtualCamera.ROTATION_STEP) ) 
            		+ ( ay * java.lang.Math.cos(VirtualCamera.ROTATION_STEP) ));

            vec.getB().setX((bx * java.lang.Math.cos(VirtualCamera.ROTATION_STEP) ) 
            		- ( by * java.lang.Math.sin(VirtualCamera.ROTATION_STEP) ));
            vec.getB().setY((bx * java.lang.Math.sin(VirtualCamera.ROTATION_STEP) ) 
            		+ ( by * java.lang.Math.cos(VirtualCamera.ROTATION_STEP) ));        
        }
        
        paint();
    }  
    
    
    public void leanLeft(){
        for(MyVector vec : vectors){
            double ax = vec.getA().getX();
            double az = vec.getA().getZ();
            double bx = vec.getB().getX();
            double bz = vec.getB().getZ();
            
            vec.getA().setX(( ax * java.lang.Math.cos((-1)*VirtualCamera.ROTATION_STEP) ) 
            		+ ( az * java.lang.Math.sin((-1)*VirtualCamera.ROTATION_STEP) ));
            vec.getA().setZ(( (-1) * ax * java.lang.Math.sin((-1)*VirtualCamera.ROTATION_STEP) ) 
            		+ ( az * java.lang.Math.cos((-1)*VirtualCamera.ROTATION_STEP) ));

            vec.getB().setX(( bx * java.lang.Math.cos((-1)*VirtualCamera.ROTATION_STEP) ) 
            		+ ( bz * java.lang.Math.sin((-1)*VirtualCamera.ROTATION_STEP) ));
            vec.getB().setZ(( (-1) * bx * java.lang.Math.sin((-1)*VirtualCamera.ROTATION_STEP) ) 
            		+ ( bz * java.lang.Math.cos((-1)*VirtualCamera.ROTATION_STEP) ));            
        }
        
        paint();
    }
    public void leanRight(){
        for(MyVector vec : vectors){
            double ax = vec.getA().getX();
            double az = vec.getA().getZ();
            double bx = vec.getB().getX();
            double bz = vec.getB().getZ();
            
            vec.getA().setX(( ax * java.lang.Math.cos(VirtualCamera.ROTATION_STEP) ) 
            		+ ( az * java.lang.Math.sin(VirtualCamera.ROTATION_STEP) ));
            vec.getA().setZ(( (-1) * ax * java.lang.Math.sin(VirtualCamera.ROTATION_STEP) ) 
            		+ ( az * java.lang.Math.cos(VirtualCamera.ROTATION_STEP) ));

            vec.getB().setX(( bx * java.lang.Math.cos(VirtualCamera.ROTATION_STEP) ) 
            		+ ( bz * java.lang.Math.sin(VirtualCamera.ROTATION_STEP) ));
            vec.getB().setZ(( (-1) * bx * java.lang.Math.sin(VirtualCamera.ROTATION_STEP) ) 
            		+ ( bz * java.lang.Math.cos(VirtualCamera.ROTATION_STEP) ));            
        }
        
        paint();
    }
    
    public void paint() {
        creator.setVectors(view.projectScene());
        creator.repaint();
    }
    
    public void loadData(double[][] data) {
        for( int i=0; i<data.length; i++  ) {
            Point a = new Point(data[i][0], data[i][1], data[i][2]);
            Point b = new Point(data[i][3], data[i][4], data[i][5]);
            MyVector newVct = new MyVector(a,b);
            vectors.add(newVct);
        }
    }
    
    public void printData() {
        System.out.println("Data:");
        for( int i=0; i<vectors.size(); i++ ) {
            System.out.println(vectors.get(i));
        }
    }

	public SceneCreator getCreator() {
		return creator;
	}

	public void setCreator(SceneCreator creator) {
		this.creator = creator;
	}
}
