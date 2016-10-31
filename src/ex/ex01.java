package ex;
/*
 * Topic: 寫一函數 square(n,c)，以 c 字元，印出邊長為 n 之實心正方形。Ex：square(3,'@') 將印出如下形狀
 @@@
 @@@
 @@@
 * Date: 2016/10/31
 * Author: 105021056 王家恩
 */
import java.util.Scanner;
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入數字");
		int v1 = scn.nextInt();
		System.out.println("請輸入字元");
		char c = scn.next().charAt(0);
		fun(v1,c);}
		public static void fun(int v,char c1){
			
			for(int i = 0;i<v;i++){
				for(int j = 0;j<v;j++){
				System.out.print(c1);	
				}
				System.out.println("");
			}

	}

}
