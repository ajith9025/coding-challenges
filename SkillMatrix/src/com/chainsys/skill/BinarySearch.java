package com.chainsys.skill;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 7, 9 };
		int key = 5;

		int index = search(arr, key);

		if (index != -1) {
			System.out.println("Index of " + key + ": " + index);
		} else {
			System.out.println(key + " not found in the array.");
		}
	}

	public static int search(int[] arr, int key) {
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (arr[mid] == key) {
				return mid;
			}
			if (arr[mid] < key) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}
}
