package javagame;

import java.util.*;

/*
 * overriding vs overloading
 */
public class kaeubaeubo {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int uv = sc.nextInt();
		
		Random r = new Random();
		
		//int num = r.nextInt(3); //0~2출력
		double rv = Math.random();
		int iv = (int)(rv * 3) + 1; //1~3출력
		
		String kababo = ""; 
		
		switch (uv) {
		case 1:kababo = "가위"; break;
		case 2:kababo = "바위"; break;
		case 3:kababo = "보"; break;
		default:kababo ="";
			break;
		}
		
		
		
		
		
	}

}
