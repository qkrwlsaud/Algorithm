package ver02;

import java.util.Scanner;

public class Solution2 {
	

	  public static int board[][]=new int[5][5]; // ?Έ??΄ ?΄κΈ? λ³΄λ
	
	 public static int solution(int[][] board, int[] moves) {
	        int answer = 0;
	        return answer;
	  }

    
    
	public static void main(String[] args) {
		

//		  int board[][]=new int[5][5]; // ?Έ??΄ ?΄κΈ? λ³΄λ
		  int moves[]=new int [10];//?¬? ?Έ ??μ§? ?Ό ? ?? ? 1000 ?΄? 

	    
	    //?Έ?? μ’λ₯? 100κ°? 
		  int doll=0;
	    
	    //?¬? ?Έ ??μ§μ΄? ?μΉ? ?? ₯ ???₯ λ³?? 
	    int crain=0;
	    
	    Scanner sc=new Scanner(System.in);

	    //λ§μ?λ§? ?Έ?±?€ ???₯ 
	    int top=0;
	    
	    //λ³΄λ? ?Έ? ?£κΈ? 
	    for(int i=0;i<board.length;i++) {
	    	
	    	for(int j=0;j<board[i].length;j++) {
	    		  doll = (int)(Math.random()*101); //??€ ?¨? 0~100 
	    			board[i][j]=doll;
	    		  	System.out.print(board[i][j] +" "); //λ°°μ΄? ??€ κ°? μΆλ ₯
	    		  	top=j;
		    	}System.out.println("\t");
	    }
	    
	    
	    
	    

	}

}
