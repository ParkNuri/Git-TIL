package workbook.section6_82p;

public class Calculator {
	public double plus(int a, int b) {
		System.out.println("��� : "+ (a+b));
		return a+b;
	}
	public double minus(int a, int b) {
		System.out.println("��� : "+ (a-b));
		return a-b;
	}	
	public double multiplication(int a, int b) {
		System.out.println("��� : "+ (a*b));
		return a*b;
	}	
	public double divide(int a, int b) {
		double result=0;
		try {
			result = a/b;
		} catch (ArithmeticException e) {
			System.out.println("Exception�� �߻��Ͽ����ϴ�. �ٽ� �Է����ּ���.");
		}
		System.out.println("��� : "+ result);
		return result;
	}
	
}
