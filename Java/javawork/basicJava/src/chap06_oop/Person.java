package chap06_oop;
//Ŭ������ �����ϰ� ��������� �����ϴ� ���
// - ��������� �����Ҷ��� Ư���� ��츦 �����ϰ� �ʱⰪ�� ���� �ʴ´�.
// - �ʱⰪ�� �������� �ʾƵ� �������� null, ������ 0, �Ǽ��� 0.0, boolean�� false
// - ��������� �����Ҷ� ���� �����ڸ� �߰��ؼ� ������ ������ �� �ִ�.
// public 
// default
// protected
// private
// Ŭ������ �����Ҷ� ��������� private���� �����ؼ� �ܺο��� ������ �� ������ ������ �����ϰ�
// public �޼ҵ带 ���ؼ� ������ �� �ֵ��� �����Ѵ�.
public class Person {
	@Override
	public String toString() {
		return "Person name=" + name + ", addr=" + addr + ", age=" + age ;
	}
	private String name;	//class�� Ư���� ��Ÿ���� ������
	private String addr;	// : ������� or �ʵ�
	private int age;		// ������ �������� x
	
	public Person() {
		
	}
	public Person(String name, String addr, int age){
		this.name = name;
		this.addr = addr;
		this.age = age;
	}
	//Person p = new Person();
	
	//��� ��������� private���� ����Ǿ� �ֱ� ������ ���� �����ϴ� �޼ҵ��
	//���� ������ �� �ִ� �޼ҵ尡 �ʿ��ϴ�.
	//�̷� ������ �ϴ� �޼ҵ带 �����ϴ� ���
	
	//name������ ���� �����ϴ� �޼ҵ�	(setter)
	//�޼ҵ�� : set + ���������(ù���ڸ� �빮�ڷ� �ٲ�)
	//		 setName
	
	public void setName(String name) {
//		name = name;	// ���� �������ִ� ������ �ν� (���⼱ �Լ� �Ű����� String name)
		this.name = name;
	}//Setter �޼ҵ�
	//security coding�� ���� ������ȣ�� �Բ� �Ű������� �޾� �Լ� ������ ���� ������ ���ľ��Ѵ�.
	
	//name������ ����� ���� ȣ���ϴ� ������ �Ѱ��� �޼ҵ�
	//�޼ҵ��: get + ���������(ù ���ڸ� �빮�ڷ� �ٲ�)
	//		 getName		
	public String getName() {
		
		//return this.name;	//�浹�� �Ͼ�� ���� ��Ȳ���� this ������� �ʾƵ� ����
		return name;
	}//Getter �޼ҵ�
	
	
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}


}
