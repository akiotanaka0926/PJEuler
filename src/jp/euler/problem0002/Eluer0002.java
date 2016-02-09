package jp.euler.problem0002;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import jp.euler.common.AbstractEluer;

/**
 * 問2
 * 
 * @author Akio Tanaka
 */
public class Eluer0002 extends AbstractEluer {

	@Override
	protected void internalRun() {
		List<Long> fibonacciList = new ArrayList<>();

		fibonacciList.add(1L);
		fibonacciList.add(2L);

		fibonacciNumber(fibonacciList, 4000000);

		List<Long> fibonacchiEvenList = fibonacciList.stream()
				.filter(v -> isEvenNumber(v)).collect(Collectors.toList());
		long answer = 0;

		for (Long num : fibonacchiEvenList) {
			answer += num;
		}

		System.out.println(answer);
	}

	/**
	 * 与えられた数字までの項のフィボナッチ数をリストに格納する
	 * 
	 * @param maxNumber
	 *            最大値
	 */
	private void fibonacciNumber(List<Long> fibonacciList, long maxNumber) {
		long firstRow = fibonacciList.get(0);
		long secondeRow = fibonacciList.get(1);

		while (true) {
			long nextRow = firstRow + secondeRow;
			if (nextRow < maxNumber) {
				fibonacciList.add(nextRow);
				firstRow = secondeRow;
				secondeRow = nextRow;
			} else {
				break;
			}
		}
	}

	/**
	 * 与えられた数字が偶数の場合にtrueを返却する
	 * 
	 * @param number
	 *            数字
	 * @return true:偶数<br>
	 *         false:奇数
	 */
	private boolean isEvenNumber(long number) {
		return number % 2 == 0;
	}
}
