package jp.euler.problem0001;

import jp.euler.common.AbstractEluer;

/**
 * ��1
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
	 * ��ꐔ�̍ő�̎��R���܂ł̑��a���v�Z����
	 * 
	 * @param num
	 *            ��ꐔ
	 * @param maxNaturalNumber
	 *            �ő�̎��R��
	 * @return �K�萔�̍ő�̎��R���̑��a
	 */
	private int multipleTotal(int num, int maxNaturalNumber) {
		double divide = maxNaturalNumber / num;
		double maxMultiple = num * divide;

		return (int) ((num + maxMultiple) * divide / 2);
	}
}
