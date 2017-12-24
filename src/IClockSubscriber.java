/**
 * 時鐘訂閱者介面
 */
public interface IClockSubscriber
{
	/**
	 * 更新
	 * @param 小時
	 * @param 分鐘
	 * @param 秒數
	 */
	public void update(int hours, int minutes, int seconds);
	
	/**
	 * 整分0秒
	 */
	public void onTheMinute();
}
