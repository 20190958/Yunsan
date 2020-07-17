import java.util.*;

public class Plus {

	public void plus() {
		Scanner scan = new Scanner(System.in);
		ArrayList dab = new ArrayList();
		Random rd = new Random();
		for (int i = 0; i < 10; i++) {
			int x = rd.nextInt(89) + 10;
			int y = rd.nextInt(89) + 10;
			System.out.println(x + "+" + y + "는?");
			int v = scan.nextInt();
			if (v == x + y) {
				System.out.println("정답입니다!");
				dab.add("0");
			} else {
				System.out.println("땡");
			}
		}
		System.out.println(dab.size()+"개 맞추셨습니다!");
	}

}
