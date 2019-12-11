package chap07_oop;

import java.util.Random;

public class StaticMethodDemoTest {

	public static void main(String[] args) {
		//API�� static �޼ҵ� �����ϱ�
		// => static����� �ν��Ͻ��� ������ �ƴϹǷ� ������ Ŭ���������� �����Ѵ�.
		//static �޼ҵ�(Ŭ���� �޼ҵ�)�� ȣ��
		System.out.println(Math.PI);
		System.out.println(Math.random());
		System.out.println(StaticDemo.staticNum);
		
		//non-static �޼ҵ�(�Ϲ� �޼ҵ�- �ν��Ͻ� �޼ҵ�)
		//��ü������ �� �Ŀ� ���������� ���ؼ� �׼���
		Random rand = new Random();
		System.out.println(rand.nextInt());
		
		StaticMethodDemo staticD = new StaticMethodDemo();
		staticD.display();
		StaticMethodDemo.staticTest1();
		
	}

}
