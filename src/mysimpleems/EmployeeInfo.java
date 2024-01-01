package mysimpleems;


public class EmployeeInfo {

    
    // ATTRIBUTES
    protected int empNum;
    protected String firstName;
    protected String lastName;
    protected int gender; // encode e.g. 0 for M, 1 for F, etc.
    protected int workLoc; // encode e.g. 0 for Mississauga, etc.
    protected double deductRate; // e.g. 0.21 for 21%
    
    
    // CONSTRUCTORS
    
    public EmployeeInfo(int eN, String fN, String lN, int g, int wL, double dR) {
    	empNum = eN;
    	firstName = fN;
    	lastName = lN;
    	gender = g;
    	workLoc = wL;
    	deductRate = dR;
    }
    
    
    // METHODS
    
    public int getEmpNum() {
    	return empNum;
    }
    
    public String getFirstName() {
    	return firstName;
    }
    
    public String getLastName() {
    	return lastName;
    }
    
}
