package p2;
import p1.twoDim;
public class threeDim extends twoDim {
	private double z;
	public threeDim(){
		super();
		this.z=0.0;
	}
	public threeDim(double xc,double yc,double zc){
		super(xc,yc);
		this.z=zc;
	}
	public void tString() {
		System.out.println("Z coordinate in 3D:"+z);
	}
	
}
