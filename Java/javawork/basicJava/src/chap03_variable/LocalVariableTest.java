package chap03_variable;
//�������� - { }(��) �ȿ��� ����� ����
//		    ����� ���� ����Ǹ� �޸𸮿��� ����
//		  1) ����� �� ���ο����� ����� ����
//		  2) �ݵ�� �ʱ�ȭ �۾��� �ؾ��Ѵ�.
public class LocalVariableTest {

	public static void main(String[] args) {
		int num = 90;
		int sum;
		if(num>=90) {
			String str = new String("�հ�");
			//sum+=100;	//2)sum������ main�޼ҵ� ������ ����� ���������̹Ƿ�
						//�ʱ�ȭ �۾��� ���� �ʰ� ����� �� ����.
		}
		//System.out.println(str); //1)str������ if������ ����Ǿ����Ƿ�
								 //if�� �ۿ����� ������ �� ����.
		
	}

}
