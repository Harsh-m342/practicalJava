package p1;

public class twoDim {
	private double x; //x coordinate
    private double y; //y coordinate
    public twoDim(){ //default constructor
        x=0.0;
        y=0.0;
    }
    public twoDim(double xc,double yc){ //parameterized constructor
        this.x=xc;
        this.y=yc;
    }
    public void tString(){
        System.out.println("X coordinate in 2D:"+x+"\nY coordinate in 2D:"+y);
    }

}
