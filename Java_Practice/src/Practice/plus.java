/*문제
두 수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.


입력
첫째 줄에 A와 B가 주어진다. (0 < A,B < 10)

출력
첫째 줄에 A+B를 출력한다.*/
package Practice;

import java.util.Scanner;

public class plus {
	public static void main(String[] args) {
		int a,b=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 A를 입력해 주세요");
		a = sc.nextInt();
		System.out.print("\n숫자 B를 입력해 주세요");
		b = sc.nextInt();
		if(a > 0 && a < 10 && b > 0 && b < 10){
			System.out.println("\n입력하신 " + a + " + " + b + "는 " + (a+b) + "입니다.");
		}else{
			System.out.println("\n A와 B는 1~9사이의 숫자를 입력해 주세요");
		}
	}
}
