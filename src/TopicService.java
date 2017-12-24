import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * �D�D�A��
 * @author 016417
 *
 */
public class TopicService {
	
	/**
	 * �����q�\�̲M��
	 */
	private List<HashMap<String, IClockSubscriber>> clocks = new ArrayList<HashMap<String, IClockSubscriber>>();
	
	/**
	 * �q�\�D�D����
	 */
	private HashMap<String, IClockSubscriber> subscribersTopicMap = new HashMap<String, IClockSubscriber>();

	/**
	 * ���[
	 * @param topic �D�D
	 * @param clockSubscriber �����q�\��          
	 */
	public void attach(String topic,IClockSubscriber clockSubscriber) {
		this.subscribersTopicMap.put(topic, clockSubscriber);
		clocks.add(this.subscribersTopicMap);
	}
	
	/**
	 * �o�G
	 * @param topic �D�D
	 * @param hours ��
	 * @param minutes ��
	 * @param seconds ��
	 */
	public void publish(String topic,int hours, int minutes, int seconds) {
		for (HashMap<String, IClockSubscriber> clock : clocks) {
			if(topic=="update")
			{
				clock.get(topic).update(hours,minutes,seconds);
			}
			
			if(topic=="on the minute")
			{
				clock.get(topic).onTheMinute();
			}
		}
	}
}
