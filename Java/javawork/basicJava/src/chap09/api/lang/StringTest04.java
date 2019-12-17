package chap09.api.lang;
//String��ü�� �ٸ� Ÿ���� �����ͷ� ��ȯ
public class StringTest04 {

	public static void main(String[] args) {
		String str1 = new String("java programming");
		String str2 = new String("java oracle servlet jsp spring");
		
		//1. String -> byte[]
		System.out.println("1. String -> byte[]");
		byte[] bArr = str1.getBytes();
		for (int i = 0; i < bArr.length; i++) {
			System.out.println(bArr[i]);
		}
	
		//2. String -> char[]
		System.out.println("\n2. String -> char[]");
		char[] cArr = str1.toCharArray();
		for (int i = 0; i < cArr.length; i++) {
			System.out.println(cArr[i]);
		}
		
		//3. String -> String[]		//���ڿ��� �߶� ���ڿ� �迭�� ����
		System.out.println("\n3. String -> String[]");
		String[] sArr = str2.split(" ");
		/*for (int i = 0; i < sArr.length; i++) {
			System.out.print(sArr+"|");
		}*/
		for(String string : sArr) {
			System.out.print(string+"\t");
		}
		System.out.println();
		
		//4. �⺻�� -> String
		//case 1
		System.out.println("\n4-1. �⺻�� -> String");
		int i = 1000;
		double d = 10.0;
		test(String.valueOf(i));
		test(String.valueOf(d));
		
		//case 2
		System.out.println("\n4-2. �⺻�� -> String");
		test(i+"");
		test(d+"");
		
	}
	public static void test(String str) {
		System.out.println("���޵� ������=>"+str);
	}
}
