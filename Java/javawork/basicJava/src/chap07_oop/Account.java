package chap07_oop;

public class Account {
	private String account="";
	private int balance=0;
	private String ownerName;
	private double interestRate=0.0;
	public Account(){
		
	}
	public Account(String account, int balance, String ownerName){
		this.account = account;
		this.balance = balance;
		this.ownerName = ownerName;
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
	public void deposit(int money) {
		balance+=money;
		print();
	}
	public void withdraw(int money) {
		balance-=money;
		print();
	}
	
	
	
	
	
	
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public int getBalance() {
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
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
}
