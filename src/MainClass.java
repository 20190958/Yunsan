import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Menu mn = new Menu();
		int menu = mn.mn();
		Plus pl = new Plus();
		Sub sb = new Sub();
		Mul ml = new Mul();
		Div dv = new Div();

		if (menu == 1) {

			pl.plus();

		} else if (menu == 2) {

			sb.sub();

		} else if (menu == 3) {
			
			ml.mul();
			
		} else if (menu == 4) {
			
			dv.div();
			
		} else if (menu == 0) {
			System.out.println("종료");

		}
	}
}