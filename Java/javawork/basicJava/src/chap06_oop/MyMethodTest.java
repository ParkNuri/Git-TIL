package chap06_oop;
//MyMethodŬ�������� ������ �޼ҵ带 ����ϴ� Ŭ����
public class MyMethodTest {

	public static void main(String[] args) {
		
		System.out.println("----------���α׷� ����----------");
		MyMethod m = new MyMethod();
		//1. �Ű������� ���� ���ϰ��� ���� �޼ҵ�
		m.display();
		System.out.println("++++++step1++++++");
		m.display();
		System.out.println("++++++step2++++++");
		m.display();
		
		//2. �Ű������� �� ��, ���ϰ��� ���� �޼ҵ��� ȣ��
		m.display("��");
		m.display("��");
		m.display("��");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		//3. ���ϰ��̾��� �Ű������� �� ���� �޼ҵ�
		m.display(16,"��", 1);
		m.display(5,"��", 3);
		m.display(4,"��", 5);		
		m.display(6,"��", 7);	//diplay(int,String,int)
		m.display(2,"��", 9);
		m.display("��", 11);		//display(String,int)
		m.display(16,"��", 1);
		m.display(16,"��", 1);
		//m.display(16,"");	// diplay(int,String)
		System.out.println();
		System.out.println();
		//�Ű������� ���ϰ��� �ִ� �޼ҵ��� ȣ��
		//�޼ҵ带 ȣ���ϴ� ��� ���ϰ��� �����ϴ� �޼ҵ��� ���ϰ���
		//�� ������ Ÿ���� ������ �����ؼ� ������ �־�� �Ѵ�.
		//�� �ٸ� �޼ҵ��� �Ű������� ������ �� �ִ�.
		int result=m.add(100, 200);
		//��
		System.out.println("�޼ҵ� ȣ�� �����..."+result);
		//��
		System.out.println("�޼ҵ� ȣ�� 2:"+m.add(200, 100));
	}
	

}
