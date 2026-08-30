package Task5;

public class Armstrong_Number {
	public void Armstrong() {
		int x=124;
		int y=x;
		int sum=0;
		while(x>0) {
			int z=x%10;
			sum=sum+(z*z*z);
			x=x/10;
		}
		if(sum==y) {
			System.out.println(y+" is an Armstrong Number");
		}else {
			System.out.println(y+" is not an Armstrong Number");
		}
		
	}
}
