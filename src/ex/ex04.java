package ex;

/*
 * Topic: 撰寫一函數void square(arr)，在呼叫square(arr) 函數後，一維陣列arr 裡的每一個元素皆會被平方。例如:輸入1 3 5 7, 則輸出1  9   25  49
 * Date: 2016/10/31
 * Author: 105021056 王家恩
 */
import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("要幾個數字");
		int v1 = scn.nextInt();
		int data[] = new int[v1];

		for (int i = 0; i < v1; i++) {
			data[i] = scn.nextInt();
		}

		fun(data, v1);
	}

	public static void fun(int[] data1, int v2) {

		for (int i = 0; i < v2; i++) {
		data1[i] = (int)Math.pow(data1[i], 2);
		}

		for (int j = 0; j < v2; j++) {
			System.out.print(data1[j] + "  ");
		}

	}

}
