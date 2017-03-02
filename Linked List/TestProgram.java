class TestProgram {
    public static void main (String [] args) {
	MyLL theLL = new MyLL();
	
	StudentInfo studentOne = new StudentInfo();
	studentOne.number = 123435;
	studentOne.firstName = "HAL";
	studentOne.lastName = "9000";
	studentOne.next = null;
	
	StudentInfo studentTwo = new StudentInfo();
	studentTwo.number = 234546;
	studentTwo.firstName = "IBM";
	studentTwo.lastName = "8000";
	studentTwo.next = null;
	
	StudentInfo studentThr = new StudentInfo();
	studentThr.number = 345657;
	studentThr.firstName = "JCN";
	studentThr.lastName = "7000";
	studentThr.next = null;
	
	StudentInfo studentFou = new StudentInfo();
	studentFou.number = 456768;
	studentFou.firstName = "KDO";
	studentFou.lastName = "6000";
	studentFou.next = null;
	
	StudentInfo temp;
	
	System.out.println("three init");
	theLL.addToTail(studentOne);
	theLL.addToTail(studentTwo);
	theLL.addToTail(studentThr);
	
	theLL.printLL(theLL.head);
	
	System.out.println("tail gone");
	temp = theLL.removeFromTail();
	
	theLL.printLL(theLL.head);
	
	System.out.println("new tail");
	theLL.addToTail(studentFou);
	
	theLL.printLL(theLL.head);
	
	System.out.println("head gone");
	temp = theLL.removeFromHead();
	
	theLL.printLL(theLL.head);
	
	System.out.println("new head");
	theLL.addToHead(studentThr);

	theLL.printLL(theLL.head);
    }
}
