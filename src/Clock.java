import java.util.*;

/**
 * ����
 * 
 * @author 016417
 */
public class Clock {

	/**
	 * ���
	 */
	private Calendar calendar = new GregorianCalendar();

	/**
	 * ����
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
	 * �]�w�ɶ�
	 */
	private void setTime() {
		calendar.setTimeInMillis(System.currentTimeMillis());
	}

	/**
	 * ���o�p��
	 * 
	 * @return �p��
	 */
	private int getHour() {
		return calendar.get(Calendar.HOUR_OF_DAY);
	}

	/**
	 * ���o����
	 * 
	 * @return ����
	 */
	private int getMinute() {
		return calendar.get(Calendar.MINUTE);
	}

	/**
	 * ���o���
	 * 
	 * @return ���
	 */
	private int getSecond() {
		return calendar.get(Calendar.SECOND);
	}
}