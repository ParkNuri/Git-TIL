package chap04_condition;

import java.util.Scanner;
// if~else문과 Scanner
public class IfTest02 {

	public static void main(String[] args) {
		//Scanner로 점수를 입력받아 90점 이상이면 "통과"를 출력하고
		//90점 미만이면 "재시험"을 출력하세요.
		Scanner s = new Scanner(System.in);
		System.out.print("점수를 입력하세요.->");
		int score = s.nextInt();
		if(score>=90) {
			System.out.println("통과");
		}else {System.out.println("재시험4");}
	}

}
