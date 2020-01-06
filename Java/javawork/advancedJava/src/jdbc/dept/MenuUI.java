package jdbc.dept;
import java.sql.Date;
import java.util.Scanner;

public class MenuUI {
	
	DeptDAO dao = new DeptDAO();
	Scanner key = new Scanner(System.in);
	public void insertMenu(){
		 System.out.println("*******�μ����********");
	        System.out.print("���̵�:");
	        String id = key.next();
	        System.out.print("����:");
	        String title = key.next();
	        System.out.print("����:");
	        String content = key.next();

	        DeptDTO dept = new DeptDTO(id, title, content);
	        int result = dao.insert(dept);
		
		
		
	}
	public void updateMenu(){
		System.out.println("*******�������********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("�ּ�:");
		String addr = key.next();
		
		DeptDTO dto = new DeptDTO(id, addr);
		
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ���
		dao.update(id, addr);
	}
	public void deleteMenu(){
		System.out.println("*******�������********");
		System.out.print("���̵�:");
		String id = key.next();
		
		DeptDTO dto = new DeptDTO(id);
		
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


















