public class MyQueue {

    //the head of the queue, and the number of items in the queue
    StudentInfo head;
    int numInList = 0;

    //adds a studentinfo to the end of the queue
    public void enqueue (StudentInfo newEntry) {
	if (numInList > 0) {
	    //if there is already an entry in the queue, then the following function is called
	    enqueue (newEntry, head, 1);
	} else if (numInList == 0) {
	    head = newEntry;
	    numInList++;
	}
    }


    //second part of the enqueue function
    public void enqueue (StudentInfo newEntry, StudentInfo cycle, int count) {
	if (count < numInList) {
	    // calls itself with the next entry in the queue until the end is reached
	    enqueue (newEntry, cycle.getNext (), count + 1);
	} else if (count == numInList) {
	    // once the last entry is reached, the new entry is appended to its next
	    cycle.setNext (newEntry);
	    numInList++;
	}
    }


    // removes s student info from the front if the queue
    public StudentInfo dequeue () {
	StudentInfo temp;
	if (numInList == 1) {
	    temp = head;
	    head = null;
	    numInList--;
	} else if (numInList > 1) {
	    temp = head;
	    head.setStudent (head.getNext ());
	    numInList--;
	}
	temp = null;
	return temp;
    }


    // look at the front of the queue
    public StudentInfo peek () {
	return head;
    }
}
