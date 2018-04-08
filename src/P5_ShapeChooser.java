import java.util.Scanner;

/*
	ISYS 320
	Name(s):drew schulte
	Date: april 8
*/

public class P5_ShapeChooser {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in); 
		System.out.println("Please enter Tri or Box ");
		String drew = console.next();
		if (drew.equalsIgnoreCase("tri"))
			drawTri();
		else if (drew.equalsIgnoreCase("box"))
			drawBox();
		else
			System.out.println("Error");
	}
	
	private static void drawBox() {
		for( int row = 1; row <=5; row++ ) {
			for( int col = 1; col <=9; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	private static void drawTri() {
		for( int row = 1; row <=5; row++ ) {
			for( int col = 1; col <= 5 - row; col++) {
				System.out.print(" ");
			}
			
			for( int col = 1; col <= 2 * row - 1; col++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
