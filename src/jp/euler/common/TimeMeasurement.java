package jp.euler.common;

import java.text.NumberFormat;

/**
 * 時間計測クラス
 * 
 * @author Akio Tanaka
 */
public class TimeMeasurement {

	/** 開始時間（ナノ秒） */
	private double startNanoTime;

	/** 終了時間（ナノ秒） */
	private double finishNanoTime;

	/** 秒変換用 */
	private int SECOND_DIVIDE = 1000000000;

	/** ミリ秒変換用 */
	private int MILL_SECOND_DIVIDE = 1000000;

	/**
	 * 開始時間を設定する
	 */
	public void start() {
		startNanoTime = System.nanoTime();
	}

	/**
	 * 終了時間を設定する
	 */
	public void finish() {
		finishNanoTime = System.nanoTime();
	}

	/**
	 * 処理時間をナノ秒、ミリ秒、秒でそれぞれ表示する
	 */
	public void resultPrint() {
		double result = finishNanoTime - startNanoTime;
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(10);
		nf.setMinimumFractionDigits(0);

		System.out.println();
		System.out.println("==== 実行速度 ====");
		System.out.println();
		System.out.println(nf.format(result / SECOND_DIVIDE) + "    秒");
		System.out.println(nf.format(result / MILL_SECOND_DIVIDE) + "  ミリ秒");
		System.out.println(nf.format(result) + "  ナノ秒");
	}
}
