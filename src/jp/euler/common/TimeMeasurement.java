package jp.euler.common;

import java.text.NumberFormat;

/**
 * ���Ԍv���N���X
 * 
 * @author AQUA
 */
public class TimeMeasurement {

	/** �J�n���ԁi�i�m�b�j */
	private double startNanoTime;

	/** �I�����ԁi�i�m�b�j */
	private double finishNanoTime;

	/** �b�ϊ��p */
	private int SECOND_DIVIDE = 1000000000;

	/** �~���b�ϊ��p */
	private int MILL_SECOND_DIVIDE = 1000000;

	/**
	 * �J�n���Ԃ�ݒ肷��
	 */
	public void start() {
		startNanoTime = System.nanoTime();
	}

	/**
	 * �I�����Ԃ�ݒ肷��
	 */
	public void finish() {
		finishNanoTime = System.nanoTime();
	}

	/**
	 * �������Ԃ��i�m�b�A�~���b�A�b�ł��ꂼ��\������
	 */
	public void resultPrint() {
		double result = finishNanoTime - startNanoTime;
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(10);
		nf.setMinimumFractionDigits(0);

		System.out.println();
		System.out.println("==== ���s���x ====");
		System.out.println();
		System.out.println(nf.format(result / SECOND_DIVIDE) + "    �b");
		System.out.println(nf.format(result / MILL_SECOND_DIVIDE) + "  �~���b");
		System.out.println(nf.format(result) + "  �i�m�b");
	}
}
