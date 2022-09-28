package Fresh;
public class pattern {
	public static void printTriangle(int n) {// method
		// outer loop to handle no. of rows,n in this program
		for (int i = 0; i <= n; i++) {
			// inner loop to handle number of spaces
			for (int j = n - i; j >= 1; j--) {
				System.out.print(" ");
			}
			// inner loop to handle no. of columns *
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			// ending line after each row
			System.out.println();// calling method
		}
	}

	public static void main(String[] args) {
		int n = 5;
		printTriangle(n);
	}

}