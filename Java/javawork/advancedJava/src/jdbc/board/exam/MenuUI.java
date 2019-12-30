package jdbc.board.exam;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuUI {
	Scanner key = new Scanner(System.in);
	BoardDAO dao = new BoardDAOImpl();

	public void insertMenu() {
		System.out.println("*******�Խñ۵��********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("����:");
		String title = key.next();
		System.out.print("����:");
		String content = key.next();

		// ���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ���
		BoardDTO board = new BoardDTO(id, title, content);
		int result = dao.insert(board);
	}

	public void updateMenu() {
		System.out.println("*******�Խñۼ���********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("�Խñ۹�ȣ:");
		String boardNum = key.next();
		// ���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ���
		// dao.update(boardNum, id);
	}

	public void deleteMenu() {
		System.out.println("*******�Խñۻ���********");
		System.out.print("�Խñ۹�ȣ:");
		String boardNum = key.next();
		// ���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ���
	}

	public void selectMenu() {
		System.out.println("*******�Խñ���ȸ********");
		// ���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ��� - ��ü�����ȸ
		ArrayList<BoardDTO> boardlist = dao.select();
		int size = boardlist.size();
		for (int i = 0; i < size; i++) {
			BoardDTO board = boardlist.get(i);
			System.out.println(board.getBoardNum() + "\t" + board.getTitle() + "\t" + board.getContent() + "\t"
					+ board.getWriteDate() + "\t" + board.getHit());
		}
	}

	public void readMenu() {
		System.out.println("*******�Խñۻ󼼺���********");
		System.out.print("�Խñ� ��ȣ: ");
		int boardnum = key.nextInt();
		BoardDTO board = dao.read(boardnum);
		dao.updateHit(boardnum);
		if (board == null) {
			System.out.println("�ش� �Խù��� �������� �ʽ��ϴ�");
		} else {
			System.out.println(board.getBoardNum() + "\t" + board.getTitle() + "\t" + board.getContent() + "\t"
					+ board.getWriteDate() + "\t" + board.getHit());
		}
	}

	public void findByTitleMenu() {
		System.out.println("*******�������ΰԽñ۰˻�********");
		System.out.print("�Խñ� ����: ");
		String title = key.next();
		ArrayList<BoardDTO> boardlist = dao.findByTitle(title);
		int size = boardlist.size();
		if (size == 0) {
			System.out.println("�ش� �Խù��� �������� �ʽ��ϴ�");
		} else {
			for (int i = 0; i < size; i++) {
				BoardDTO board = boardlist.get(i);
				System.out.println(board.getBoardNum() + "\t" + board.getTitle() + "\t" + board.getContent() + "\t"
						+ board.getWriteDate() + "\t" + board.getHit());
			}
		}
	}
}
