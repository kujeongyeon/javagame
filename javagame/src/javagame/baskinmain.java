package javagame;


import java.util.Scanner;

class Client {
	
	String name = "";
	boolean fall = false;
	
	public Client (String name)
	{
		this.name = name; 
	}
	public void Setfall() 
	{
		fall = true;
	}

}
 

public class baskinmain {

	public static void main(String[] args) {
		
		
		int cnt = 0;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("인원수를 입력해주세요..");
		cnt = sc.nextInt();
		if(cnt < 2) {
			System.out.println("2 이상으로 입력해주세요.");
			cnt = sc.nextInt();
		}else if(cnt > 6){
			System.out.println("6 이하로 입력해주세요.");
			cnt = sc.nextInt();
		}
		
		//이건 선언만 한거임 아래에서 객체 만들어주고 생성자 넣어줌
		Client user[] = new Client[cnt];

		for(int i=0; i<cnt; i++) 
		{
			user[i] = new Client("사람"+i);
		}
		
		
		int number = 0;
		int limit = 31;
		while(number < limit) 
		{
			for(int j=0; j<cnt; j++)
			{
				System.out.println("\n 유저 : "+user[j].name+" 님 숫자를 불러주세요.");
				int sum = sc.nextInt();
				number = number + sum;
				if(number == limit)
				{
					user[j].Setfall();
					break;
				}
				System.out.println("현재 숫자 :" + number);	
			}	
		}
		
		int tab = -1;
		for(int t=0; t<cnt; t++)
		{
			if(user[t].fall) 
			{
				tab = t;
			}
		}
		
		System.out.println("\n 걸린사람 : " + user[tab].name);
		
		
	}

}
