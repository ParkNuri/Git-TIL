package chap07_oop.poly;
public class EmailSender extends Sender {
	int length;
	public EmailSender(String name,int length){
		super(name);
		this.length = length;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	@Override
	public void print() {
		//EmailSender������ ó���Ǵ� ������ ��� ����
		System.out.println("(EMAIL)"+name+"("+length+")�� �����߽��ϴ�.");
		
	}
}

