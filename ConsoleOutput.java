// The "ConsoleInputOutput" class.
import hsa.Console;
public class ConsoleOutput
{
    public static void main (String[] args)
    {
	Console c = new Console ("Input and Output");
	// Input the information from the keyboard
	// We also declare each new variable as needed
	c.println ("Console Input");
	c.print ("Please enter your name: ");
	String name = c.readLine ();
	c.print (name + ", please enter an integer number: ");
	int myInteger = c.readInt ();
	c.print (name + ", please enter a real number with decimals: ");
	double myDouble = c.readDouble ();
	c.print ("Press any key to continue ");
	char myChar = c.getChar ();
	c.clear ();
	// Output the information into the console window
	c.println ("Console Output");
	c.print ("User Name: ");
	c.println (name);
	c.print ("The integer number entered was: ");
	c.println (myInteger);
	c.print ("The double number entered was: ");
	c.println (myDouble);
	c.print ("The character entered was: ");
	c.println (myChar);
	c.println ("End of Program");
    } // main method
} // ConsoleInputOutput class
