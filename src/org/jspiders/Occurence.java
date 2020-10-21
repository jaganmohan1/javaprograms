package org.jspiders;

public class Occurence {
	static void getOccur(int arr[]) {
		int n = arr.length;
		for(int i=0; i<n; i++) {
			int count =1; 
			for(int j=i+1; j<n;j++) {
				if(arr[i]==arr[j]) {
					count++;
					arr[j] = arr[n-1];
					j--;
					n--;
				}
			}
			System.out.println(arr[i]+" occurences"+count);
		}
	}
public static void main(String[] args) {
	int arr[] = {21,33,44,55,66,77,88,9,99,88,55,444,33,33};
	getOccur(arr);
}
}
