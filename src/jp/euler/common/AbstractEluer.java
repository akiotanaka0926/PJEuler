package jp.euler.common;

/**
 * ���C���N���X
 * 
 * @author AQUA
 */
public abstract class AbstractEluer {
	/**
	 * ���s���\�b�h
	 */
	public void run() {
		TimeMeasurement tm = new TimeMeasurement();
		tm.start();

		internalRun();

		tm.finish();
		tm.resultPrint();
	}

	/**
	 * �������p���ۃ��\�b�h
	 */
	protected abstract void internalRun();
}
