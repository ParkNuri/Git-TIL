package chap07_oop;

public class CheckingAccount extends Account {
	private String cardNo;
	public CheckingAccount() {	}
	public CheckingAccount(String account, String ownerName, int balance, String cardNo) {
		super(account, balance, ownerName);
		this.cardNo = cardNo;
	}
	public void pay(int amount, String cardNo) {
		//���ڿ� �񱳴� ������ equals ����ϱ�
		//(==)��� No!!
		
//		if(this.cardNo==cardNo) {
		if(this.cardNo.equals(cardNo)) {
			if(amount<this.getBalance()) {
//				this.setBalance(this.getBalance()-amount);
				withdraw(amount);
				
			}
			else{System.out.println("������ �Ұ����մϴ�.");}
		}else {
			System.out.println("������ �Ұ����մϴ�.");
		}
	}
}
