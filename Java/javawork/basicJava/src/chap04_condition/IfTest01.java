package chap04_condition;

import java.util.Random;
//if���� Random Ŭ����
public class IfTest01 {

	public static void main(String[] args) {
		//Random�� nextInt�� �̿��ؼ� 1���� 100������ ���� �߻���Ų �� �۾�
		
		Random r = new Random();
		
		int num =r.nextInt(100)+1;
		
		System.out.println(num);
		
		if(num>=90) {
			System.out.println("����");
			System.out.println("�ι�° ����");
		}
		System.out.println("����");
		

	}

}
