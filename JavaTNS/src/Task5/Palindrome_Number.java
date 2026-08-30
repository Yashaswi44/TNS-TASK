package Task5;

public class Palindrome_Number {
	public static void main(String[] args) {
		int i=1221;
		int j=i;
		int sum=0;
		while(i!=0) {
			int digit=i%10;
			sum=sum*10+digit;
			i=i/10;
		}
		if(sum==j) {
			System.out.println(j+" is a palindrome number");
		}else {
			System.out.println(j+" is not a palindrome number");
		}
	}
}


	

