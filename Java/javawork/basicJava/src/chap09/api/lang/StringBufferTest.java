package chap09.api.lang;

public class StringBufferTest {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java programming");
		System.out.println("����->"+sb);
		
		//�޼ҵ�
		sb.append(" ��մ�");	//�� ���� �߰�
		System.out.println("����->"+sb);
		
		sb.insert(2, "�ڹ�");	//�ش� �ε����� ����
		System.out.println("����->"+sb);

		sb.delete(2, 6);	//begin ~ end-1 ����
		System.out.println("����->"+sb);
		
		sb.reverse();	//���ڿ��� ������ �Ųٷ�
		System.out.println("����->"+sb);
		
		
	}

}
