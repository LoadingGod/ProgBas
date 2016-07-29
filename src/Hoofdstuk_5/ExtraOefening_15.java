package Hoofdstuk_5;
import java.util.*;
public class ExtraOefening_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		for (int i = 1; i <= 5; i++) {
			int vermenigvuldiger;
			int max;

			System.out.println("Geef de vermenigvulderger in: ");
			vermenigvuldiger = in.nextInt();
			System.out.println("Geef het max in: ");
			max = in.nextInt();

			for (int j = 0; j <= max; j++) {
				System.out.println(j + "x" + vermenigvuldiger + "=" + j * vermenigvuldiger);
			}
		}
		in.close();
	}

}
