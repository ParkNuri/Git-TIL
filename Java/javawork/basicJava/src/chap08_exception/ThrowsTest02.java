package chap08_exception;

import java.util.Scanner;

// �޼ҵ带 ȣ���ϴ� ������ ���ܸ� ó���ϵ��� ����
public class ThrowsTest02 {
	// test�޼ҵ�� ArithmeticException�� �߻��� �� �ִ� �޼ҵ��
	public int test(int num1, int num2) 
			throws ArithmeticException, NullPointerException { // ��길 �ϴ� �޼ҵ�
		int result = 0;
		System.out.println("__test()__");
		System.out.println("�Է°�:" + num1);
		System.out.println("�Է°�:" + num2);
		result = num1 / num2;
		System.out.println("���:" + result);
		System.out.println("__test()__");
		return result;

	}

	// ���ܸ� ȣ���ϴ� ������ ���� ó���ϱ�
	public void show() { // ���ڸ� �����ϸ� test()�� ȣ���ϴ� �޼ҵ�

		System.out.println("__show()__");
		Scanner key = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		try {
			System.out.print("�����Է�:");
			num1 = key.nextInt();
			System.out.print("�����Է�:");
			num2 = key.nextInt();
			result = test(num1, num2);
		} catch (ArithmeticException e) {
			// num1�� 10�� ����̸� result�� 1000 �Ҵ�
			// num1�� 7�� ����̸� result�� 10000 �Ҵ�
			// �׿� result�� 100�� �Ҵ�
			if (num1 % 10 == 0) {
				result = 1000;
			} else if (num1 % 7 == 0) {
				result = 10000;
			} else {
				result = 100;
			}

		} finally {
			// ������ ����Ǿ�� �ϴ� ��ɹ�
			System.out.println("�׽�Ʈ ȣ�� ���:" + result);
			System.out.println("__show()__");
		}

	}

	public static void main(String[] args) {
		ThrowsTest02 t1 = new ThrowsTest02();
		t1.show();
	}

}
