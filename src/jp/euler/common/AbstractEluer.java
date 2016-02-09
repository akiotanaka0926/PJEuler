package jp.euler.common;

/**
 * メインクラス
 * 
 * @author Akio Tanaka
 */
public abstract class AbstractEluer {
	/**
	 * 実行メソッド
	 */
	public void run() {
		TimeMeasurement tm = new TimeMeasurement();
		tm.start();

		internalRun();

		tm.finish();
		tm.resultPrint();
	}

	/**
	 * 実処理用抽象メソッド
	 */
	protected abstract void internalRun();
}