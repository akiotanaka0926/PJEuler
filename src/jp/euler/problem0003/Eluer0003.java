package jp.euler.problem0003;

import java.math.BigInteger;

import jp.euler.common.AbstractEluer;

/**
 * 問3
 * 
 * @author Akio Tanaka
 */
public class Eluer0003 extends AbstractEluer {

	@Override
	protected void internalRun() {
		long target = 600851475143L;
		long maxPrime = target / 2;
		long maxPrimeNumber = calcMaxPrimeNumber(target, maxPrime);

		System.out.println(maxPrimeNumber);
	}

	/**
	 * 最大の素因数を返却します
	 * 
	 * @param target
	 *            対象の数値
	 * @param maxPrime
	 *            繰り返しを行うべき最大数
	 * @return 最大の素因数
	 */
	private long calcMaxPrimeNumber(long target, long maxPrime) {
		long maxPrimeNumber = 2;
		for (long number = 3; number < maxPrime; number += 2) {
			if (target % number == 0) {
				if (isPrimeNumber(number)) {
					maxPrimeNumber = number;
				}
			}
		}

		return maxPrimeNumber;
	}

	/**
	 * 素数であるかを判定します
	 * 
	 * @param number
	 *            判定する数値
	 * @return 判定結果
	 */
	private boolean isPrimeNumber(long number) {
		BigInteger judge = BigInteger.valueOf(number);
		return judge.isProbablePrime(4);
	}

}
