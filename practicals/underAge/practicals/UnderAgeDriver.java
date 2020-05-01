package practicals;
import java.util.Scanner;
public class UnderAgeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your Age for registering driving license");
 
        // to take input from user
        Scanner scanner = new Scanner(System.in);
        int userAge = scanner.nextInt();
 
        // try-catch blocks for User-defined Exception
        try {
 
            if(userAge < 0) {
 
                throw new UnderAge("Enter a VALID age for obtaining driving license");
            }
            else if(userAge < 18) {
 
                throw new UnderAge("To obtain a driving license age should be more than 18 years old");
            }
            System.out.println("Approved to apply for driving license !!");
        }
        catch(UnderAge uae) {
            System.out.println(uae);
        }

	}

}
