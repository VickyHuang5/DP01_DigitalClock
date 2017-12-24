import java.awt.*;

import javax.swing.*;

/**
 * �q�l����
 * @author 016417
 */
public class DigitalClock implements IClockSubscriber {

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
	public DigitalClock() {
		setDigitalClock();
	}

	/**
	 * ��s
	 * 
	 * @param �p��
	 * @param ����
	 * @param ���
	 */
	public void update(int hours, int minutes, int seconds) {
		digitalClockPanel.setBackground(Color.lightGray);
		timeLabel.setText(zeroFill(hours) + ":" + zeroFill(minutes) + ":" + zeroFill(seconds));
	}
	
	/**
	 * ���0��
	 */
	public void onTheMinute()
	{
		digitalClockPanel.setBackground(Color.red);
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