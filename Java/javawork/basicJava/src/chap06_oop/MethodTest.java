package chap06_oop;

import java.awt.DisplayMode;

import workbook.section3.Student;

//�޼ҵ��� �Ű������� ����Ÿ������ ������, �迭 , �⺻�� ��� ����� �� �ִ�.
public class MethodTest {

	public static void main(String[] args) {
		Person p = new Person("�嵿��", "����", 46);
		
		display(p.getName(),p.getAddr(),p.getAge());
		display(p);//Person��ü�� �Ű������� �Ѱ��� �� �ִ�.
		
	}
	public static void display(String name, String addr, int age) {
		System.out.println("�̸�: "+name+"\t�ּ�: "+addr+"\t����: "+age);
	}
	//������ �ѹ��� �ѱ�� ������
	public static void display(Person p) {
		System.out.println(p.toString());
	}
	//�޼ҵ带 �����Ҷ� �� ���� ���� ������ �� �ִµ�
	//������ Ÿ���� �����͸� ���� �� �����ؾ� �Ѵٸ� 
	//�迭�� ����Ÿ������ �����ϰ� ����� �� �ִ�.
	public static int[] addNumber() {
		int[] i = new int[3];
		i[0]=100;
		i[1]=200;
		i[2]=300;
		
		return i; 
	}
	//Ÿ���� �ٸ� ���� ���� �����͸� �����ϰ� ���� ���
	//�迭�� ������ �� �����Ƿ� �����ϰ� ���� ���� �����ִ� ��ü�� �����ؼ�
	//������ �� �ִ�.
	public static Student getInfo() {
		//Student�� ��� ������ ����
		return new Student("�嵿��", 90,100,50,66);
	}
}
