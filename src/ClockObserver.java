/**
 * �����[���
 */
public abstract class ClockObserver 
{
	/**
	 * ��������
	 */
	protected Clock clock;
	
	/**
	 * ��s
	 * @param �p��
	 * @param ����
	 * @param ���
	 */
	public abstract void update(int hours, int minutes, int seconds);
}
