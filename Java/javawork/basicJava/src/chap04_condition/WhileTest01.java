package chap04_condition;
//while�� ���� - ForTest01.java���� �۾��� ���� while������ ����
public class WhileTest01 {

	public static void main(String[] args) {
		int i=1;
		while(i<6) {
			System.out.println("java programming");
			i++;
		}
		
		System.out.println("===========================");
		
		i=1;
		while(true) {
			if(i>5) {break;}
			System.out.println("java programming:" + i);
			i++;
		}

	}

}
