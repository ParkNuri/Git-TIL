package chap06_oop;
//Person Ŭ������ ����ϴ� Ŭ����
public class PersonTest {

	public static void main(String[] args) {
		Person p = new Person();
/*		
		p.name= "�ں���";
		p.addr= "����� ������";
		p.age= 27;	// age������ private���� ����Ǿ� �����Ƿ�
					// ���� ��Ű���� Ŭ���������� ������ �� ����.
*/		
		
		p.setName("�ں���");
		p.setAddr("����� ������");
		p.setAge(27);	// age������ private���� ����Ǿ� �����Ƿ�
					// ���� ��Ű���� Ŭ���������� ������ �� ����.
/*
		System.out.println("����:"+p.name);
		System.out.println("�ּ�:"+p.addr);
		System.out.println("����:"+p.age);
*/

		System.out.println("����:"+p.getName());
		System.out.println("�ּ�:"+p.getAddr());
		System.out.println("����:"+p.getAge());

		
		Person p2 = new Person();
		
		/*
		p2.name= "�ڴ���";
		p2.addr= "����� ������";
		p2.age= 24;
		*/
		
		p2.setName("�ڴ���");
		p2.setAddr("����� ������");
		p2.setAge(24);

		
		System.out.println("����:"+p2.getName());
		System.out.println("�ּ�:"+p2.getAddr());
		System.out.println("����:"+p2.getAge());

		
		//������ ���
		Person p3 = new Person("�ڴ���", "����� ������", 24);
		
		System.out.println("����:"+p3.getName()+"�ּ�:"+p3.getAddr()+"����:"+p3.getAge());
	}

}
