package chap08_exception;

import java.util.Scanner;

// ���ܰ� �߻��� ������ ���ܸ� ó���ϵ��� ����
// ���ܰ� �߻��� ������ ���ܸ� ó���ϸ� ȣ���ϴ� �������� � ���ܰ� �߻��ߴ��� �� �� ����
// ���ܰ� �߻��� �� ��쿡 ���� �ٸ��� ó���ϰ� �; �� �� ����.
public class ThrowsTest01 {

	public int test(int num1, int num2) {	//��길 �ϴ� �޼ҵ�
		int result=0;
		try {
		System.out.println("__test()__");
		System.out.println("�Է°�:"+num1);
		System.out.println("�Է°�:"+num2);
		result = num1/num2;
		System.out.println("���:"+result);
		System.out.println("__test()__");
		}catch(ArithmeticException e){
			//���ܰ� �߻��ϸ� result�������� 0�� �����Ѵ�.
			result=0;
		}		return result;

	}
	public void show() {	//���ڸ� �����ϸ� test()�� ȣ���ϴ� �޼ҵ�
		System.out.println("__show()__");
		Scanner key = new Scanner(System.in);
		System.out.print("�����Է�:");
		int num1 = key.nextInt();
		System.out.print("�����Է�:");
		int num2 = key.nextInt();
		
		//������ ����Ǿ�� �ϴ� ��ɹ�
		System.out.println("�׽�Ʈ ȣ�� ���:"+test(num1, num2));
		System.out.println("__show()__");
	}
	public static void main(String[] args) {
		ThrowsTest01 t1 = new ThrowsTest01(); 
		t1.show();
	}

}
