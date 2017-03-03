public class MyStack {

    //Literally for the head and tail of the list
    private StudentInfo head;
    private StudentInfo tail;

    int numInList = 0;

    //adding a new item to the stack
    public void push( StudentInfo newHead ) {
	    if (numInList == 0) {
	       tail = newHead;
	       head = newHead;
	    } else if (numInList > 0) {
	       newHead.setNext(head);
	       head = newHead;
	    }
	    numInList++;
    }

    //removing an item from the stack
    public StudentInfo pop() {
	     StudentInfo temp = new StudentInfo();
	     if (numInList == 0) {
		return null;
	     }
	     if (numInList == 1) {
		temp.setStudent(head);
		head.setStudent(null);
		tail.setStudent(null);
		numInList--;
	     } else if (numInList > 1) {
		temp.setStudent(head);
		head.setStudent(head.getNext());
		numInList--;
	     }
	     temp.setNext(null);
	     return temp;
    }

    //look at the topmost item in the stack
    public StudentInfo peek() {
	     return head;
    }

}
