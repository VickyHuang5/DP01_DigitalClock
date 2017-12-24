import java.awt.*;

import javax.swing.*;

/**
 * 電子時鐘
 * @author 016417
 */
public class DigitalClock implements IClockSubscriber {

	/**
	 * 外框
	 */
	private JFrame digitalClockFrame = new JFrame("電子時鐘");
	
	/**
	 * 容器
	 */
	private JPanel digitalClockPanel = new JPanel();
	
	/**
	 * 時間顯示
	 */
	private JLabel timeLabel = new JLabel();

	/**
	 * 建構子
	 * 
	 * @param clock
	 */
	public DigitalClock() {
		setDigitalClock();
	}

	/**
	 * 更新
	 * 
	 * @param 小時
	 * @param 分鐘
	 * @param 秒數
	 */
	public void update(int hours, int minutes, int seconds) {
		digitalClockPanel.setBackground(Color.lightGray);
		timeLabel.setText(zeroFill(hours) + ":" + zeroFill(minutes) + ":" + zeroFill(seconds));
	}
	
	/**
	 * 整分0秒
	 */
	public void onTheMinute()
	{
		digitalClockPanel.setBackground(Color.red);
	}

	/**
	 * 設定電子時鐘
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
	 * 補零
	 * @param number 要補0的數字      
	 * @return 2位數數字
	 */
	private String zeroFill(int number) {
		return String.format("%02d", number);
	}
}