package dl.book.exam.constructor;

public class LgTV implements TV{
	Speaker s;
	public LgTV(Speaker s) {
		this.s = s;
	}
	
	public void turnOn() {
		System.out.println("LgTV---���� �Ҵ�.");
	}

	public void turnOff() {
		System.out.println("LgTV---���� ����.");
	}

	public void volumeUp() {
		System.out.println("LgTV---�Ҹ� �ø���.");
		s.volumeUp();
	}

	public void volumeDown() {
		System.out.println("LgTV---�Ҹ� ������.");
		s.volumeDown();
	}
}
