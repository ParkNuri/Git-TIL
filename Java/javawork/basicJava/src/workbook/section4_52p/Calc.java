package workbook.section4_52p;

public class Calc {
		int[] evenArr = new int[3];
	public int calculate(int data) {
		int sum = 0;
		System.out.print("¦��: ");
		for (int i = 1; i <= data; i++) {
			if(i%2==0) {
				sum+=i;
				System.out.print(i+" ");
			}
		}
		System.out.println();
		return sum;
	}
}
