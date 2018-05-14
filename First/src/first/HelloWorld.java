package first;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		HelloWorld hw = new HelloWorld();
		hw.hw1();
	}
	
	public void practice() {
		Scanner sc;   //sc是變數、掃描
		sc = new Scanner(System.in);   	//把它new(實例化)出來
										//(system.in)是鍵盤上的輸入
		int a;   //a是變數
		int b;   //b是變數
		int c;   //c是變數
		a = sc.nextInt();   //sc是變數  //nextInt()是動作，會回傳int
		b = sc.nextInt();   //sc是變數  //nextInt()是動作，會回傳int
		c = sc.nextInt();   //sc是變數  //nextInt()是動作，會回傳int
		String middle;   //令(=宣告 的意思)一個字串叫middle
		middle = "middle~~~~~~";   //指定給middle一個字串
		String biggerA;   //令(=宣告 的意思)一個字串叫biggerA
		biggerA = "bigger~~~~~~";   //指定給biggerA一個字串
		String smallerC;   //令(=宣告 的意思)一個字串叫smallerC
		smallerC = "smaller~~~~~~";   //指定給smallerC一個字串
		if (a < c && c < b) {   //if是假如、用來判斷條件的  //括弧內為條件式
			System.out.print(middle);   //顯示出"變數middle"裡的字串
		}
		else if (c>a) {   //else if是假如、用來判斷條件的  //括弧內為條件式
			System.out.print(biggerA);   //顯示出"變數biggerA"裡的字串
		}
		else if (c<b) {   //else if是假如、用來判斷條件的  //括弧內為條件式
			System.out.print(smallerC);   ////顯示出"變數"裡的字串
		}
	}
	public void hw1() {
		 int n;   //宣告一個int的變數
		 String nod;   //宣告一個字串
		 Scanner sc;   //宣鋯一個scanner的變數
		 sc = new Scanner(System.in);   //把它new(實例化)出來
			                         	//(system.in)是鍵盤上的輸入
		 n = sc.nextInt();   //sc是變數  //nextInt()是動作，會回傳int(產生一個數字丟給n)
		 nod = "nod! nod! nod!";   //字串設定
		 for(int a=0 ; a<n ; a++) {   //for迴圈(初始，迴圈結束的比較條件，每次迴圈結束時要做的事)
			 System.out.println(nod);   //隔行顯示出nod字串
		 }
	}
}
