package chap07_oop;

final class FinalSuper{
	public final void display() {
		System.out.println("super diplay");
	}
}
class FinalSub extends FinalSuper{	//final Ŭ������ ��� �Ұ�.
	static final int NUM = 100;	//����� �빮�ڷ� naming

	//@Override
	/*public void display() {	//final �޼ҵ�� overiding�� �� ����.
		System.out.println("diplay");
	}*/
	
}
public class FinalTest {

	public static void main(String[] args) {
		FinalSub obj = new FinalSub();
		//obj.NUM = 1000;	//����̹Ƿ� ���� ������ �� ����.
		System.out.println(FinalSub.NUM);	//static�����̱� ������ Ŭ���������� ����
	}

}
