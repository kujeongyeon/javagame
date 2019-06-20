package javagame;

import java.util.*;

/*
 * overriding vs overloading
 * 
 * overriding: 하위클래스가 부모의 동작방법을 변경
 * 
 */

class rule {
	
	String kababo = ""; 
	
	public void kor(int k) {
		 
		switch (k) {
		case 1:kababo = "가위"; break;
		case 2:kababo = "바위"; break;
		case 3:kababo = "보"; break;
		default:kababo ="";
			break;
		}
		
		System.out.println(kababo + "냈음.");
	}
	
	
	//계산후에 승자 리턴
	public int winner(int u,int i) {
		
		
		
		return 0;
	}
}

//셋이서 가위바위보

public class kaeubaeubo {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int uv = sc.nextInt();
		
		Random r = new Random();
		
		//int num = r.nextInt(3); //0~2출력
		double rv = Math.random();
		int iv = (int)(rv * 3) + 1; //1~3출력
		
		
		
		
		
		
		
		
	}

}
