package workbook.section5;

public class Company {
	private double salary;
	private double annualIncome;
	private double bonus;
	private double afterTaxBonus;
	
	// Constructor*********************************************
	public Company() {}
	
	public Company(double salary) {
		this.salary = salary;
		
	}

	
	// Method**************************************************
	public double getIncome() {
		annualIncome = salary*12;
		return annualIncome;
	}//�� �⺻��
	
	
	public double getAfterTaxIncome()	{
		
		return annualIncome*0.9;
	}//���װ��� �� �� �⺻��
	
	public double getBonus() {
		bonus = salary*0.2;
		return bonus*4;
	}//�� ���ʽ�

	public double getAfterTaxBonus() {
		afterTaxBonus=bonus*0.945;
		return afterTaxBonus*4;
	}//���װ��� �� �� ���ʽ�

	
	
	
	
	
}
