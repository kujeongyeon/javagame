package javagame;

import java.util.Scanner;

/*
 * 제로게임

- 참여 인원수 정함
- 한명당 손가락 2개씩 이니까 5명 최대10 까지 말할수있음
- 인원수만큼 계속 숫자 적으면됨
- 내가 부른 숫자와 숫자가 같으면 당첨

유저 클래스가 필요함 
- 인원수만큼 객체 생성
- 인원수만큼 난수 생성해서 각자 저장
- 유저들 난수 다 더함
- 턴넘어갈때마다 반복
 */

class User {
	
	String name = "";
	
	public User(String name) {
		this.name = name;
	}
	
	
	
	
}

public class zerogame {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("인원수를 적어주세요(2~5까지).");
		int num = sc.nextInt();
		
		User[] us = new User[num];
		String name = "";
		
		for(int i=0; i<us.length; i++)
		{
			us[i] = new User(name);
		}
		
	}

}
