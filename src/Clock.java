import java.util.*;

/**
 * 時鐘
 * @author 016417
 */
public class Clock {
	/**
	 * 時鐘觀察者清單
	 */
	private List<ClockObserver> clocks = new ArrayList<ClockObserver>();

	/**
	 * 月曆
	 */
	private Calendar calendar = new GregorianCalendar();

	/**
	 * 附加
	 * @param clock 時鐘觀察者           
	 */
	public void attach(ClockObserver clock) {
		clocks.add(clock);
	}

	/**
	 * 報時
	 */
	public void onTick() {
		while (true) {
			setTime();
			for (ClockObserver clock : clocks) {
				clock.update(getHour(), getMinute(), getSecond());
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
	 * @return 小時
	 */
	private int getHour() {
		return calendar.get(Calendar.HOUR_OF_DAY);
	}

	/**
	 * 取得分鐘
	 * @return 分鐘
	 */
	private int getMinute() {
		return calendar.get(Calendar.MINUTE);
	}

	/**
	 * 取得秒數
	 * @return 秒數
	 */
	private int getSecond() {
		return calendar.get(Calendar.SECOND);
	}
}