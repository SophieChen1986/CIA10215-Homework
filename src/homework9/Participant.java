package homework9;

// 快胃王比賽參加者
public class Participant implements Runnable {
	private static final int TARGET_NUMBER = 10;  // 規定目標吃10碗就停
	
	private String name;             // 參賽者名字
	private int    totalBowlsEaten;  // 吃了幾碗
	private boolean isFinished;      // 是不是吃飽了
	
	Participant() {
	}
	
	public Participant(String name) {
		this.name = name;
		totalBowlsEaten = 0;  // 一開始吃0碗
		isFinished = false;   // 一開始沒有吃所以還沒吃完
	}
	
	private void eat() {
		totalBowlsEaten++;
		
		if ( totalBowlsEaten >= TARGET_NUMBER ) {
			isFinished = true;
		}
	}

	@Override
	public void run() {

		do {
			try {
				int randomSleepTime = (int)(Math.random()*2501 + 500);
				Thread.sleep(randomSleepTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			eat();
			
			System.out.println(name + "吃第" + totalBowlsEaten + "碗飯。");
			if ( isFinished ) {
				System.out.println(name + "吃完了。");
				break;
			}
			
		} while( !isFinished );
	}
	
}
