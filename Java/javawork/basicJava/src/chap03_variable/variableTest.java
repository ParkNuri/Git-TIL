package chap03_variable;

public class variableTest {

	public static void main(String[] args) {

		int i = 10;
		int j = 10;
		
		System.out.println("==============�⺻��==============");
		if(i==j) {
			System.out.println("�⺻�� ����.");
			
		}
		else {
			System.out.println("�⺻�� �ٸ���.");
		}
		
	
		//������ ����
		String str1 = new String("java");
		String str2 = new String("java"); // �ּ� ����
		
		if(str1==str2) {
			System.out.println("������ ����.");
		}
		else {
			System.out.println("������ �ٸ���.");
		}
		
		//���ڿ� �� - StringŬ���� �޼ҵ�� ó��
		//���ڿ� �񱳴� ������ equals �̿��ؼ� ���Ѵ�.
		//==�ȵ�!!
		if(str1.equals(str2)) {	// equals-> String Ŭ���� ���� value ��
			System.out.println("���ڿ� ����.");
		}else {
			System.out.println("���ڿ� �ٸ���.");

		}
		
	}
}
