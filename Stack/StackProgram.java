class StackProgram {
    public static void main (String [] args) {

	     MyStack theStack = new MyStack();

	     // declare 4 different studen infos
	     StudentInfo studentOne = new StudentInfo();
	     studentOne.setStudent(123435, "HAL", "9000");
	     studentOne.setNext(null);

	     StudentInfo studentTwo = new StudentInfo();
	     studentTwo.setStudent(234546, "IBM", "8000");
	     studentTwo.setNext(null);

	     StudentInfo studentThr = new StudentInfo();
	     studentThr.setStudent(345657, "JCN", "7000");
	     studentThr.setNext(null);

	     StudentInfo studentFou = new StudentInfo();
	     studentFou.setStudent(456768, "KDO", "6000");
	     studentFou.setNext(null);

	     StudentInfo temp;
	     
	     temp = theStack.pop();
	     System.out.println(temp);
	     
	     System.out.println("three init");
	     theStack.push(studentOne);
	     theStack.push(studentTwo);
	     theStack.push(studentThr);
	     System.out.println(theStack.peek().getFirstName());

	     System.out.println("new head");
	     theStack.push(studentFou);
	     System.out.println(theStack.peek().getFirstName());

	     System.out.println("pop three");
	     theStack.pop();
	     theStack.pop();
	     theStack.pop();
	     System.out.println(theStack.peek().getFirstName());

    }
}
