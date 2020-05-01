package circleP3;
import shapeP1.shape;
public class circle extends shape{
	protected double rad;
	public circle(double radius){
		this.rad=radius;
	}
	public double area() {
		return (3.14*rad*rad);
	}

}
