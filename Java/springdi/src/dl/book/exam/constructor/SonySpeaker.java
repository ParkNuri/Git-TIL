package dl.book.exam.constructor;

public class SonySpeaker implements Speaker {

	public SonySpeaker(){
		System.out.println("SonySpeaker ��ü����");
	}
	
	@Override
	public void volumeUp() {
		System.out.println("SonySpeaker�� ��������");
	}

	@Override
	public void volumeDown() {
		System.out.println("SonySpeaker�� �����ٿ��");
		
	}
	
}
