package dl.book.exam.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		/*
		 * �����������̳ʿ� ���� �����ؼ� ��ü�� ���޹޾� ����� �� �ֵ��� �����ϱ�
		 * Dependency LookUp ����
		 * ��������: config/bean.xml
		 * �� ���:
		 * 		SamsungTv => samsung
		 * 		LgTv -> lg
		 * 
		 * getBean���� ���ͼ� �۾��ϵ��� �ڵ� �����ϱ�
		 * 
		 */
		ApplicationContext factory = new GenericXmlApplicationContext("/config/bean.xml"); 
		//TV samsung = (TV)factory.getBean("samsung");
		TV tv = factory.getBean("tv", TV.class);
		playTV(tv);
		
		TV lg = (TV)factory.getBean("lg");
		playTV(lg);
	}
	public static void playTV(TV tv) {
		tv.turnOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.turnOff();
		
	}

}
