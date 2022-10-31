package PallabiMaam;
//finding maximum in an array
public class PassingArrayToMethod {
	static void max(int arr[]) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i])
				max=arr[i];
		}
		System.out.println(max);
	}
public static void main(String[] args) {
	//
int a[]= {5,7,9,2,3};
max(a);
}
}
