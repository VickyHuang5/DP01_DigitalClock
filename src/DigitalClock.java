import java.awt.*;
import javax.swing.*;

/**
 * �q�l����
 * @author 016417
 */
public class DigitalClock extends ClockObserver {

	/**
	 * �~��
	 */
	private JFrame digitalClockFrame = new JFrame("�q�l����");
	
	/**
	 * �e��
	 */
	private JPanel digitalClockPanel = new JPanel();
	
	/**
	 * �ɶ����
	 */
	private JLabel timeLabel = new JLabel();

	/**
	 * �غc�l
	 * 
	 * @param clock
	 */
	public DigitalClock(Clock clock) {
		this.clock = clock;
		this.clock.attach(this);
		setDigitalClock();
	}

	/**
	 * ��s
	 * 
	 * @param �p��
	 * @param ����
	 * @param ���
	 */
	@Override
	public void update(int hours, int minutes, int seconds) {
		timeLabel.setText(zeroFill(hours) + ":" + zeroFill(minutes) + ":" + zeroFill(seconds));
	}

	/**
	 * �]�w�q�l����
	 */
	private void setDigitalClock() {
		digitalClockFrame.setSize(250, 100);
		digitalClockFrame.setLocation(250, 250);
		digitalClockFrame.add(digitalClockPanel, BorderLayout.CENTER);
		digitalClockPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		digitalClockPanel.add(timeLabel);
		timeLabel.setFont(new Font("Serif", Font.BOLD, 24));
		digitalClockFrame.setVisible(true);
	}

	/**
	 * �ɹs
	 * @param number �n��0���Ʀr      
	 * @return 2��ƼƦr
	 */
	private String zeroFill(int number) {
		return String.format("%02d", number);
	}
}