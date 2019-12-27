package jdbc.custmer.test;
import java.sql.Date;
import java.util.Scanner;

public class MenuUI {
	
	CustomerDAO dao = new CustomerDAO();
	Scanner key = new Scanner(System.in);
	public void insertMenu(){
		//�Ի����� ���ó�¥ = sysdate, point = 1000�� ������ �ǵ���
		System.out.println("*******������********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("�н�����:");
		String pass = key.next();
		System.out.print("����:");
		String name = key.next();
		System.out.print("�ּ�:");
		String addr = key.next();
	
		
		CustomerDTO dto = new CustomerDTO(id, pass, name, addr);
		
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ���
		dao.insert(dto);
		
		
		
	}
	public void updateMenu(){
		System.out.println("*******�������********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("�ּ�:");
		String addr = key.next();
		
		CustomerDTO dto = new CustomerDTO(id, addr);
		
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ���
		dao.update(id, addr);
	}
	public void deleteMenu(){
		System.out.println("*******�������********");
		System.out.print("���̵�:");
		String id = key.next();
		
		CustomerDTO dto = new CustomerDTO(id);
		
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ���
		dao.delete(id);
	}
	public void findByAddrMenu(){
		System.out.println("*******����˻�********");
		System.out.print("�ּ�:");
		String addr = key.next();
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ���
	}
	
	
	public void selectMenu(){
		System.out.println("*******�����ȸ********");
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ��� - ��ü�����ȸ
	}
}


















