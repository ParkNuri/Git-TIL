package chap08_exception;

import java.io.IOException;

//����� ���� Exception
public class MyException extends RuntimeException {
	public MyException(String msg) {
		super(msg);
	}
	//MyException�� �߻������� �����ϰ� ���� ������ �ְ� ó���ؾ� �� ������ �ִ� ��� ����
	
}
