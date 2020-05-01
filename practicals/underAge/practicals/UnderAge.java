package practicals;
public class UnderAge extends Exception {
	// member variable for Exception Description
    String expDescription;
 
    // public constructor with String argument
    UnderAge(String expDescription) {
    	super(expDescription);
    }

}


