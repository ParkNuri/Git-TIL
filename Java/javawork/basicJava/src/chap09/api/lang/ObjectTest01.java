package chap09.api.lang;


import java.util.Date;
import java.util.Random;

//ObjectŬ������ �ڹٿ��� �ۼ��ϴ� ��� Ŭ������ �ֻ��� Ŭ����
public class ObjectTest01 {

	public static void main(String[] args) {
		Object obj1 = new Object();
		System.out.println(obj1.getClass());	//Ŭ������ ������ return
		System.out.println(obj1.hashCode());	//��ü�� ������ return
		System.out.println(obj1.toString());	//��ü�� �ּ� return - �⺻�޼ҵ�
		System.out.println(obj1);//==obj1.toString()
								  //�⺻�޼ҵ��̹Ƿ� ������ ����
		
		
		Person p1 = new Person("�嵿��",50,"����");
		System.out.println(p1.toString());	//�����ڰ� �ۼ��ϴ� ��� Ŭ��������
											//�������̵��ؾ��Ѵ�.
		System.out.println(p1);				
		
		//API�� Ŭ������..
		Random rand = new Random();
		System.out.println(rand);		//toString �ּ����
		Date d = new Date();			//toString ��¥���(�������̵���)
		System.out.println(d);
		String str = new String("java");//toString str�����(�������̵���)
		System.out.println(str);
	
	
		//=>�츮�� ����� Ŭ������ ������ Ȯ���ϱ����� �׻� toString�� �������̵��ϱ�.
	}
	

}
