package dl.book.exam.constructor;

public class SamsungTV implements TV {
	//���� Ŭ���� ���ο��� ����ϴ� ��ü - �����������̳ʸ� ���� ���޹��� �� �ֵ��� �غ�
	Speaker s;
	public SamsungTV(Speaker s) {
		this.s = s;
	}
	public void turnOn() {
		System.out.println("SamsungTV---���� �Ҵ�.");
	}

	public void turnOff() {
		System.out.println("SamsungTV---���� ����.");
	}

	public void volumeUp() {
		System.out.println("SamsungTV---�Ҹ� �ø���.");
		s.volumeUp();
	}

	public void volumeDown() {
		System.out.println("SamsungTV---�Ҹ� ������.");
		s.volumeDown();
	}
}
