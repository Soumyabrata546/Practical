package PallabiMaam;

public class DuplicateValue {
	public static void main(String[] args) {
	int []arr= {4,3,4,7,5,6,3,4,5,};
	
	int count=1;
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++)
			if(arr[i]==arr[j]) {
				System.out.print(arr[i]+" ");
				break;
			}
		
	}
	
	}
}
