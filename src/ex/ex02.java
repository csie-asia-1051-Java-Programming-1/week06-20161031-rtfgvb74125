package ex;
/*
 * Topic: 使用者輸入兩個整數，透過函數呼叫輸出排列組合函數 C(m,n)。公式: C(m,n) = m!/n!(m-n)!
 * Date: 2016/10/31
 * Author: 105021056 王家恩
 */
import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		fun(n,m);}
	public static void fun(int n1,int m1){
		int sum = 1;
		int sum1 = 1;
		for(int i = 0;i<m1;i++){
			sum = sum*(n1-i);
		}
		for(int j = 0;j<m1;j++){
			sum1 = sum1*(m1-j);
		}
		System.out.println((double)sum/sum1);

	}

}
