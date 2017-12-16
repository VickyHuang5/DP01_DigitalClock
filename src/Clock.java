import java.util.*;

/**
 * ����
 * @author 016417
 */
public class Clock {
	/**
	 * �����[��̲M��
	 */
	private List<ClockObserver> clocks = new ArrayList<ClockObserver>();

	/**
	 * ���
	 */
	private Calendar calendar = new GregorianCalendar();

	/**
	 * ���[
	 * @param clock �����[���           
	 */
	public void attach(ClockObserver clock) {
		clocks.add(clock);
	}

	/**
	 * ����
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
	 * �]�w�ɶ�
	 */
	private void setTime() {
		calendar.setTimeInMillis(System.currentTimeMillis());
	}

	/**
	 * ���o�p��
	 * @return �p��
	 */
	private int getHour() {
		return calendar.get(Calendar.HOUR_OF_DAY);
	}

	/**
	 * ���o����
	 * @return ����
	 */
	private int getMinute() {
		return calendar.get(Calendar.MINUTE);
	}

	/**
	 * ���o���
	 * @return ���
	 */
	private int getSecond() {
		return calendar.get(Calendar.SECOND);
	}
}