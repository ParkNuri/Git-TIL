package chap04_condition;

public class SwitchTest03 {
	public static void main() {
		/* switch���� int�� casting �� �� �ִ� ���� ��� �ִ� ����, �����, �޼ҵ� ȣ�⹮
		 * ----------------------------------------------------------
		 *                byte, short, int, char, String           */
		
		//int�� ���� (double x)
		double d = 1.5;
		/*switch(d){
		 * case 1.0:
		 * }*/
		
		//switch�� �� ���� ����
		int data = 5;
		switch (data + 60) {
		case 'A':System.out.println("A");break;
		case 'B':System.out.println("B");
		}
		
		// String�� ����
		String code = new String("a01");
		switch(code) {
		case "a01":System.out.println("A01");break;
		case "a02":System.out.println("A02");
		}
	}
}
