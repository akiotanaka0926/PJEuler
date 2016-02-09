package jp.euler.problem0001;

import jp.euler.common.AbstractEluer;

/**
 * 問1
 * 
 * @author Akio Tanaka
 */
public class Eluer0001 extends AbstractEluer {

	@Override
	protected void internalRun() {
		int three = multipleTotal(3, 999);
		int five = multipleTotal(5, 999);
		int fifteen = multipleTotal(15, 999);

		System.out.println(three + five - fifteen);
	}

	/**
	 * 基底数の最大の自然数までの総和を計算する
	 * 
	 * @param num
	 *            基底数
	 * @param maxNaturalNumber
	 *            最大の自然数
	 * @return 規定数の最大の自然数の総和
	 */
	private int multipleTotal(int num, int maxNaturalNumber) {
		double divide = maxNaturalNumber / num;
		double maxMultiple = num * divide;

		return (int) ((num + maxMultiple) * divide / 2);
	}
}
