package chap07_oop.poly;
public class MMSSender extends Sender {
	int length;
	public MMSSender(String name,int length){
		super(name);
		this.length = length;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void print() {
		//SMSSender������ ó���Ǵ� ������ ��� ����
		System.out.println("(MMS)"+name+" "+length+"�� ���ۿϷ�");
	}
}
