import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 主題服務
 * @author 016417
 *
 */
public class TopicService {
	
	/**
	 * 時鐘訂閱者清單
	 */
	private List<HashMap<String, IClockSubscriber>> clocks = new ArrayList<HashMap<String, IClockSubscriber>>();
	
	/**
	 * 訂閱主題對應
	 */
	private HashMap<String, IClockSubscriber> subscribersTopicMap = new HashMap<String, IClockSubscriber>();

	/**
	 * 附加
	 * @param topic 主題
	 * @param clockSubscriber 時鐘訂閱者          
	 */
	public void attach(String topic,IClockSubscriber clockSubscriber) {
		this.subscribersTopicMap.put(topic, clockSubscriber);
		clocks.add(this.subscribersTopicMap);
	}
	
	/**
	 * 發佈
	 * @param topic 主題
	 * @param hours 時
	 * @param minutes 分
	 * @param seconds 秒
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
