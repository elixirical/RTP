class QueueProgram {
    public static void main (String[] args) {

	MyQueue theQueue = new MyQueue ();

	StudentInfo studentOne = new StudentInfo ();
	studentOne.setStudent (123435, "HAL", "9000");
	studentOne.setNext (null);

	StudentInfo studentTwo = new StudentInfo ();
	studentTwo.setStudent (234546, "IBM", "8000");
	studentTwo.setNext (null);

	StudentInfo studentThr = new StudentInfo ();
	studentThr.setStudent (345657, "JCN", "7000");
	studentThr.setNext (null);

	StudentInfo studentFou = new StudentInfo ();
	studentFou.setStudent (456768, "KDO", "6000");
	studentFou.setNext (null);

	StudentInfo temp;

	temp = theQueue.dequeue();
	System.out.println(temp);

	System.out.println ("three init");
	theQueue.enqueue (studentOne);
	theQueue.enqueue (studentTwo);
	theQueue.enqueue (studentThr);
	System.out.println (theQueue.peek ().getFirstName ());

	System.out.println ("new tail");
	theQueue.enqueue (studentFou);
	System.out.println (theQueue.peek ().getFirstName ());

	System.out.println ("remove three from head");
	theQueue.dequeue ();
	theQueue.dequeue ();
	theQueue.dequeue ();
	System.out.println (theQueue.peek ().getFirstName ());

    }
}
