/**
 * �����q�\�̤���
 */
public interface IClockSubscriber
{
	/**
	 * ��s
	 * @param �p��
	 * @param ����
	 * @param ���
	 */
	public void update(int hours, int minutes, int seconds);
	
	/**
	 * ���0��
	 */
	public void onTheMinute();
}
