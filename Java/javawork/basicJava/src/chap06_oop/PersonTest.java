package chap06_oop;
//Person Ŭ������ ����ϴ� Ŭ����
public class PersonTest {

	public static void main(String[] args) {
		Person p = new Person();
		
		p.name= "�ں���";
		p.addr= "����� ������";
		p.age= 27;	// age������ private���� ����Ǿ� �����Ƿ�
					// ���� ��Ű���� Ŭ���������� ������ �� ����.
		
		System.out.println("����:"+p.name);
		System.out.println("�ּ�:"+p.addr);
		System.out.println("����:"+p.age);

		
		Person p2 = new Person();
		
		p2.name= "�ڴ���";
		p2.addr= "����� ������";
		p2.age= 24;
		
		
		System.out.println("����:"+p2.name);
		System.out.println("�ּ�:"+p2.addr);
		System.out.println("����:"+p2.age);
	}

}
