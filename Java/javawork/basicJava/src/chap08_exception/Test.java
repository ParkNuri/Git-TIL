package chap08_exception;

public class Test {

	public static void main(String[] args) {
		ThrowsTest01 obj = new ThrowsTest01();
		
		int num = obj.test(100,0);
		System.out.println("(Test)���:"+num);
		ThrowsTest02 obj2 = new ThrowsTest02();
		
		int inputNum = 100;//�ܺο��� �Է¹��� ��
		int num2 = 0;
		try {
			num2=obj2.test(100, 0);
		}catch(ArithmeticException e) {
			//¦���� 100,000 Ȧ���� 0
			if(inputNum%2==0) {
				num2 = 100000;
			}
			else {
				num2 = 0;
			}
		}
		System.out.println("���!!!!!!!!!"+num2);
	}

}// ���������� ����ó�� ����
