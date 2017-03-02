class QueueProgram {
    public static void main (String [] args) {

    	MyQueue theLL = new MyQueue();

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
    	theLL.enqueue(studentOne);
    	theLL.enqueue(studentTwo);
    	theLL.enqueue(studentThr);
    	System.out.println(theLL.peek());

    	System.out.println("new tail");
    	theLL.enqueue(studentFou);
      System.out.println(theLL.peek());

    	System.out.println("remove three from head");
    	theLL.dequeue();
    	theLL.dequeue();
    	theLL.dequeue();
    	System.out.println(theLL.peek());

    }
}
