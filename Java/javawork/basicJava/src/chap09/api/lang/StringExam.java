package chap09.api.lang;

public class StringExam {

	public static void main(String[] args) {
		//str1�� AVAJ�� ��µǰ� �����ϱ�
		//��, StringBuffer�� reverse()���x
		//	  String�� toCharArray() ���x
		//	 StringŬ������ charAt�� toUpperCase()���
		String str1 = "java";
		String str2 = str1.toUpperCase();
		for (int i = str2.length()-1; i >= 0 ; i--) {
			System.out.print(str2.charAt(i));
		}
	}

}
