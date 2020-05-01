package rectP2;
import shapeP1.shape;
public class rectangle extends shape {
	protected double len;
	protected double wid;
	public rectangle(double l,double w){
		this.len=l;
		this.wid=w;
	}
	public double area() {
		return (len*wid);
	}
		
}
