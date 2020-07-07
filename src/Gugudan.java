import java.util.Scanner;

public class Gugudan {
	//메인 메소드가 반드시 필요
	public static void main(String[] args) {
		// 2단
//		System.out.println("2단");
//		System.out.println(2 * 1);
//		System.out.println(2 * 2);
//		System.out.println(2 * 3);
//		System.out.println(2 * 4);
//		System.out.println(2 * 5);
//		System.out.println(2 * 6);
//		System.out.println(2 * 7);
//		System.out.println(2 * 8);
//		System.out.println(2 * 9);
//		System.out.println(2 * 10);
		
		// 3단
//		System.out.println("3단");
//		System.out.println(3 * 1);
//		System.out.println(3 * 2);
//		System.out.println(3 * 3);
//		System.out.println(3 * 4);
//		System.out.println(3 * 5);
//		System.out.println(3 * 6);
//		System.out.println(3 * 7);
//		System.out.println(3 * 8);
//		System.out.println(3 * 9);
//		System.out.println(3 * 10);
		
		//4단
		//변수에 값을 담아 사용하는 방법
		//int는 숫자만 저장할 수 있다.
//		System.out.println("4단 입니다");
//		int result = 4 * 1;
//		System.out.println(result);
//		result = 4 * 2;
//		System.out.println(result);
//		result = 4 * 3;
//		System.out.println(result);
//		result = 4 * 4;
//		System.out.println(result);
//		result = 4 * 5;
//		System.out.println(result);
//		result = 4 * 6;
//		System.out.println(result);
//		result = 4 * 7;
//		System.out.println(result);
//		result = 4 * 8;
//		System.out.println(result);
//		result = 4 * 9;
//		System.out.println(result);
//		result = 4 * 10;
//		System.out.println(result);
		
		// 사용자에게 숫자값을 입력 받는 방법
		// Scanner 라는 클래스를 import를 해와서 사용 (jdk에서 기본적으로 제공하는 클래스)
		//Scanner scanner = new Scanner(System.in);
		//int number = scanner.nextInt();
		System.out.println("구구단 중 출력할 단은 ? :");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println(number * 1);
		System.out.println(number * 2);
		System.out.println(number * 3);
		System.out.println(number * 4);
		System.out.println(number * 5);
		System.out.println(number * 6);
		System.out.println(number * 7);
		System.out.println(number * 8);
		System.out.println(number * 9);
		System.out.println(number * 10);
		
	}
}
