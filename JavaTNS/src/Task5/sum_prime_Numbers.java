package Task5;

public class sum_prime_Numbers {
		public static void main(String[] args) {
			int count=0;
			int sum=0;
			int num=2;
			while(count<10) {
				int factors=0;
				for(int i=1; i<=num; i++) {
					if(num%i==0) {
						factors++;
					}
				}
				if(factors==2) {
					sum=sum+num;
					count++;
				}
				num++;
			}
			System.out.println("sum of first 10 prime numbers: "+sum);
		}
}