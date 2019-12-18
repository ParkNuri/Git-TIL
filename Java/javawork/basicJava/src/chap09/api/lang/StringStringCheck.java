package chap09.api.lang;
//String�� StringBuffer�� ���� ��
public class StringStringCheck {
	//String�� �۾��� üũ�ϴ� �޼ҵ�
	public static void stringCheck(int count) {
		//�����Ҷ� �ð� ���� - nano ��
		String str = new String("�ڹ�");
		for (int i = 0; i <= count; i++) {
			str = str + "java";
		}
		long start = System.nanoTime();
		
		for (int i = 0; i <= count ; i++) {
			str = str + "java";
		}
		long end = System.nanoTime();
		long time = end-start;
		System.out.println("str=str+java");
		System.out.println("�ɸ��ð�:"+time);
	}
	public static void stringBufferCheck(int count) {
		long start = System.nanoTime();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i <= count; i++) {
			sb.append("java");
		}
		long end = System.nanoTime();
		long time = end-start;
		System.out.println("sb.append(\"java\")"+sb.append("java"));
		System.out.println("�ɸ��ð�:"+time);
	}
	public static void main(String[] args) {
		
	}

}
