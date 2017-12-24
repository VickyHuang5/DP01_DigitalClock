/**
 * ¥Dµ{¦¡
 * @author 016417
 */
public class Main {
	public static void main(String[] args) {
		TopicService topic=new TopicService();
		IClockSubscriber digitalClock=new DigitalClock();
		topic.attach("update",digitalClock);
		topic.attach("on the minute", digitalClock);
		Clock clock = new Clock();
		clock.onTick(topic);
	}
}
