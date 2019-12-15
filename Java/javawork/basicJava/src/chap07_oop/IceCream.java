package chap07_oop;

public class IceCream extends Dessert {
	private int cal;
	
	
	//Constructor--------------------------------
	public IceCream() {
	}
	
	
/*	public IceCream(String productName, int price, int count, int cal) {
		super(productName, price, count);
		this.cal = cal;
	}
*/	
	public IceCream(String productName, int price, int count, int cal) {
		super(productName, price, count);
		this.cal = cal;
	} //Generate Constructor ���� select super constructor ..... ���� super(int...) ����
	
	
	//Method----------------------------------
	public static void print(){
		System.out.println("==============================\n�ֹ��׸�\t����\t����\tĮ�θ�\n==============================");
	}

	public void printProductInfo(){
		System.out.println(getProductName()+"\t"+getPrice()+"\t"+getCount()+"\t"+this.cal);
	}


	//Getter Setter------------------------------
	public int getCal() {
		return cal;
	}
	public void setCal(int cal) {
		this.cal = cal;
	}
}
