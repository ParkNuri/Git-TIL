package jdbc.member.exam;
import java.util.Scanner;

public class MenuUI {
	MemberDAO dao = new MemberDAOImpl();
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
		System.out.print("�μ���ȣ:");
		String deptno = key.next();
		
		MemberDTO dto = new MemberDTO(id, pass, name, addr, deptno);
		
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ���
		dao.insert(dto);
		
		
		
	}
	public void updateMenu(){
		System.out.println("*******�������********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("�ּ�:");
		String addr = key.next();
		
		MemberDTO dto = new MemberDTO(id, addr);
		
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ���
		dao.update(id, addr);
	}
	public void deleteMenu(){
		System.out.println("*******�������********");
		System.out.print("���̵�:");
		String id = key.next();
		
		MemberDTO dto = new MemberDTO(id);
		
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


















