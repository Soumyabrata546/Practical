package PallabiMaam;

public class Mul2Arrays {
public static void main(String[] args) {
	int a[][]= {{1,2,3},{2,3,4},{3,4,5}};
	int b[][]=	{{1,1,1},{2,2,2},{3,3,3}};
	//for storing result creating another array
	int c[][]=	new int [3][3];
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			
			for(int k=0;k<3;k++)
			c[i][j]=(a[i][k]*b[k][j])+c[i][j];
		}
}
	
	
}
}
