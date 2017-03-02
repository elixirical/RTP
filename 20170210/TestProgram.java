import hsa.Console;

public class TestProgram {
    public static void main (String[] args) {
	StudentInfo one = new StudentInfo();
	one.studentNumber = 11111;
	one.studentName = "Jennifer K.";
	Console newConsole = new Console();
	newConsole.println(one.studentNumber + one.studentName);
    }
}
