package app2;
/*
 * ���� ����п� ����..
 * 
 * oop�� ����Ǿ� �ִ� ���α׷�
 * oop Ư���� �����ϱ� ���� ����Ŭ������ �����ϰ� MyBeanStyleXXX Ŭ������ ����ϴ� �Ű������� Ÿ���� ����Ÿ������ �����ϸ� �������� ����.
 * ���Ǵ� ��ü�� ����Ǵ��� �ڵ带 �����ϴ� ������ �پ���.
 * �׷��� ���� ��ü�� �����ؼ� �����ϰ��ִ�.
 * ����ϴ� ��ü�� �ٲ𶧸��� ��ü�� ���� �����ϴ� �ڵ带 ��� �����ؾ� �Ѵٴ� ������ ������.
 * ����ϴ� ������ ���� new�ؼ� ��ü�� �����ϴ� �ڵ�� �������� �Ѵ�.
 * 
 */

public class MyBeanTest {

	public static void main(String[] args) {
		MyBeanStyleA obj = new MyBeanStyleA();
		
		MyBeanStyleB obj1 = new MyBeanStyleB();
		run(obj);
		show(obj);
		run(obj1);
		show(obj1);

	}
	public static void run(MyBeanStyle obj) {
		System.out.println("*****************************************");
		obj.testHello("����");
		obj.testHello("����");		
		System.out.println("*****************************************");
	}
	
	public static void show(MyBeanStyle obj) {
		System.out.println("*****************************************");
		obj.testHello("����");
		obj.testHello("����");		
		System.out.println("*****************************************");
	}
	

}
