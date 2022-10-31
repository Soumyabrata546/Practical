package PallabiMaam;

public class ArrayMethod {
static int[] get() {//method which return an array
	return new int[] {2,3,4,5};
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]=get();
for(int i: arr)
	System.out.println(i);
	}

}
