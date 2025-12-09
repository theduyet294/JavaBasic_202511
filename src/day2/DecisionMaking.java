package day2;

public class DecisionMaking {
	/**
	 * Ex1
	 * 
	 * @param n
	 */
	public void checkNumber(int n) {
		if (n % 2 == 0) {
			System.out.println("n là số chẵn");
		}
	}

	/**
	 * Ex2
	 * 
	 * @param n
	 */

	public boolean checkNumber1(int n) {
		boolean result = false;
		if (n % 2 == 0) {
			result = true;
		}

		return result;
	}

	/**
	 * Ex3
	 * 
	 * @param n
	 */
	public void checkNumber2(int n) {
		if (n % 2 == 1) {
			System.out.println("Weird");

		} else {
			if (n >= 2 && n <= 5) {
				System.out.println("Not Weird");
			}
			if (n >= 6 && n <= 20) {
				System.out.println("Weird");
			}
			if (n > 20) {
				System.out.println("Not Weird");
			}
		}
	}

	public int tinhTong(int n) {
		int tong = 0;
		if (n > 0 && n < 1000) {
			if (n < 10) {
				tong = n;
			}
			if (n >= 10 && n < 100) {
				tong = (n / 10) + (n % 10);
			}
			if (n >= 100 && n < 1000) {
				int hangDonVi = n % 10;
				int hangTram = n / 100;
				int hangChuc = (n % 100) / 10;
				tong = hangDonVi + hangTram + hangChuc;
			}
		}
		
		return tong;
	}
	
}
