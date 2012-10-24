package virtualcamera;

import java.util.ArrayList;

public class View {
	private ArrayList<MyVector> vectors;
	private double focal = 300;
	private final static int sceneWidth = 500;
	private final static int sceneHeight = 500;

	public View(ArrayList<MyVector> vectors) {
		this.vectors = vectors;
	}

	public void changeFocal(double value) {
		focal = value;
	}

	public double getFocal() {
		return focal;
	}

	public boolean visiblePoint(Point point) {
		if (point.getY() >= focal) 
			return true;
		else
			return false;
	}

	public ArrayList<My2DVector> projectScene() {
		ArrayList<My2DVector> space = new ArrayList<My2DVector>();

		for (MyVector vec : vectors) {
			Point pointA, pointB;

			pointA = vec.getA();
			pointB = vec.getB();

			if (visiblePoint(pointA) && visiblePoint(pointB)) {
				My2DVector wektor2D = new My2DVector(projectPoint(pointA),
						projectPoint(pointB));
				space.add(wektor2D);
			}
		}

		return space;
	}

	private My2DPoint projectPoint(Point punkt) {
		double k = focal / punkt.getY();
		int x = (int) (k * punkt.getX() + (sceneWidth / 2));
		int y = (int) ((sceneHeight / 2) - k * punkt.getZ());
		return new My2DPoint(x, y);

	}

}
