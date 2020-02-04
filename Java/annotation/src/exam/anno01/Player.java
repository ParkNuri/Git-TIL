package exam.anno01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


/* @Service : �̰��� bean���� �����ϰڴ�. */
@Service("myplayer")	
public class Player implements AbstractPlayer {
	/* @AutoWired : �ش� Ÿ���� ���� ������ ���� �ִٸ� �ڵ����� ���� */
	@Autowired
	@Qualifier("dice2") /* ���� �׽�Ʈ�� ���� �ٲٱ� */	
	AbstractDice d;
	int totalValue=0;
	
	// annotation�� ����ϸ� �⺻ �����ڷ� �����Ѵ�.
	public Player() {
		
	}
	public Player(AbstractDice d) {
		super();
		this.d = d;
		System.out.println("Player�� �Ű����� 1�� ������");
	}
	public void play(){
		totalValue=0;
		for (int i = 0; i < 3; i++) {
			totalValue+=d.getDiceValue();
		}
	}
	public int getTotalValue(){
		return totalValue;
	}
}