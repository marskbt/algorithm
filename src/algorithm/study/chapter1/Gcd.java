package algorithm.study.chapter1;

/**
 * 计算最大公约数
 * 
 * @author Ji.huazhen
 *
 */
public class Gcd {

	/**
	 * 欧几里得最大公约数算法 (Eculidean Algorithm Greatest Common Divisor)
	 * 
	 * gcd(a,b)=gcd(b,a%b)
	 * 
	 * 计算2个非负整数p和q的最大公约数：
	 * 
	 * 若q是0,则最大公约数为p;</br>
	 * 否则,将p除以q得到余数r,p和q的最大公约数即为q和r的最大公约数;
	 * 
	 * @param p
	 * @param q
	 * @return
	 */
	public static int gcd(int p, int q) {
		if (q == 0) {
			return p;
		}
		int r = p % q;
		return gcd(q, r);
	}

	public static void main(String[] args) {
		int result = Gcd.gcd(300, 31);
		System.out.println(result);
	}

}
