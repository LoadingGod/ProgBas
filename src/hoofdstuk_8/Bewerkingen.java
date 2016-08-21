package hoofdstuk_8;

public class Bewerkingen {
	public void trekAf(double get1, double get2) {
		double res = get1 - get2;
		if (get2 < 0) {
			System.out.printf("%.2f + %.2f = %.2f", get1, -get2, res);
		} else {			
		System.out.printf("%.2f - %.2f = %.2f", get1, get2, res);
		}
	}

	public void trekAf(int get1, int get2) {
		int res = get1 - get2;
		if (get2 < 0) {
			System.out.printf("%.2d + %.2d = %.2d", get1, -get2, res);
		} else {			
		System.out.printf("%.2d - %.2d = %.2d", get1, get2, res);
		}
	}
	
	public void telOp(double get1, double get2) {
		double res = get1 + get2;
		if (get2 < 0) {
			System.out.printf("%.2f - %.2f = %.2f", get1, -get2, res);
		} else {			
		System.out.printf("%.2f + %.2f = %.2f", get1, get2, res);
		}
	}
	public void telOp(double... get) {
		double res=0;
		for (double g: get) {
			res += g;
		}
		for (int i=0; i < get.length; i++) {
			if (i>0) {
				if (get[i] < 0) {
					System.out.printf("%.02f ", -get[i]);	
				} else {
					System.out.printf("%.02f ", +get[i]);	
				}
			} else {
				System.out.printf("%.02f ", get[i]);	
			}
					
		}
		System.out.printf("= %f", res);
	}
	public void deel(int get1, int get2) {
		double res = (double) get1 / get2;
		System.out.printf("%d / %d = %f", get1, get2, res);
	}
	public void faculteit(int get) {
		int res = 1;
		if(get>0) {
			for(int i=get; i>=2; i--) {
			res *= i;
			}
		System.out.printf("de faculteit van %d is %d", get, res);
		} else {
			System.out.println("Faculteit kan niet berekend worden van een negatief getal");
		}
	}
}