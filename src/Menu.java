import java.util.*;

public class Menu {
	public int mn() {
		Scanner scan = new Scanner(System.in);
		System.out.println("연산의 달인");
		System.out.println("1. 더하기");
		System.out.println("2. 빼기");
		System.out.println("3. 곱하기");
		System.out.println("4. 나누기");
		System.out.println("0. 종료");
		int menu = scan.nextInt();
		
		return menu;
	}
	
}
