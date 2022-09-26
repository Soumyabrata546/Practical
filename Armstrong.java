public class Armstrong{
public static void main(String args[]){
int num=371,originalNumber,remainder,result=0;
originalNumber=num;
while(originalNumber!=0){
remainder=originalNumber%10;
result+=Math.pow(remainder,3);
originalNumber/=10;
//originalNumber=originalNumber/10
}
if(result==num)
//to check equal to number or not
System.out.println(num+" is an armstrong number");
else
System.out.println(num+" is not an armstrong number");
}
}