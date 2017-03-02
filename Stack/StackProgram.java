class StackProgram {
    public static void main (String [] args) {

	     MyStack theLL = new MyStack();

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

	     System.out.println("three init");
	     theLL.push(studentOne);
	     theLL.push(studentTwo);
	     theLL.push(studentThr);
	     System.out.println(theLL.peek())

	     System.out.println("new head");
	     theLL.push(studentFou);
	     System.out.println(theLL.peek())

	     System.out.println("pop three");
       temp = theLL.pop();
       temp = theLL.pop();
	     temp = theLL.pop();
       System.out.println(theLL.peek())

    }
}
