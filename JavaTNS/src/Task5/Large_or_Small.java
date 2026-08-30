package Task5;

public class Large_or_Small {
	public static void main(String[] args) {
		int a=24;
		int b=18;
		int c=22;
		if(a>b && a>c) {
			System.out.println(a+": is a largest number");
		}else if (b>a && b>c){
			System.out.println(b+": is a largest number");
			
		}else {
			System.out.println(c+": is a largestnumber");
		}
	}
}
