import java.util.Scanner;

/*
	ISYS 320
	Name(s):drew schulte
	Date: april 8
*/

public class P4_ColorNamer {

	public static void main(String[] args) {
Scanner console = new Scanner(System.in); 
System.out.println("What color should be named?");
String drew = console.next();
if (drew.equalsIgnoreCase("r")) 
	System.out.println("The name is red");
else if (drew.equalsIgnoreCase("g")) 
	System.out.println("The name is green");
else if (drew.equalsIgnoreCase("b")) 
	System.out.println("The name is blue");
else 
	System.out.println("Error: I dont know what " + drew + " is");
}
	}


