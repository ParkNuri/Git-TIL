package workbook.section6_82p;

import java.util.Scanner;

public class Test3_1 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("�μ� �̸��� 5���� ������ �Է��ϼ���. : ");
		String input = key.nextLine();
		String [] inputArr = input.split(" ");
		if(inputArr.length!=6) {
			System.out.println("�ٽ� �Է��ϼ���");
			return ;

		}
		
		for (int i = 1; i < inputArr.length; i++) {
			if(Double.parseDouble(inputArr[i])>100|Double.parseDouble(inputArr[i])<10) {
				System.out.println("�ٽ��Է��ϼ���");
				return ;
			}
		}
		
		Department dep = new Department(inputArr[0], Double.parseDouble(inputArr[1]), Double.parseDouble(inputArr[2]), Double.parseDouble(inputArr[3]), Double.parseDouble(inputArr[4]), Double.parseDouble(inputArr[5]));
		
		System.out.println("��������� ������"+dep.evaluationNumber());

//		
	}

}
