package jdbc.board.exam;

import java.util.Scanner;

import jdbc.basic.PreparedDeleteTest;

public class BoardDaoTest {

	public static void main(String[] args) {

		
		
		Scanner key = new Scanner(System.in);
		BoardDAOImpl dao = new BoardDAOImpl();
/*
		boolean status = true;

		while (status) {
			
			System.out.println("1. �Խñ� ���\n2.�Խñ� ����\n3.�Խñ� ���̵� ����\n4. �Խñ� ���\n0. ���α׷� ����");
			System.out.print("������ �۾��� �����ϼ���. : ");
			int funcNum = key.nextInt();

			switch (funcNum) {

			// insert
			case 1:
				System.out.println("==========�Խñ� ���==========");
				System.out.print("���̵�: ");
				String iId = key.next();
				System.out.print("����: ");
				String title = key.next();
				System.out.print("����: ");
				String content = key.next();

				dao.insert(iId, title, content);
				break;

				// select
			case 2:
				dao.select();
				break;

				// delete
			case 3:
				System.out.print("������ �Խù� ��ȣ : ");
				int dBoardNum = key.nextInt();

				dao.delete(dBoardNum);
				break;

				// update
			case 4:

				System.out.print("������ id:");
				String uId = key.next();
				System.out.print("������ boardnum: ");
				int uBoardNum = key.nextInt();

				dao.update(uId, uBoardNum);
				break;
				
			case 0: status = false;
			}
		}
		System.out.println("���α׷� ����");
 */
		dao.select();
	}

}
