package workbook.section6_82p;

public class Account {
	String account="";
	double balance=0;
	double interestRate=0.0;
	Account(){
		
	}
	Account(String account, double balance, double interestRate){
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
/*		setAccount(account);
		setBalance(balance);
		setInterestRate(interestRate);
*/
	}
	
	public void accountInfo() {
		System.out.print("��������: "+account+"\t�����ܾ�: "+balance+"\t������: "+interestRate+"%");
		
	}
	
	public void print() {
		System.out.println("��������: "+account+"\t�����ܾ�: "+balance);
		//		System.out.println("���¹�ȣ: "+account+"\t�ܾ�: "+balance+"��\t������: "+interestRate+"%");
	}
	public double calculateInterest() {
		/*double interest=0.0;
		interest = balance*(interestRate/100);
		return interest;
		*/
		return balance*interestRate/100;
	}
	public void deposit(int money) throws Exception {
		if(money<0) {
			throw new Exception("�Ա� �ݾ��� 0���� �����ϴ�.");
		}
		balance+=money;
		print();
	}
	public void withdraw(int money) throws Exception {
		if(money<0||money>balance) {
			throw new Exception("�ݾ��� 0���� ���ų� ���� �ܾ׺��� �����ϴ�.");
		}
		balance-=money;
		
		print();
	}
	
	
	
	
	
	
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
}
