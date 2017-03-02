public class StudentInfo {
    private int number;
    private String firstName;
    private String lastName;
    private StudentInfo next;

    public void setStudent (int sn, String fn, String ln) {
    	number = sn;
    	firstName = fn;
    	lastName = ln;
    }

    public void setStudent ( StudentInfo arg ) {
    	number = arg.number;
    	firstName = arg.firstName;
    	lastName = arg.lastName;
    	next = arg.next;
    }

    public void setNumber ( int arg ) {
    	number = arg;
    }

    public void setNext (StudentInfo arg) {
    	next = arg;
    }

    public void setFirstName ( String arg ) {
    	firstName = arg;
    }

    public void setLastName ( String arg ) {
    	lastName = arg;
    }

    public int getNumber () {
    	return number;
    }

    public StudentInfo getNext () {
    	return next;
    }

    public String getFirstName () {
    	return firstName;
    }

    public String getLastName () {
    	return lastName;
    }

}
