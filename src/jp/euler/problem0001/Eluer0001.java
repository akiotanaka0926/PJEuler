package jp.euler.problem0001;

import jp.euler.common.AbstractEluer;

/**
 * –â1
 * 
 * @author AQUA
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
	 * Šî’ê”‚ÌÅ‘å‚Ì©‘R”‚Ü‚Å‚Ì‘˜a‚ğŒvZ‚·‚é
	 * 
	 * @param num
	 *            Šî’ê”
	 * @param maxNaturalNumber
	 *            Å‘å‚Ì©‘R”
	 * @return ‹K’è”‚ÌÅ‘å‚Ì©‘R”‚Ì‘˜a
	 */
	private int multipleTotal(int num, int maxNaturalNumber) {
		double divide = maxNaturalNumber / num;
		double maxMultiple = num * divide;

		return (int) ((num + maxMultiple) * divide / 2);
	}
}
