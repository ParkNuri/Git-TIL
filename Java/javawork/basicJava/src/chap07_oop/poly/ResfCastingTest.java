package chap07_oop.poly;
//��ü�� ����ȯ - ��Ӱ��迡 �ִ� ��쿡�� �����ϴ�.
class Parent{
	String name="�嵿��";
	public void display() {
		System.out.println("�θ��� display");
	}
}
class Child extends Parent{
	String name = "�̹�ȣ";
	public void display() {
		System.out.println("�ڽ��� display");
	}
	public void test() {
		System.out.println("����Ŭ�������� ���ǵ� �޼ҵ�");
	}
}
public class ResfCastingTest {
	public static void main(String[] args) {
		System.out.println("1. superŸ���� ���������� Super��ü�� ����");
		Parent obj1 = new Parent();
		obj1.display();
		System.out.println(obj1.name);
		
		System.out.println("=======================================\n");
		
		System.out.println("2. subŸ���� ���������� Sub��ü�� ����");
		Child obj2 = new Child();
		obj2.display();
		System.out.println(obj2.name);

		System.out.println("=======================================\n");
		
		/*��ü�� ����ȯ
		 * - ������ ��������Ÿ�Կ� ���� ����, �޼ҵ�� �����Ǵ� ��ü�� ����
		 */
		System.out.println("3. superŸ���� ���������� Sub��ü�� ����");
		Parent obj3 = new Child();	//�ڵ� ����ȯ 
		obj3.display();	//�޼ҵ�: �������̵��� �޼ҵ��� �������̵��� �޼ҵ尡 ȣ��
		System.out.println(obj3.name);	//���� : �������� Ÿ�Կ� �ش��ϴ� 
										//	      ������� ����
	
		//Ÿ���� Parent Ÿ�������� ������ ������ ��ü�� ChildŸ���̱� ������
		//ChildŸ������ ����ȯ�� �����ϴ�.(�����)
		//obj3.test();	//child�� ���� �Ұ�
		
		((Child)obj3).test();
		
		System.out.println("=======================================\n");
		
		System.out.println("4. subŸ���� ���������� Super��ü�� ���� ---(�Ұ�)");
//		Child obj4 = new Parent();
//		----------
//		�����̵Ǵ� ��ü
		obj2.display();
		System.out.println(obj2.name);

		
		System.out.println("=======================================\n");
		
		System.out.println("5. subŸ���� �������� = SuperŸ���� ��������(Super��ü�� �����ϴ�)---(�Ұ�)");
		//��������� ����ȯ�� �ؼ� �����Ϸ��� �ӿ����� ��������� ĳ������ �Ϸ��� �Ҷ� 
		//obj1�� Child ������ �������� �����Ƿ� ĳ���� ���ܹ߻�
//		Child obj5 = (Child)obj1;	
		obj2.display();
		System.out.println(obj2.name);
				
		System.out.println("=======================================\n");
		
		System.out.println("6. subŸ���� �������� = SuperŸ���� ��������(Sub��ü�� �����ϴ�)---(����)");
		//��������� ����ȯ�� �ؼ� �����Ϸ��� �ӿ����� ��������� ĳ������ �Ϸ��� �Ҷ� 
		//obj1�� Child ������ �������� �����Ƿ� ĳ���� ���ܹ߻�
		Child obj6 = (Child)obj3;	
		System.out.println(obj6.name);
		obj6.display();
		obj6.test();
		
		
		Parent obj7 = obj2;//��ĳ���� child->parent
		Child obj8 = (Child)obj7;//�ٿ�ĳ���� parent->child
	
		
		
		
		
		
		
		
		
		
		
		
		//p.358
		Parent obj9 = null;
		Child obj10 = new Child();
		Child obj11 = null;
		
		obj9=obj10;	//obj9�� obj10�� ĳ���������� obj9=new Child();�� ����
		obj11 = (Child)obj9;
		obj11.test();

	}

}




