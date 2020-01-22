package member;
import java.util.ArrayList;
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
		
		ArrayList<MemberDTO> memArr = dao.findByAddr(addr);
		MemberDTO member = new MemberDTO(); 
		int size = memArr.size();
		for (int i = 0; i < size; i++) {
			member = memArr.get(i);
			System.out.println(member.toString());
		}
	}
	
	
	public void selectMenu(){
		System.out.println("*******�����ȸ********");
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ��� - ��ü�����ȸ
		ArrayList<MemberDTO> memArr = dao.memberList();
		int size = memArr.size();
		MemberDTO member = new MemberDTO();
		for (int i = 0; i < size; i++) {
			member = memArr.get(i);
			System.out.println(member.toString());
					
		}
		
	}
	public void loginMenu() {
		System.out.println("*******�α���********");
		System.out.print("���̵�: ");
		String id = key.next();
		System.out.print("�н�����: ");
		String pass = key.next();
		
		
		dao.login(id, pass);
		
		
	}
}


















