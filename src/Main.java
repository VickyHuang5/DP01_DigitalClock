/**
 * ¥Dµ{¦¡
 * @author 016417
 */
public class Main {
	public static void main(String[] args) {
		Clock clock = new Clock();
		new DigitalClock(clock);
		clock.onTick();
	}
}
