/**
 * 時鐘觀察者
 */
public abstract class ClockObserver 
{
	/**
	 * 時鐘物件
	 */
	protected Clock clock;
	
	/**
	 * 更新
	 * @param 小時
	 * @param 分鐘
	 * @param 秒數
	 */
	public abstract void update(int hours, int minutes, int seconds);
}
