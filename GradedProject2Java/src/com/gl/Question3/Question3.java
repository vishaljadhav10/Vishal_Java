package com.gl.Question3;

import java.util.Arrays;

public class Question3 {

	public static void main(String[] args) {

		int arr[] = new int[5];

		for (int i = 0; i < 5; i++) {
			arr[i] = i + 1;
		}

		int total = Arrays.stream(arr).filter(x -> x % 2 == 1).map(x -> x * x).sum();
		System.out.println(total);
	}

}
