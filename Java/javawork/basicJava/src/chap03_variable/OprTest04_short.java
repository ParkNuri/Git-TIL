package chap03_variable;
//�񱳿�����-||,&&(���� ������) - ��� ���� �˻����� �ʰ� ���ǿ� �����ϸ� 
//						   skip�ϴ� ��찡 �߻��Ѵ�.
public class OprTest04_short {
	public static void main(String[]args) {
		int num = 100;
		String str = null; // ���� str�� �ƹ��͵� ������� ���� ����
		//str.length();
		System.out.println(num>=100 || str.length()>10); //or�������϶� ���� ���� true�� �н�
		//System.out.println(num>=100 | str.length()>10); //or�������϶� ���� ���� true���� �� �˻�

		System.out.println(num<100 && str.length()>10); //and�������϶� ���� ���� false�� �н�
		//System.out.println(num<100 & str.length()>10); //and�������϶� ���� ���� false���� �� �˻�
	}
}
