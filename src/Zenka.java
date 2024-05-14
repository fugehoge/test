
public class Zenka {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int n = 13;
		int r = 5;
		int nCr = 1;
		
		
		/*for(int i=0;i<5;i++)
		{
			num=num*n;
			n--;
			System.out.println("nは"+num);
			
			round=round*r;
			r--;
			System.out.println("rは"+round);
			
			System.out.println("答えは"+num/round);
					
		}*/
		/*
		for(int i=1;i<r+1;i++)
		{
			
			nCr=nCr*(n-i+1)/i;
			System.out.println(nCr);

					
		}*/
		
		int ans = 1;
		  for(int i=1; i<=13 ; i++){
		    ans *= i;
		    System.out.println(ans);
		  }
		
		

	}

}
