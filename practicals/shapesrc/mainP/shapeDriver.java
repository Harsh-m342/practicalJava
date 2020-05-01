package mainP;
import rectP2.rectangle;
import circleP3.circle;
import java.util.Scanner;
public class shapeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		Scanner ans=new Scanner(System.in);
		System.out.println("Choose a shape you wnat area of:");
		System.out.println("1.Rectangle"+"\n2.Circle");
		ch=ans.next().charAt(0);
		switch (ch) {
		case '1':
			System.out.print("Enter the length of rectangle:");
			double l=ans.nextDouble();
			System.out.print("Enter the breadth of rectangle:");
			double b=ans.nextDouble();
			rectangle r=new rectangle(l,b);
			System.out.println(r.area());
			break;
		case '2':
			System.out.println("Enter the radius of circle:");
			double rad=ans.nextDouble();
			circle c=new circle(rad);
			System.out.println(c.area());
			break;
		default:
			System.out.println("Wrong input!!");
			break;
		}
		

	}

}
