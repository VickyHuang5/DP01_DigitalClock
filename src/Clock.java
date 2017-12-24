import java.util.*;

/**
 * 時鐘
 * 
 * @author 016417
 */
public class Clock {

	/**
	 * 月曆
	 */
	private Calendar calendar = new GregorianCalendar();

	/**
	 * 報時
	 */
	public void onTick(TopicService topic) {
		while (true) {
			setTime();
			topic.publish("update",getHour(), getMinute(), getSecond());
			if(getSecond()==0)
			{
				topic.publish("on the minute",getHour(), getMinute(), getSecond());
			}
			try {
				Thread.sleep(1000);
			} catch (Exception e) {

			}
		}
	}

	/**
	 * 設定時間
	 */
	private void setTime() {
		calendar.setTimeInMillis(System.currentTimeMillis());
	}

	/**
	 * 取得小時
	 * 
	 * @return 小時
	 */
	private int getHour() {
		return calendar.get(Calendar.HOUR_OF_DAY);
	}

	/**
	 * 取得分鐘
	 * 
	 * @return 分鐘
	 */
	private int getMinute() {
		return calendar.get(Calendar.MINUTE);
	}

	/**
	 * 取得秒數
	 * 
	 * @return 秒數
	 */
	private int getSecond() {
		return calendar.get(Calendar.SECOND);
	}
}