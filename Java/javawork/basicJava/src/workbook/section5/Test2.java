package workbook.section5;

public class Test2 {

	public static void main(String[] args) {
		//Company�� salary�� double�̰� �Է¹��� salary�� int�̹Ƿ�
		//�ڵ� casting�� �ȴ�.
		Company com = new Company(Double.parseDouble(args[0]));
		
		System.out.println("�� �⺻�� ��: "+com.getIncome()+"\t����: "+com.getAfterTaxIncome());
		System.out.println("�� ���ʽ� ��: "+com.getBonus()+"\t����: "+com.getAfterTaxBonus());
		System.out.println("�� ���޾� ��: "+(double)(com.getAfterTaxIncome()+com.getAfterTaxBonus()));

	}

}
