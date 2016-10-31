package ex;
/*
 * Topic: 使用者輸入一個大正整數值，請設計一個函數fun1(n)可以計算該大數字裡的數字總合。例如:輸入: 4832 則輸出 17
 * Date: 2016/10/31
 * Author: 105021056 王家恩
 */
import java.util.Scanner;
public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		long v1 = scn.nextLong();
		int sum = 0;
		fun(v1,sum);}
	public static void fun(long v,int sum1){
		while(v>0){
			sum1 = (int)(sum1+(v%10));
			v = v/10;
		}
		System.out.println("sum1 = "+sum1);

	}

}
