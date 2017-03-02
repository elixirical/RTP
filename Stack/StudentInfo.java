public class StudentInfo {
    private int number;
    private String firstName;
    private String lastName;
    private StudentInfo next;

    //allows for declaration of a new StudentInfo object
    public void setStudent (int sn, String fn, String ln) {
	    number = sn;
	    firstName = fn;
	    lastName = ln;
    }

    //allows for declaration of a StudentInfo given another StudentInfo
    public void setStudent ( StudentInfo arg ) {
      number = arg.number;
    	firstName = arg.firstName;
    	lastName = arg.lastName;
    	next = arg.next;
    }

    //independently declares the number of a StudentInfo
    public void setNumber ( int arg ) {
	    number = arg;
    }

    //independently declares the following Stack entry of a StudentInfo
    public void setNext (StudentInfo arg) {
	    next = arg;
    }

    //independently declares the first name of a StudentInfo
    public void setFirstName ( String arg ) {
	    firstName = arg;
    }

    //independently declares the last name of a StudentInfo
    public void setLastName ( String arg ) {
	    lastName = arg;
    }

    //retrieves the student number of a StudentInfo
    public int getNumber () {
	    return number;
    }

    //retrieves the next StudentInfo entry of a stack
    public StudentInfo getNext () {
	    return next;
    }

    //retrieves the first name of a StudentInfo
    public String getFirstName () {
	    return firstName;
    }

    //retrieves the last name of a StudentInfo
    public String getLastName () {
	    return lastName;
    }

}
