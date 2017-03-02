public class MyLL {
    
    //Literally for the head and tail of the list
    StudentInfo head;
    StudentInfo tail;

    int numInList = 0;
    
    public void addToTail( StudentInfo itemToAdd ) {
	if (numInList == 0) {
	    head = itemToAdd;
	    tail = itemToAdd;
	} else if (numInList >= 1) {
	    tail.next = itemToAdd;
	    tail = itemToAdd;
	}
	numInList++;
    }
    
    public void findPreviousFromTail ( StudentInfo headStudent, int count ) {
	if (count < numInList-1) {
	    findPreviousFromTail( headStudent.next, count+1 );
	} else if (count == numInList-1) {
	    headStudent.next = null;
	    tail = headStudent;
	    numInList--;
	}
    }
    
    public StudentInfo removeFromTail() {
	StudentInfo temp = new StudentInfo();
	if (numInList == 1) {
	    temp = tail;
	    tail = null;
	    head = null;
	} else if (numInList == 2) {
	    temp = tail;
	    tail = head;
	    head.next = null;
	} else if (numInList > 2) {
	    temp = tail;
	    tail = null;
	    findPreviousFromTail(head, 1);
	} 
	numInList--;
	return temp;
    }
    
    public void addToHead( StudentInfo newHead ) {
	if (numInList == 0) {
	    tail = newHead;
	    head = newHead;
	} else if (numInList > 0) {
	    newHead.next = head;
	    head = newHead; 
	}
	System.out.println(numInList);
	numInList++;
	System.out.println(numInList);
    }
    
    public StudentInfo removeFromHead() {
	StudentInfo temp = new StudentInfo();
	if (numInList == 1) {
	    temp = head;
	    head = null;
	    tail = null;
	} else if (numInList > 1) {
	    temp = head;
	    head = head.next;
	    temp.next = null;
	}
	numInList--;
	return temp;
    }
    
    public void printLL ( StudentInfo headStudent ) {
	if (numInList > 0) {
	    System.out.print (headStudent.number);
	    System.out.print (' ' + headStudent.firstName + ' ');
	    System.out.println(headStudent.lastName);
	    if ((numInList > 1) && (headStudent.next != null)) {
		printLL( headStudent.next );
	    }
	}
    }
}
