package ex5_numberSum;

public class Solution1 {

	 public static int solution(int n) {
	        int answer = 0;
	        while(n != 0) {
	        	answer+=n%10;
	        	n=n/10;
	        }
	        return answer;
	    }
	
	public static void main(String[] args) {

		int a=987;
		a=solution(a);
		System.out.println(a);
		
	}

}
