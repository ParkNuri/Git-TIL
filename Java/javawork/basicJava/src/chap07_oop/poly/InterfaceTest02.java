package chap07_oop.poly;

import javax.swing.JFrame;
//�������̽��� ����ϴ� ������ ���߻���� ����ϰ�, �������� ������ �� �ֵ���,
//					  �⺻������ �����ؾ��ϴ� ����� �������� �����ϱ� ���� ����
class GUITest extends JFrame implements Runnable{
	GUITest(String title){
		super(title);
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
public class InterfaceTest02 {

	public static void main(String[] args) {
		GUITest Obj = new GUITest("�������̽� ����");
	}

}
