/*
	ISYS 320
	Name(s):drew schulte
	Date: april 8
*/

public class P6_Quadrant {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Please enter x");
		double x = console.nextInt();
		System.out.println("Please enter y");
		double y = console.nextInt();
        
		
	}
public static void drew(int x, int y) {
	if (x>0 && y>0)
	System.out.println("Quadrant 1");
	else if (x<0 && y>0)
	System.out.println("Quadrant 2");
	else if (x<0 && y<0)
	System.out.println("Quadrant 3");
	else if (x>0 && y<0)
	System.out.println("Quadrant 4");
	return;
}
}
