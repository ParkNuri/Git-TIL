package chap07_oop;
/*
 *	<<��Ӱ��迡�� �����ڰ� ���� Ư¡>> 
 * 	1. Ŭ������ ��� ������ �޼ҵ��� ù ��° ���忡�� �θ�Ŭ������ �⺻�����ڸ� ȣ���ϴ� ��ɹ��� �����Ǿ� �ִ�.
 * 		=> �θ�Ŭ������ �޸𸮿� �Ҵ�Ǿ�� ����� �� �����Ƿ�
 * 		=> �θ��� �����ڸ� ȣ���ϴ� ����� super(...)
 * 		   super()�� �θ��� �Ű����� ���� �⺻������
 * 		=> �̹� �ٸ������ڸ� ȣ���ϴ� ��쿡�� super()�� ȣ���� �� ����.
 * 		   this()�� ȣ���ϴ� ��� super()�� ȣ���� �� ����.
 *  2. ��� Ŭ������ �ֻ���Ŭ������ java.lang.Object Ŭ�����̴�.
 *  	=> �ڹٿ��� ����Ǵ� ��� ��ü�� ���� ������ Ư¡�� ������ Ŭ������ ��ӹް� �ִ� Ŭ������ ���� ��� �����Ϸ��� �ڵ����� ����ϵ��� �Ѵ�.
 *	3. �θ�Ŭ������ ���ǵǾ� �ִ� ��������� ���� �����ؾ� �ϴ� ��쿡�� ����Ŭ�������� ���޵� �� �ֵ��� �����Ѵ�.
 *	   super(��1, ��2,...)�� ���� �����Ѵ�.
 *	   --------------
 *		�θ��� �Ű������� �ִ� �����ڸ� ȣ���ϴ� ���
 */

class SuperA extends java.lang.Object{ // ��� Ŭ������ extends java.lang.Object�� �����Ǿ��ִ�.
	private String name;
	private int age;
	public SuperA() {
		super(); //�����Ǿ��ִ�.
	}
	public SuperA(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
class SubA extends SuperA{
	String addr;
	int point;
	SubA(){
		super(); //��� ������ �޼ҵ��� ù ��° ���忡�� super() ȣ�⹮�� �����Ǿ�����.
	}
	SubA(String addr){
		super();
		this.addr = addr;
	}
	SubA(String addr, int point){
//		super();
		this(addr);		//���� ��ü�� �̹� ���ǵǾ��ִ� �Ǵٸ� �����ڸ� ȣ��
		this.point = point;
		
	}
	SubA(String name, int age,String addr, int point){
//		super();
		super(name, age);
		//this.name = name;
		//this.age = age;
		
		this.addr = addr;
		this.point = point;
	}
	
}
public class InheritanceTest03 {

	public static void main(String[] args) {
		SubA obj = new SubA("�ڴ���",10,"�����",1000);
		System.out.println(obj.getName()+","+obj.getAge()+","+obj.addr+","+obj.point);
	}

}
